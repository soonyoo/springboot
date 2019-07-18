package cn.chinaunicom.mapper;

import cn.chinaunicom.po.Evaluation;
import cn.chinaunicom.po.EvaluationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 注意此处要加Mapping注解
 */

@Mapper
public interface EvaluationMapper {
    int countByExample(EvaluationExample example);

    int deleteByExample(EvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    List<Evaluation> selectByExample(EvaluationExample example);

    Evaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}