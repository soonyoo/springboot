package cn.chinaunicom.po;

import java.util.Date;

public class Plandone {
    private Integer id;

    private String name;

    private String plan;

    private String complete;

    private Date plandate;

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
        this.name = name == null ? null : name.trim();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete == null ? null : complete.trim();
    }

    public Date getPlandate() {
        return plandate;
    }

    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }
}