package cn.boyankeji.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.boyankeji.domain.User;
import cn.boyankeji.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServie;
	
	@RequestMapping("/findAll")
	public List<User> findAllUser(){
		List<User> user = userServie.findAllUser();
		return user;
	}
}
