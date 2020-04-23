package com.tengol.course.spring.boot.boot01.config;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;




/**
 * PersonConfig
 *
 * @author dongrui
 * @date 2020/4/23 12:50
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "person")
public class PersonProperties {
    private String name;
    private Integer age;
    private Boolean boss;
    @Email
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    private Map<String,Object> addresses;
    private List<String> nicknames;
    private Dog dog;

    @Data
    public static class Dog{
        private String name;
        private Integer age;
    }
}
