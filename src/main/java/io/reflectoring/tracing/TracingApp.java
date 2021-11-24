package io.reflectoring.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TracingApp {

    public static void main(String[] args) {
        SpringApplication.run(TracingApp.class, args);
    }
}