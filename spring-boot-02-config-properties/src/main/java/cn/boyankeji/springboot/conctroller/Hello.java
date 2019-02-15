package cn.boyankeji.springboot.conctroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class Hello {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String hello(){
        return "hello properties..."+name;
    }
}
