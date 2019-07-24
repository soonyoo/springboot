package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.domain.User;
import cn.chinaunicom.gz.mapper.UserMapper;
import cn.chinaunicom.gz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.findAll();
        return userList;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User getUserById(Integer id) {
        User user = userMapper.getUserById(id);
        return user;
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }
}
