package cn.chinaunicom.gz.web;

import cn.chinaunicom.gz.common.ChinaunicomResult;
import cn.chinaunicom.gz.domain.User;
import cn.chinaunicom.gz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/list")
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("lists",list);
        return "list";
    }

    @RequestMapping(value = "/user/post",method = RequestMethod.POST)
    @ResponseBody
    public ChinaunicomResult insertUser(@RequestBody User user){
        userService.insertUser(user);
        return  ChinaunicomResult.ok("用户添加成功!");
    }


    //更新信息
    //1.页面跳转
    // 2.信息回显
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "add";
    }

    @RequestMapping(value = "/user/post",method = RequestMethod.PUT)
    @ResponseBody
    public ChinaunicomResult updateUser(@RequestBody User user){
        userService.updateUser(user);
        return  ChinaunicomResult.ok("用户更新成功!");
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
        userService.deleteUserById(id);
        return "redirect:/user/list";
    }




}
