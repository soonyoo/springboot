package cn.chinaunicom.bo;

public class FrontEvaPo {


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

    private String name;

    private Float saturation;

    private Float completion;

    private Float contribution;

    private Float satisfaction;

    private Float growth;

    private Float innovation;

    private Float addition;

    private Float subtraction;



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

    @Override
    public String toString() {
        return "FrontEvaPo{" +
                "name='" + name + '\'' +
                ", saturation=" + saturation +
                ", completion=" + completion +
                ", contribution=" + contribution +
                ", satisfaction=" + satisfaction +
                ", growth=" + growth +
                ", innovation=" + innovation +
                ", addition=" + addition +
                ", subtraction=" + subtraction +
                '}';
    }
}
