# Project : springboot-gvm-nonb-apireader

## App Stack:
- Java 21
- GraalVM Native
- SpringBoot Native
- Docker
- Spring Project Reactor

The application is developed to demonstrate the nonblocking approach for the event driven data processing.
API endpoints are enabled to feed the data from external API and transform the data into a new data-model
and return a streaming API response.
For the example, a public API is used - [country details](https://restcountries.com/).

## Problem Statement:
In the [microservice application architecture](https://microservices.io/patterns/microservices.html), there are processing involves to pull different model data to transform a new model data and involves to call other service to bring data.
Over the time, the source apps becomes slow in response due to multiple requests handling at the same time and client apps 
will start timing out.
Further tweaking the client app for the http connection configurations and proper load tests allow to resolve it. Still, these socket time out appears occasionally.

Within the developers local environment and with debugging support, running the springboot applicaiton is nearly impossible to mimic the environment and reproduce the issue.

## Problem Solution:
1. With new Java21 GraalVM we can elevate the performance of the application to utilize the memory appropritely.
2. Within the dockerized environment, the application setup can help to mimic the CPU, Memory usage used in the realtime.
3. Avoid timout issues for the client call, the source api can integrated the reactive non-blocking approach


## Technologies:
* Containerized : Docker (Layered)
* SpringBoot : Spring Native
* Java : GraalVM
* Spring Webflux : Project Reactor
* Reactive Stream : Nonblocking HTTP Transports
* Reactive JSON Mapper: 3rnd party library used

## Build, Deploy, Run - Instructions
Dockerize the application
```
$ docker build -t apireader:v1.0 .
$ docker run -d -p 8080:8080 --cpu-shares=20000 --memory=200M  docker.io/library/apireader:v1.0
```
Cleanup
```
$ docker ps -a
$ docker rm -f <CONTAINER ID>
$ docker rmi <IMAGE ID>
```

# Getting Started
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/reference/html/native-image.html#native-image)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/reference/htmlsingle/index.html#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/reference/htmlsingle/index.html#web.reactive)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

### Additional Links
These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.2.1-SNAPSHOT/maven-plugin/reference/htmlsingle/#aot)


### Webclient 
Spring Web client [Spring Reactive Client](https://docs.spring.io/spring-framework/reference/web/webflux-webclient.html) (Nonblocking RestTemplate version)

#### Jetty ReactiveStream HttpClient
Reason to select this implementation - 
It is efficient and have good benchmarks on robust and high performance compared to Tomcat server. 
Read here : 
* [Reactive Http Client](https://github.com/jetty-project/jetty-reactive-httpclient)
* [Reactive Streams](https://www.reactive-streams.org/)

#### Reactive Nonblocking JSON Mapper
Webclient is allowing to add the codec,that way, Jackson decoder,encoder is added to achieve the nonblocking
to render the json to entity type

### GraalVM + Spring
Setup for graalvm for the spring native application - [Spring Native](https://docs.spring.io/spring-boot/docs/current/reference/html/native-image.html#native-image)

### Docker + SpringBoot Layered Jar 
This project contains a Docker Compose file named `compose.yaml`
The setup follows the layered configuration to be efficiently built at Docker
[A Good Tutorial here](https://www.baeldung.com/docker-layers-spring-boot) 

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

Then, you can run the app like any other container:

```
$ docker run --rm springboot-gvm-nonb-apireader:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:
```
$ target/springboot-gvm-nonb-apireader
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

