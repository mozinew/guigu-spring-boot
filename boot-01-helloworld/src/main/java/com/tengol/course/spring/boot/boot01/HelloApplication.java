package com.tengol.course.spring.boot.boot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * HelloApplication
 *
 * @author dongrui
 * @date 2020/4/14 13:16
 */
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Bean
    public String hello(){
        return "hello world";
    }
}
