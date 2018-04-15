FROM openjdk:8-jre
MAINTAINER Varesh Tapadia

ARG JAR_FILE
ADD target/${JAR_FILE} /home/app.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "/home/app.jar"]
