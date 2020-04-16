package com.tengol.course.spring.boot.boot01.handler;

import org.springframework.stereotype.Component;

/**
 * TypeBCommandHandler
 *
 * @author dongrui
 * @date 2020/4/14 17:03
 */
@Component
public class TypeBCommandHandler implements CommandHandler {
    @Override
    public void print() {
        System.out.println("TypeBCommandHandler ...");
    }
}
