package com.gyt.springjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/11/1 15:44
 */
@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;
}
