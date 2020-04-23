package com.tengol.course.spring.boot.boot01;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * HelloApplication
 *
 * @author dongrui
 * @date 2020/4/14 13:16
 */
@Slf4j
@SpringBootApplication
@AllArgsConstructor
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
        log.info("HelloApplication start successfully ......");
    }
}
