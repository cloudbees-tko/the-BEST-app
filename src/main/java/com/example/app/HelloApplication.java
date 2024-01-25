package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {

  @RequestMapping("/")
  public String home() {
    return "Yo mama!";
  }

  @RequestMapping("/{message}")
  public String subpath(@PathVariable String message) {
    return "Hello quickstart-java-app: " + message + "!";
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}
