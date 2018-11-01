package com.gyt.springjpa.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/11/1 15:23
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class PersonProperties {

    private String name;

    private String age;
}
