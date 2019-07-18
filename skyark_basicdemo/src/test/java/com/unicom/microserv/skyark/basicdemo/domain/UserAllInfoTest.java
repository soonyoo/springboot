package com.unicom.microserv.skyark.basicdemo.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserAllInfoTest {
    @Test
    public void test() throws Exception {
        UserAllInfo userAllInfo = new UserAllInfo();
        userAllInfo.setAge(23);
        userAllInfo.setName("小刚");
        userAllInfo.setSerialNumber("18600000000");
        assertEquals(23, userAllInfo.getAge().intValue());
        assertEquals("小刚", userAllInfo.getName());
        assertEquals("18600000000", userAllInfo.getSerialNumber());
    }

}