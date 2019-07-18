package cn.chinaunicom.service.service.impl;

import cn.chinaunicom.bo.FrontEvaPost;
import cn.chinaunicom.common.util.DateUtil;
import cn.chinaunicom.po.Evaluation;
import cn.chinaunicom.po.EvaluationExample;
import cn.chinaunicom.service.EvaluationService;
import cn.chinaunicom.mapper.EvaluationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class EvaluationServiceImpl implements EvaluationService {




    @Autowired
    private  EvaluationMapper evaluationMapper;


    public  Evaluation getEvaluationById(Integer  id){
        Evaluation evaluation = evaluationMapper.selectByPrimaryKey(id);

        return evaluation;
    }

    @Override
    public List<Evaluation> getAllEvaluationByInputMonth(String inputMonth) {
        Date beginDate = DateUtil.StringToDate(inputMonth,"yyyy-MM");
        Date endDate = DateUtil.addMonth(beginDate,1);


        EvaluationExample evaluationExample = new EvaluationExample();
        EvaluationExample.Criteria criteria = evaluationExample.createCriteria();
        //Date begin_date =
        criteria.andInputDateBetween(beginDate,endDate);

        List<Evaluation> evaList = evaluationMapper.selectByExample(evaluationExample);

        return evaList;
    }


    /**
     * 传入数据，插入数据库
     * @param user
     * @param dList
     */

    private  void insertEva(String user,List<String>list){
        Evaluation eva = new Evaluation();
        eva.setName(list.get(0));
        eva.setSaturation(Float.valueOf(list.get(1)));
        eva.setCompletion(Float.valueOf(list.get(2)));
        eva.setContribution(Float.valueOf(list.get(3)));
        eva.setSatisfaction(Float.valueOf(list.get(4)));
        eva.setGrowth(Float.valueOf(list.get(5)));
        eva.setInnovation(Float.valueOf(list.get(6)));
        eva.setAddition(Float.valueOf(list.get(7)));
        eva.setSubtraction(Float.valueOf(list.get(8)));
        eva.setInputDate(new Date());

        eva.setEvaluator(user);
        evaluationMapper.insert(eva);
    }

    /**
     数据格式
     {
     inputName='uu',
     grade=[
     [, , , , , , , , ],
     [易阳锋, 1, 1, 1, 11, 11, 1, 1, 1],
     [黄家乐, 2, 2, 2, 2, 22, 2, 2, 2]
     ]
     }
     */

    @Override
    public void insertEvaMany(FrontEvaPost frontEvaPost) {
        List<String>  userData = (List<String>) frontEvaPost.getGrade();
        String inputUser = frontEvaPost.getInputName();
        //System.out.println("-----service-impl-----");
        //System.out.println(userData);

        for(Object list : userData.subList(1,userData.size())){
            List<String>  list1 =  (List<String>)list;
            insertEva(inputUser,list1);
        }
    }



    @Override
    public void insertEvaluation(Evaluation evaluation) {
        /*
          `name` varchar(255) NOT NULL COMMENT '被评价人',
          `saturation` float(255,0) NOT NULL COMMENT '工作饱和度',
          `completion` float(255,0) NOT NULL COMMENT '重点工作完成情况',
          `contribution` float(255,0) NOT NULL COMMENT '个人贡献',
          `satisfaction` float(255,0) NOT NULL COMMENT '内外满意度',
          `growth` float(255,0) NOT NULL COMMENT '个人成长性',
          `innovation` float(255,0) NOT NULL COMMENT '创新成果',
          `addition` float(255,0) NOT NULL COMMENT '特殊加分项',
          `subtraction` float(255,0) NOT NULL COMMENT '特殊扣分项',
          `input_date` datetime NOT NULL COMMENT '评价时间，年月',
          `evaluator` varchar(255) NOT NULL COMMENT '评价人',
        * */

        Evaluation eva = new Evaluation();
        eva.setName(evaluation.getName());
        eva.setSaturation(evaluation.getSaturation());
        eva.setCompletion(evaluation.getCompletion());
        eva.setContribution(evaluation.getContribution());
        eva.setSatisfaction(evaluation.getSatisfaction());
        eva.setGrowth(evaluation.getGrowth());
        eva.setInnovation(evaluation.getInnovation());
        eva.setAddition(evaluation.getAddition());
        eva.setSubtraction(evaluation.getSubtraction());
        eva.setInputDate(evaluation.getInputDate());
        eva.setEvaluator(evaluation.getEvaluator());

        ///System.out.println("------------------------------");
        ///System.out.println(eva);

        evaluationMapper.insert(eva);
    }

    @Override
    public List<Evaluation> getAllEva() {
        EvaluationExample evaluationExample = new EvaluationExample();
        EvaluationExample.Criteria criteria = evaluationExample.createCriteria();
        List<Evaluation> evaList = evaluationMapper.selectByExample(evaluationExample);
        return evaList;
    }



}
