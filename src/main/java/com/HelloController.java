package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller.
 * @RestController is a convenience annotation that combines @Controller and @ResponseBody.
 * @Controller: Marks the class as a Spring MVC controller.
 * @ResponseBody: Indicates that the return value of methods should be directly bound to the web response body.
 */
@RestController
public class HelloController {

    /**
     * Maps HTTP GET requests to the root path "/".
     * @return A simple string message.
     */
    @GetMapping("/")
    public String sayHello() {
        return "Hello from the Spring Boot Microservice! It runs locally";
    }

    /**
     * Maps HTTP GET requests to the "/status" path.
     * @return A JSON-like string (though Spring will often convert this to proper JSON).
     */
    @GetMapping("/status")
    public String getStatus() {
        return "{\"service\":\"basic-microservice\",\"status\":\"UP\"}";
    }
}
