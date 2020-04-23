package com.tengol.course.spring.boot.boot01;

import com.alibaba.fastjson.JSON;
import com.tengol.course.spring.boot.boot01.config.PersonProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * PropertiesTest
 *
 * @author dongrui
 * @date 2020/4/23 13:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Autowired
    private PersonProperties personConfig;

    @Test
    public void test(){
        System.out.println(JSON.toJSONString(personConfig));
    }
}
