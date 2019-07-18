package cn.chinaunicom.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;


public class FrontEvaPost {

    /**
     数据格式
     {
         inputName='uu',
         grade=[
             [, , , , , , , , ],
             [易阳锋, 1, 1, 1, 11, 11, 1, 1, 1],
             [黄家乐, 2, 2, 2, 2, 22, 2, 2, 2]
         ]
     }
     */

    private String inputName;
    private Object grade;

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public Object getGrade() {
        return grade;
    }

    public void setGrade(Object grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "FrontEvaPost{" +
                "inputName='" + inputName + '\'' +
                ", grade=" + grade +
                '}';
    }

}
