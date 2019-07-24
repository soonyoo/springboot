package cn.chinaunicom.gz.service;

import cn.chinaunicom.gz.domain.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    /**
     * 插入用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 用户信息列表
     * @return
     */
    List<User> findAll();

    /**
     * 用户信息更新
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据id查用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 删除用户
     * @param id
     */
    void deleteUserById(Integer id);








}
