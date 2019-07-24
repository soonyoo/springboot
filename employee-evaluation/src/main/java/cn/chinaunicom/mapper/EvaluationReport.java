package cn.chinaunicom.mapper;

import cn.chinaunicom.po.Evaluation;
import cn.chinaunicom.po.EvaluationExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EvaluationReport {

    List<Evaluation> getEvaByMonth();
}
