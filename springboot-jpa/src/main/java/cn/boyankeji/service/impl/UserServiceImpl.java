package cn.boyankeji.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.boyankeji.dao.UserDao;
import cn.boyankeji.domain.User;
import cn.boyankeji.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public List<User> findAllUser() {
		return userDao.findAll();
	}
}
