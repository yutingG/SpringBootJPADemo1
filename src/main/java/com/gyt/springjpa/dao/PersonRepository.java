package com.gyt.springjpa.dao;

import com.gyt.springjpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/11/1 15:46
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

    /**
     * 通过年龄来查询
     * 方法名固定findByAge
     * @param age
     * @return
     */
    public List<Person> findByAge(Integer age);
}
