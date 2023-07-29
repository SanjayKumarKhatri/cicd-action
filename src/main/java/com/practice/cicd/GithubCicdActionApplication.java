package com.practice.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionApplication {

    @GetMapping("/hello")
    public String hello(){
        return "Welcome to in cicd session !!";
    }
    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionApplication.class, args);
    }

}
