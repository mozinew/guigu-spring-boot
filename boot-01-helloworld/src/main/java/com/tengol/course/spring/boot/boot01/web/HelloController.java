package com.tengol.course.spring.boot.boot01.web;

import com.alibaba.fastjson.JSON;
import com.tengol.course.spring.boot.boot01.config.MyDatasourceProperties;
import com.tengol.course.spring.boot.boot01.config.PersonProperties;
import com.tengol.course.spring.boot.boot01.handler.CommandHandler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@Slf4j
@RestController
@RequestMapping(value = "/hello")
@AllArgsConstructor
public class HelloController {
    private List<CommandHandler> chs;
    private Map<String,CommandHandler> chm;
    private PersonProperties personProperties;
    private MyDatasourceProperties myDatasourceProperties;

    @GetMapping("/test")
    public void test(){
        if(Objects.nonNull(chs) && chs.size() > 0){
            chs.forEach(System.out::println);
        }
        if(Objects.nonNull(chm) && chm.size()>0){
            chm.keySet().forEach(m->{
                System.out.println(m);
                System.out.println(chm.get(m));
            });
        }
    }

    @GetMapping("/prop")
    public ResponseEntity<PersonProperties> getPersonProperties(){
        log.info("== personProperties : {}", JSON.toJSONString(personProperties));
        return ResponseEntity.ok(personProperties);
    }

    @GetMapping("/source")
    public ResponseEntity<MyDatasourceProperties> getMyDatasourceProperties(){
        return ResponseEntity.ok(myDatasourceProperties);
    }
}
