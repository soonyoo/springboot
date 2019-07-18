package cn.chinaunicom.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Evaluation {
    private Integer id;

    private String name;

    private Float saturation;

    private Float completion;

    private Float contribution;

    private Float satisfaction;

    private Float growth;

    private Float innovation;

    private Float addition;

    private Float subtraction;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inputDate;

    private String evaluator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSaturation() {
        return saturation;
    }

    public void setSaturation(Float saturation) {
        this.saturation = saturation;
    }

    public Float getCompletion() {
        return completion;
    }

    public void setCompletion(Float completion) {
        this.completion = completion;
    }

    public Float getContribution() {
        return contribution;
    }

    public void setContribution(Float contribution) {
        this.contribution = contribution;
    }

    public Float getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Float satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Float getGrowth() {
        return growth;
    }

    public void setGrowth(Float growth) {
        this.growth = growth;
    }

    public Float getInnovation() {
        return innovation;
    }

    public void setInnovation(Float innovation) {
        this.innovation = innovation;
    }

    public Float getAddition() {
        return addition;
    }

    public void setAddition(Float addition) {
        this.addition = addition;
    }

    public Float getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(Float subtraction) {
        this.subtraction = subtraction;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(String evaluator) {
        this.evaluator = evaluator;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", saturation=" + saturation +
                ", completion=" + completion +
                ", contribution=" + contribution +
                ", satisfaction=" + satisfaction +
                ", growth=" + growth +
                ", innovation=" + innovation +
                ", addition=" + addition +
                ", subtraction=" + subtraction +
                ", inputDate=" + inputDate +
                ", evaluator='" + evaluator + '\'' +
                '}';
    }
}