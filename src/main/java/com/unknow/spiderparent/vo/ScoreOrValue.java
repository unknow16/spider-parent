package com.unknow.spiderparent.vo;

import java.util.List;
import java.util.Map;

/**
 */
public class ScoreOrValue {

    List<Integer> hostType;
    List<Integer> sessionType;
    List<Map<String, Double>> condition;

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

    public List<Map<String, Double>> getCondition() {
        return condition;
    }

    public void setCondition(List<Map<String, Double>> condition) {
        this.condition = condition;
    }
}
