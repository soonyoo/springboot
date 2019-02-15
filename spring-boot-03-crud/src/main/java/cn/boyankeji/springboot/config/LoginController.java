package cn.boyankeji.springboot.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class LoginController {

    //@RequestMapping(value = "user/login",method= RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session,
                        Model model) {

        if(!StringUtils.isEmpty("username") && "123456".equals(password)){
            session.setAttribute("loginUser",username);
            //return "dashboard";redirect
            return "redirect:/main.html";
        }else{
            //登陆失败
            map.put("msg","用户名或密码错误...");
            model.addAllAttributes(map);
            return "login";
        }

    }
//    @RequestMapping("/signOut")
//    public String signOut(){
//        return "index.html";
//    }

}
