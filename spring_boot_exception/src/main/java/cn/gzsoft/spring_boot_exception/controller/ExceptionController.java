package cn.gzsoft.spring_boot_exception.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xuwenyuan
 * @date: 2019-10-09
 * @desc: 测试异常类controller
 *
 */

@RestController
public class ExceptionController {

    @RequestMapping("/exce")
    public String showInfo(){
        System.err.println("dddddddddddddd");
        String info ="你好";
        int a = 1/0;
        return info;
    }


}
