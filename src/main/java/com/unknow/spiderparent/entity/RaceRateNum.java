package com.unknow.spiderparent.entity;

import java.util.Date;

public class RaceRateNum {
    private Integer id;

    private String raceId;

    private Double s0;

    private Double s1;

    private Double s2;

    private Double s3;

    private Double s4;

    private Double s5Up;

    private Double s5;

    private Double s6;

    private Double s7;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaceId() {
        return raceId;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId == null ? null : raceId.trim();
    }

    public Double getS0() {
        return s0;
    }

    public void setS0(Double s0) {
        this.s0 = s0;
    }

    public Double getS1() {
        return s1;
    }

    public void setS1(Double s1) {
        this.s1 = s1;
    }

    public Double getS2() {
        return s2;
    }

    public void setS2(Double s2) {
        this.s2 = s2;
    }

    public Double getS3() {
        return s3;
    }

    public void setS3(Double s3) {
        this.s3 = s3;
    }

    public Double getS4() {
        return s4;
    }

    public void setS4(Double s4) {
        this.s4 = s4;
    }

    public Double getS5Up() {
        return s5Up;
    }

    public void setS5Up(Double s5Up) {
        this.s5Up = s5Up;
    }

    public Double getS5() {
        return s5;
    }

    public void setS5(Double s5) {
        this.s5 = s5;
    }

    public Double getS6() {
        return s6;
    }

    public void setS6(Double s6) {
        this.s6 = s6;
    }

    public Double getS7() {
        return s7;
    }

    public void setS7(Double s7) {
        this.s7 = s7;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}