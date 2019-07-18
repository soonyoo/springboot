package cn.chinaunicom.mapper;

import cn.chinaunicom.po.Staff;
import cn.chinaunicom.po.StaffExample;
import cn.chinaunicom.po.StaffKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(StaffKey key);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(StaffKey key);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}