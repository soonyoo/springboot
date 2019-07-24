package cn.chinaunicom.gz.service;

import cn.chinaunicom.gz.domain.Employee;

import java.util.Collection;

public interface EmployeeService {
    /**
     * 查找所有员工
     * @return
     */
    Collection<Employee> getAllEmp();

    /**
     * 通过id查询员工
     */
    Employee getEmployeeById(Integer id);
}
