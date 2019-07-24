package cn.chinaunicom.gz.web;

import cn.chinaunicom.gz.domain.Employee;
import cn.chinaunicom.gz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/list")
    @ResponseBody
    public Collection<Employee> getAllEmp(){
        Collection<Employee> allEmp = employeeService.getAllEmp();
        return allEmp;
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        Employee employeeById = employeeService.getEmployeeById(id);
        return employeeById;
    }
}
