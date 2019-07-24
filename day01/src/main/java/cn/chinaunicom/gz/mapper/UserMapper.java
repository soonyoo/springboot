package cn.chinaunicom.gz.mapper;

import cn.chinaunicom.gz.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(username,age,email,phone,remark) values(#{username},#{age},#{email},#{phone},#{remark})")
    public int insertUser(User user);

    @Select("select * from user ")
    public List<User> findAll();

    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Update("update user set username=#{username},age=#{age},email=#{email},phone=#{phone},remark=#{remark} where id=#{id}")
    public int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    public int deleteUserById(Integer id);

}
