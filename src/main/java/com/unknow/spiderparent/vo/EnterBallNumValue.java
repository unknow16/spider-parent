package com.unknow.spiderparent.vo;

import java.util.List;
import java.util.Map;

/**
 */
public class EnterBallNumValue {
    List<Integer> type;
    List<Map<String, Double>> condition;

    public List<Integer> getType() {
        return type;
    }

    public void setType(List<Integer> type) {
        this.type = type;
    }

    public List<Map<String, Double>> getCondition() {
        return condition;
    }

    public void setCondition(List<Map<String, Double>> condition) {
        this.condition = condition;
    }
}
