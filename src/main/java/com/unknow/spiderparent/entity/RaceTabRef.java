package com.unknow.spiderparent.entity;

public class RaceTabRef {
    private Integer id;

    private String raceId;

    private String mainPan;

    private String upDownSection;

    private String enterBall;

    private String asiaPan;

    private String chosen;

    private String minute;

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

    public String getMainPan() {
        return mainPan;
    }

    public void setMainPan(String mainPan) {
        this.mainPan = mainPan == null ? null : mainPan.trim();
    }

    public String getUpDownSection() {
        return upDownSection;
    }

    public void setUpDownSection(String upDownSection) {
        this.upDownSection = upDownSection == null ? null : upDownSection.trim();
    }

    public String getEnterBall() {
        return enterBall;
    }

    public void setEnterBall(String enterBall) {
        this.enterBall = enterBall == null ? null : enterBall.trim();
    }

    public String getAsiaPan() {
        return asiaPan;
    }

    public void setAsiaPan(String asiaPan) {
        this.asiaPan = asiaPan == null ? null : asiaPan.trim();
    }

    public String getChosen() {
        return chosen;
    }

    public void setChosen(String chosen) {
        this.chosen = chosen == null ? null : chosen.trim();
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute == null ? null : minute.trim();
    }
}