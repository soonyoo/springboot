package cn.chinaunicom.service;

import cn.chinaunicom.po.Staff;

import java.util.List;

public interface StaffService {

    /**
     * 返回所有员工数据
     * @return
     */
    List<Staff> findAll();

}
