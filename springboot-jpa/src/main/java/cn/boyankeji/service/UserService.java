package cn.boyankeji.service;

import java.util.List;

import cn.boyankeji.domain.User;

/*用户的业务层接口*/
public interface UserService {

	//查询所有用户
	List<User> findAllUser();
}
