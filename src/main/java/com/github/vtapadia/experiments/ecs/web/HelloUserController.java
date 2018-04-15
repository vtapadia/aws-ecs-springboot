package com.github.vtapadia.experiments.ecs.web;

import com.github.vtapadia.experiments.ecs.web.resource.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 */
@RestController
@RequestMapping("/api/v1")
public class HelloUserController {

    @GetMapping("/hello/{user}")
    public Flux<Message> allMessages(@PathVariable String user) {
        return Flux.just(new Message("Hello"), new Message(user), new Message("world"));
    }

}
