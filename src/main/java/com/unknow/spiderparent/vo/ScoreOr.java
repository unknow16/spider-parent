package com.unknow.spiderparent.vo;

import java.util.List;

public class ScoreOr {
    List<Integer> hostType;
    List<Integer> sessionType;
    List<String> columns;

    public List<Integer> getHostType() {
        return hostType;
    }

    public void setHostType(List<Integer> hostType) {
        this.hostType = hostType;
    }

    public List<Integer> getSessionType() {
        return sessionType;
    }

    public void setSessionType(List<Integer> sessionType) {
        this.sessionType = sessionType;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
}