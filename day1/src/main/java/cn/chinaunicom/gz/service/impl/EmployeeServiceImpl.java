package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.dao.EmpDao;
import cn.chinaunicom.gz.domain.Employee;
import cn.chinaunicom.gz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmpDao empDao;

    @Override
    public Collection<Employee> getAllEmp() {
        Collection<Employee> list = empDao.getAll();
        return list;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return empDao.getEmployeeById(id);
    }
}
