package cn.chinaunicom.gz.domain;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private Integer age;
    private String email;
    private String phone;
    private String remark;
}
