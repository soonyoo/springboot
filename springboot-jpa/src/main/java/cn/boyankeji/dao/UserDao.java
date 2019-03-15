package cn.boyankeji.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.boyankeji.domain.User;

//用户的持久层接口
@Repository("userDao")
public interface UserDao extends JpaRepository<User,Integer> {
}
