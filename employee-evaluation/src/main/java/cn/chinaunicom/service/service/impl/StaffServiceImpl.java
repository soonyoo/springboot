package cn.chinaunicom.service.service.impl;

import cn.chinaunicom.mapper.StaffMapper;
import cn.chinaunicom.po.Staff;
import cn.chinaunicom.po.StaffExample;
import cn.chinaunicom.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> findAll() {
        StaffExample staffExample = new StaffExample();
        StaffExample.Criteria criteria = staffExample.createCriteria();
        //criteria.andIdBetween(1,2);
        List<Staff> staffList = staffMapper.selectByExample(staffExample);
        return staffList;
    }
}
