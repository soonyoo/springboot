package cn.boyankeji.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.boyankeji.domain.User;

//�û��ĳ־ò�ӿ�
@Repository("userDao")
public interface UserDao extends JpaRepository<User,Integer> {
}
