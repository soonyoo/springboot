package cn.chinaunicom.gz.service;

import cn.chinaunicom.gz.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 数据插入
     * @param user
     */
    void insertUser(User user);

    /**
     * 查询所有用户
     */
    List<User> findAll();

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 更新用户信息
     * @param user
     */
    void save(User user);


    void deleteUserById(Integer id);




}
