package com.unicom.microserv.skyark.basicdemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserAllInfo {
    @JsonProperty("NAME")
    @ApiModelProperty(value = "NAME", name = "姓名", example = "小明")
    String name;
    @JsonProperty("AGE")
    @ApiModelProperty(value = "AGE", name = "年龄", example = "22")
    Integer age;
    @JsonProperty("SERIAL_NUMBER")
    @ApiModelProperty(value = "SERIAL_NUMBER", name = "手机号码", example = "18600000000")
    String SerialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }
}


