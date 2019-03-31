package com.unknow.spiderparent.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RaceInfo {
    private Integer id;

    private String raceId;

    private Integer raceType;

    private Date raceTime;

    private Integer raceNum;

    private String hostTeam;

    private String guestTeam;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String remark;

    private Map<String, Object> rates;

    public Map<String, Object> getRates() {
        return rates;
    }

    public void setRates(Map<String, Object> rates) {
        this.rates = rates;
    }

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

    public Integer getRaceType() {
        return raceType;
    }

    public void setRaceType(Integer raceType) {
        this.raceType = raceType;
    }

    public Date getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(Date raceTime) {
        this.raceTime = raceTime;
    }

    public Integer getRaceNum() {
        return raceNum;
    }

    public void setRaceNum(Integer raceNum) {
        this.raceNum = raceNum;
    }

    public String getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(String hostTeam) {
        this.hostTeam = hostTeam == null ? null : hostTeam.trim();
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam == null ? null : guestTeam.trim();
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