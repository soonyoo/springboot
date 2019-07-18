package cn.chinaunicom.mapper;

import cn.chinaunicom.po.Plandone;
import cn.chinaunicom.po.PlandoneExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlandoneMapper {
    int countByExample(PlandoneExample example);

    int deleteByExample(PlandoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Plandone record);

    int insertSelective(Plandone record);

    List<Plandone> selectByExample(PlandoneExample example);

    Plandone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Plandone record, @Param("example") PlandoneExample example);

    int updateByExample(@Param("record") Plandone record, @Param("example") PlandoneExample example);

    int updateByPrimaryKeySelective(Plandone record);

    int updateByPrimaryKey(Plandone record);
}