package cn.chinaunicom.gz.service;

import cn.chinaunicom.gz.domain.Employee;

import java.util.Collection;

public interface EmployeeService {

    /**
     * 返回员工列表
     * @return
     */
    Collection<Employee> getAll();

    /**
     * 跟据Id查员工信息
     * @param id
     * @return
     */
    Employee getEmployeeById(Integer id);


}
