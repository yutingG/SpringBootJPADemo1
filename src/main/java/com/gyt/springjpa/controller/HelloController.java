package com.gyt.springjpa.controller;

import com.gyt.springjpa.entity.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/11/1 15:14
 */
@RestController
public class HelloController {

    @Autowired
    private PersonProperties personProperties;

    @GetMapping("/hello")
    public String Hello() {
        return personProperties.getName() + " , " + personProperties.getAge();
    }
}
