package cn.chinaunicom.recharge.controller;

import cn.chinaunicom.recharge.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IvrController {

    @RequestMapping("/")
    public String hello(){
        return "are you ok?";
    }

    @RequestMapping(value = "/ivr", method = RequestMethod.POST)
    @ResponseBody
    public User receive(@RequestBody User user){
        System.out.println("接收到post过来的消息...");
        return user;
    }
}
