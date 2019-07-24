package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.dao.EmployeeDao;
import cn.chinaunicom.gz.domain.Employee;
import cn.chinaunicom.gz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;



    @Override
    public Collection<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeDao.getEmployeeById(id);

    }
}
