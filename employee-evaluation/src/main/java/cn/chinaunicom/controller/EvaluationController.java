package cn.chinaunicom.controller;


import cn.chinaunicom.bo.FrontEvaPo;
import cn.chinaunicom.bo.FrontEvaPost;
import cn.chinaunicom.common.TaotaoResult;
import cn.chinaunicom.po.Evaluation;
import cn.chinaunicom.po.Staff;
import cn.chinaunicom.service.EvaluationService;
import cn.chinaunicom.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;

    @Autowired
    private StaffService staffService;

    /**
     * 根据id查询评价数据（用于测试）
     * @param id
     * @return
     */
    @GetMapping("/emp/{id}")
    @ResponseBody
    public Evaluation getEvaluationById(@PathVariable("id") Integer id){
        return evaluationService.getEvaluationById(id);
    }

    /**
     * 视图页面跳转
     * @param page
     * @return
     */
    @GetMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}

    /**
     * 查询所有员工数据，返回json数组
     * @return
     */
	@GetMapping("/emp/list")
    @ResponseBody
    public List<Staff> findAll(){
       return staffService.findAll();
    }

    /**
     * 转到添加员工页面，把员工数据封装到页面展示。
     * @param model
     * @return
     */
    @GetMapping("/emp/add")
    public String add(Model model){
        List userList = staffService.findAll();
        model.addAttribute("userList",userList);
        return "add";
    }

    /**
     * 员工添加保存
     * @param evaluation
     * @return
     */
    @PostMapping("/emp/save")
    public String save(Evaluation evaluation){
        evaluationService.insertEvaluation(evaluation);
        return "success";
    }

    @GetMapping("/emp/evalist")
    @ResponseBody
    public List<Evaluation> getAllEva(){
        List<Evaluation> list = evaluationService.getAllEva();
        return list;
    }



    @PostMapping("/emp/frontdata")
    @ResponseBody
    public TaotaoResult getData(@RequestBody FrontEvaPost evaPost){
        try{
            evaluationService.insertEvaMany(evaPost);
            return TaotaoResult.ok("操作成功！");
        }
        catch(Exception e){
            e.printStackTrace();
            return TaotaoResult.ok("操作失败！");
        }
    }

    @GetMapping("/emp/evaluation/{inputMonth}")
    @ResponseBody
    public List<Evaluation> getAllEvaluationByInputMonth(@PathVariable("inputMonth") String inputMonth){
        List<Evaluation> list = evaluationService.getAllEvaluationByInputMonth(inputMonth);
        return list;
    }




}
