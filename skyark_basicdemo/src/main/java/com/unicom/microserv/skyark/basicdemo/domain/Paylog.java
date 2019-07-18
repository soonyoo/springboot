package com.unicom.microserv.skyark.basicdemo.domain;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.unicom.skyark.component.common.SkyArkPropertyNamingStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zwqsmd on 2016/6/17.
 */
@ApiModel(description = "交费信息")
@JsonNaming(SkyArkPropertyNamingStrategy.class)
public class Paylog {
    @ApiModelProperty(name = "chargeId", value = "流水", required = true, example = "1114080720081417")
    private String chargeId;
    @ApiModelProperty(name = "outerTradeId", value = "交费流水号", required = true, example = "1114080720081417")
    private String outerTradeId;
    @ApiModelProperty(name = "acctId", value = "账户标识", required = true, example = "1114080720081417")
    private String acctId;
    @ApiModelProperty(name = "provinceId", value = "省份编码", required = true, example = "11")
    private String provinceId;
    @ApiModelProperty(name = "recvFee", value = "收费金额", required = true, example = "1111")
    private String recvFee;
    @ApiModelProperty(name = "recvStaffId", value = "交易员工", required = true, example = "baiss3")
    private String recvStaffId;
    @ApiModelProperty(name = "remark", value = "备注", required = true, example = "备注")
    private String remark;

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public String getOuterTradeId() {
        return outerTradeId;
    }

    public void setOuterTradeId(String outerTradeId) {
        this.outerTradeId = outerTradeId;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getRecvFee() {
        return recvFee;
    }

    public void setRecvFee(String recvFee) {
        this.recvFee = recvFee;
    }

    public String getRecvStaffId() {
        return recvStaffId;
    }

    public void setRecvStaffId(String recvStaffId) {
        this.recvStaffId = recvStaffId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Paylog{" +
                "chargeId='" + chargeId + '\'' +
                ", outerTradeId='" + outerTradeId + '\'' +
                ", acctId='" + acctId + '\'' +
                ", recvFee='" + recvFee + '\'' +
                ", recvStaffId='" + recvStaffId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
