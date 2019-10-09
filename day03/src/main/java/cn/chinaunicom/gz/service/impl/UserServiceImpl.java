package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.domain.User;
import cn.chinaunicom.gz.domain.UserExample;
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
    public List<User> findAll() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        //criteria.andUsernameLike("xuwenyuan");
        //criteria.andIdEqualTo(1);

        List<User> userlist = userMapper.selectByExample(example);
        return userlist;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
