package com.tengol.course.spring.boot.boot01.web;

import com.tengol.course.spring.boot.boot01.handler.CommandHandler;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * HelloController
 *
 * @author dongrui
 * @date 2020/4/14 17:04
 */
@RestController
@RequestMapping(value = "/hello")
@AllArgsConstructor
public class HelloController {

    private List<CommandHandler> chs;
    private String hello;
    private Map<String,CommandHandler> chm;

    @GetMapping("/test")
    public void test(){
        if(Objects.nonNull(chs) && chs.size() > 0){
            chs.forEach(System.out::println);
        }
        System.out.println("====" + hello);
        if(Objects.nonNull(chm) && chm.size()>0){
            chm.keySet().forEach(m->{
                System.out.println(m);
                System.out.println(chm.get(m));
            });
        }
    }
}
