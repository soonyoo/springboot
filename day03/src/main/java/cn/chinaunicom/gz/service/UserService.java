package cn.chinaunicom.gz.service;

import cn.chinaunicom.gz.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 用户信息列表
     * @return
     */
    List<User> findAll();

    void  insertUser(User user);

    void updateUser(User user);

    User getUserById(Integer id);

    void deleteUserById(Integer id);



}
