package com.spring.springazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringAzureApplication {

    @GetMapping("/message")
    public String message(){

        return "Sringboot webapplication deployed in azure ";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureApplication.class, args);
    }

}
