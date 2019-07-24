package cn.chinaunicom.gz.web;

import cn.chinaunicom.gz.common.ChinaunicomResult;
import cn.chinaunicom.gz.domain.User;
import cn.chinaunicom.gz.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/post", method = RequestMethod.POST)
    @ResponseBody
    public ChinaunicomResult insertUser(@RequestBody User user){
        userService.insertUser(user);
        System.out.println(user);
        return ChinaunicomResult.ok("操作成功！");
    }

    @RequestMapping(value = "/user/userlist", method = RequestMethod.GET)
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("lists",list);
        return "list";
    }

    //toEditPage
    //1,转到编辑面页
    //2,数据回显
    @GetMapping("/user/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "add";
    }

    @RequestMapping(value = "/user/post", method = RequestMethod.PUT)
    @ResponseBody
    public ChinaunicomResult updateUser(@RequestBody User user){
        userService.save(user);
        return ChinaunicomResult.ok("更新成功！");
    }

    //员工删除
    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
        userService.deleteUserById(id);
        return "redirect:/user/userlist";
    }






}
