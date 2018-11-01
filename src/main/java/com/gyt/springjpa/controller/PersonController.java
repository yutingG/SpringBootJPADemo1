package com.gyt.springjpa.controller;

import com.gyt.springjpa.dao.PersonRepository;
import com.gyt.springjpa.entity.Person;
import com.gyt.springjpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/11/1 15:33
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private PersonService personService;

    /**
     * 获取所有人员信息
     */
    @GetMapping(value = "/person")
    public List<Person> personList () {
        return repository.findAll();
    }

    /**
     * 添加人员
     */
    @PostMapping(value = "/person")
    public Person personAdd(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        return repository.save(person);
    }

    /**
     * 根据Id查询某人
     */
    @GetMapping(value = "/person/{id}")
    public Person personFindOne(@PathVariable("id") Integer id) {
        return repository.getOne(id);
    }

    /**
     * 根据ID删除某个人
     * @param id
     */
    @DeleteMapping(value = "/person/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("age") Integer age,
                               @RequestParam("name") String name) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return repository.save(person);
    }

    @GetMapping("/person/age/{age}")
    public List<Person> personListByAge(@PathVariable("age") Integer age) {
        return repository.findByAge(age);
    }

    @PostMapping("/person/two")
    public void personTwo() {
        personService.insertTwo();
    }
}
