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
    private UserMapper userMapper;


    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void save(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }
}
