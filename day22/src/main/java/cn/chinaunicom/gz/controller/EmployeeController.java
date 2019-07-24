package cn.chinaunicom.gz.controller;

import cn.chinaunicom.gz.domain.Employee;
import cn.chinaunicom.gz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

//@Controller
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //
//    @GetMapping("/list")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Collection<Employee> getAll(){
        Collection<Employee> list = employeeService.getAll();
        return list;
    }

    @RequestMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        Employee emp = employeeService.getEmployeeById(id);
        return emp;
    }






}
