package cn.chinaunicom.service;

import cn.chinaunicom.bo.FrontEvaPost;
import cn.chinaunicom.po.Evaluation;

import java.util.List;


public interface EvaluationService {

    /**
     * 根据评价id，返回评价数据
     * @param id
     * @return
     */
    Evaluation getEvaluationById(Integer  id);

    List<Evaluation> getAllEvaluationByInputMonth(String inputMonth);

    List<Evaluation> getEvaluationReportByInputMonth();





    /**
     * 查找评价数据
     * @param evaluation
     */
    void insertEvaluation(Evaluation evaluation);

    List<Evaluation> getAllEva();


    /**
     * 多行数据同时插入
     * @param frontEvaPost
     */
    void insertEvaMany(FrontEvaPost frontEvaPost);




}
