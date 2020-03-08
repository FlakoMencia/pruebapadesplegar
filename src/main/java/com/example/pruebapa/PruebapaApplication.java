package com.example.pruebapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PruebapaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebapaApplication.class, args);
    }

}

@RestController
class HelloControler {

    @GetMapping("/")
    String hola() {
        return "HELOOOOOO ! ITS WORKS";
    }
}
