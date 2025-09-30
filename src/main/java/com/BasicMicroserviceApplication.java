package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class to start the Spring Boot microservice.
 * @SpringBootApplication is a convenience annotation that adds:
 * - @Configuration: Tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services in the 'com' package.
 */
@SpringBootApplication
public class BasicMicroserviceApplication {

    public static void main(String[] args) {
        // Starts the application
        SpringApplication.run(BasicMicroserviceApplication.class, args);
    }

}
