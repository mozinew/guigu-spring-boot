package com.tengol.course.spring.boot.boot01.handler;

import org.springframework.stereotype.Component;

/**
 * TypeACommnadHandler
 *
 * @author dongrui
 * @date 2020/4/14 17:02
 */
@Component
public class TypeACommandHandler implements CommandHandler {
    @Override
    public void print() {
        System.out.println("TypeACommnadHandler ...");
    }
}
