package cn.boyankeji.springboot.controller;

import cn.boyankeji.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    //@Value("${lastName}")

    @Autowired
    Person person;

    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world....."+person.toString();
    };
}
