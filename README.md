[![Build Status](https://travis-ci.org/vtapadia/aws-ecs-springboot.svg?branch=master)](https://travis-ci.org/vtapadia/aws-ecs-springboot)

# AWS ECS springboot application

Sample application to test the AWS ECS setup.
This project uses travis-ci to demonstrate the Continuous Integration and Deployment capabilities of AWS.

The project 
- Creates a web application with spring boot.
- Creates image from the spotify maven plugin.
- Uses travis-ci to build the project.
- Uses AWS CLI to publish the images to AWS ECR.
- Uses AWS CLI to execute a update service task to run the image in a container/EC2 cluster.

## AWS Setup

### AWS ECR
- Create a repository in the Elastic Container Registry UI.
> This will create the nexus/docker hub like repository management tool. 
- After the repository name, you will get all the required commands to publish the image to the ECR.
- Create a lifecycle policy that cleansup old images from the ECR.
> AWS charges for the space your images uses. To avoid this above step is a useful step.

### AWS ECS Cluster
- Use the AWS console to create a cluster and task definition to deploy the image in your cluster.
- You will have to t choose from a variety of options like the EC2 instance, the memory limits and other such things.
- Once done, this task can be executed via the aws cli to trigger a deployment task.

## Travis setup
- Setup travis with docker
- Install awscli and place the bin in the path.
- Use the commands that are provided during the image creation to push the images to the ECR.

### Setting up environment variaobles
```bash
travis encrypt AWS_ACCESS_KEY_ID=<YOUR-AWS-KEY> --add
travis encrypt AWS_SECRET_ACCESS_KEY=<YOUR-AWS-SECRET> --add
travis encrypt AWS_DEFAULT_REGION=eu-central-1 --add
```
