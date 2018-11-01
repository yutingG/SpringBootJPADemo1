package com.gyt.springjpa.service;

import com.gyt.springjpa.dao.PersonRepository;
import com.gyt.springjpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/11/1 16:18
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void insertTwo() {
        Person personA = new Person();
        personA.setAge(10);
        personA.setName("团团");
        personRepository.save(personA);

        System.out.println("已插入数据：" + personA.getName());

        Person personB = new Person();
        personB.setAge(11);
        personB.setName("圆圆");
        personRepository.save(personB);
        System.out.println("已插入数据: " + personB.getName());
    }
}

