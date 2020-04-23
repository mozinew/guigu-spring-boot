package com.tengol.course.spring.boot.boot01.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * MyDatasourceProperties
 *
 * @author dongrui
 * @date 2020/04/23
 */
@Data
@Component
@PropertySource(value = {"classpath:my-datasource.properties"})
@ConfigurationProperties(prefix = "my-datasource")
public class MyDatasourceProperties {
    private String url;
    private String username;
    private String password;
    private String driverClass;
}
