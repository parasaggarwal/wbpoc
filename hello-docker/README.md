# Hello Docker - Spring Boot Micro servcie

Docker example for Spring boot micro-service.

## Pre-requisite

  - Install Docker Toolbar - [Windows Installation].
  - Install Java 8 and Maven and GIT

## Source
Get source code:
```sh
git clone git@gitlab.com:cglean/hello-docker.git
```

## Local
Run the application locally:

```sh
cd hello-docker
mvn spring-boot:run
```

## Docker

##### Build Docker image :

Start docker deamon via Docker Quickstart Terminal shortcut.

```sh
cd hello-docker
mvn package docker:build
```

This will create the **cglean/hello-docker** Docker image. 

##### Run Docker image :

Once done, run the Docker image and map the port to whatever you wish on your host. In this example, we simply map port 8000 of the host to port 80 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 cglean/hello-docker
```

Verify the deployment by navigating to your server address in your preferred browser.

```sh
<docker-machine-ip-address>:8000
```

where ***docker-machine-ip-address*** is the IP Address of the VM which is running docker deamon. You can find the IP in Docker Quickstart Terminal when docker is started.


## Todos

 - Push the Docker image to AWS Docker Registry.
 - Document steps to access and push images to AWS Docker Registry.

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [Windows Installation]: <https://docs.docker.com/toolbox/toolbox_install_windows>
