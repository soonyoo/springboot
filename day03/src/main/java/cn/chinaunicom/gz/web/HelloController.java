package cn.chinaunicom.gz.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
       model.addAttribute("hello","您好thymeleaf");
       return "hello";
    }
}
