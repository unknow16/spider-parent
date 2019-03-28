package com.unknow.spiderparent.entity;

import java.util.ArrayList;
import java.util.List;

public class RaceTabRefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceTabRefExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRaceIdIsNull() {
            addCriterion("race_id is null");
            return (Criteria) this;
        }

        public Criteria andRaceIdIsNotNull() {
            addCriterion("race_id is not null");
            return (Criteria) this;
        }

        public Criteria andRaceIdEqualTo(String value) {
            addCriterion("race_id =", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotEqualTo(String value) {
            addCriterion("race_id <>", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdGreaterThan(String value) {
            addCriterion("race_id >", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("race_id >=", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdLessThan(String value) {
            addCriterion("race_id <", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdLessThanOrEqualTo(String value) {
            addCriterion("race_id <=", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdLike(String value) {
            addCriterion("race_id like", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotLike(String value) {
            addCriterion("race_id not like", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdIn(List<String> values) {
            addCriterion("race_id in", values, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotIn(List<String> values) {
            addCriterion("race_id not in", values, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdBetween(String value1, String value2) {
            addCriterion("race_id between", value1, value2, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotBetween(String value1, String value2) {
            addCriterion("race_id not between", value1, value2, "raceId");
            return (Criteria) this;
        }

        public Criteria andMainPanIsNull() {
            addCriterion("main_pan is null");
            return (Criteria) this;
        }

        public Criteria andMainPanIsNotNull() {
            addCriterion("main_pan is not null");
            return (Criteria) this;
        }

        public Criteria andMainPanEqualTo(String value) {
            addCriterion("main_pan =", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanNotEqualTo(String value) {
            addCriterion("main_pan <>", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanGreaterThan(String value) {
            addCriterion("main_pan >", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanGreaterThanOrEqualTo(String value) {
            addCriterion("main_pan >=", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanLessThan(String value) {
            addCriterion("main_pan <", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanLessThanOrEqualTo(String value) {
            addCriterion("main_pan <=", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanLike(String value) {
            addCriterion("main_pan like", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanNotLike(String value) {
            addCriterion("main_pan not like", value, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanIn(List<String> values) {
            addCriterion("main_pan in", values, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanNotIn(List<String> values) {
            addCriterion("main_pan not in", values, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanBetween(String value1, String value2) {
            addCriterion("main_pan between", value1, value2, "mainPan");
            return (Criteria) this;
        }

        public Criteria andMainPanNotBetween(String value1, String value2) {
            addCriterion("main_pan not between", value1, value2, "mainPan");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionIsNull() {
            addCriterion("up_down_section is null");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionIsNotNull() {
            addCriterion("up_down_section is not null");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionEqualTo(String value) {
            addCriterion("up_down_section =", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionNotEqualTo(String value) {
            addCriterion("up_down_section <>", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionGreaterThan(String value) {
            addCriterion("up_down_section >", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionGreaterThanOrEqualTo(String value) {
            addCriterion("up_down_section >=", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionLessThan(String value) {
            addCriterion("up_down_section <", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionLessThanOrEqualTo(String value) {
            addCriterion("up_down_section <=", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionLike(String value) {
            addCriterion("up_down_section like", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionNotLike(String value) {
            addCriterion("up_down_section not like", value, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionIn(List<String> values) {
            addCriterion("up_down_section in", values, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionNotIn(List<String> values) {
            addCriterion("up_down_section not in", values, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionBetween(String value1, String value2) {
            addCriterion("up_down_section between", value1, value2, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andUpDownSectionNotBetween(String value1, String value2) {
            addCriterion("up_down_section not between", value1, value2, "upDownSection");
            return (Criteria) this;
        }

        public Criteria andEnterBallIsNull() {
            addCriterion("enter_ball is null");
            return (Criteria) this;
        }

        public Criteria andEnterBallIsNotNull() {
            addCriterion("enter_ball is not null");
            return (Criteria) this;
        }

        public Criteria andEnterBallEqualTo(String value) {
            addCriterion("enter_ball =", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallNotEqualTo(String value) {
            addCriterion("enter_ball <>", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallGreaterThan(String value) {
            addCriterion("enter_ball >", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallGreaterThanOrEqualTo(String value) {
            addCriterion("enter_ball >=", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallLessThan(String value) {
            addCriterion("enter_ball <", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallLessThanOrEqualTo(String value) {
            addCriterion("enter_ball <=", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallLike(String value) {
            addCriterion("enter_ball like", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallNotLike(String value) {
            addCriterion("enter_ball not like", value, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallIn(List<String> values) {
            addCriterion("enter_ball in", values, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallNotIn(List<String> values) {
            addCriterion("enter_ball not in", values, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallBetween(String value1, String value2) {
            addCriterion("enter_ball between", value1, value2, "enterBall");
            return (Criteria) this;
        }

        public Criteria andEnterBallNotBetween(String value1, String value2) {
            addCriterion("enter_ball not between", value1, value2, "enterBall");
            return (Criteria) this;
        }

        public Criteria andAsiaPanIsNull() {
            addCriterion("asia_pan is null");
            return (Criteria) this;
        }

        public Criteria andAsiaPanIsNotNull() {
            addCriterion("asia_pan is not null");
            return (Criteria) this;
        }

        public Criteria andAsiaPanEqualTo(String value) {
            addCriterion("asia_pan =", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanNotEqualTo(String value) {
            addCriterion("asia_pan <>", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanGreaterThan(String value) {
            addCriterion("asia_pan >", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanGreaterThanOrEqualTo(String value) {
            addCriterion("asia_pan >=", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanLessThan(String value) {
            addCriterion("asia_pan <", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanLessThanOrEqualTo(String value) {
            addCriterion("asia_pan <=", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanLike(String value) {
            addCriterion("asia_pan like", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanNotLike(String value) {
            addCriterion("asia_pan not like", value, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanIn(List<String> values) {
            addCriterion("asia_pan in", values, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanNotIn(List<String> values) {
            addCriterion("asia_pan not in", values, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanBetween(String value1, String value2) {
            addCriterion("asia_pan between", value1, value2, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andAsiaPanNotBetween(String value1, String value2) {
            addCriterion("asia_pan not between", value1, value2, "asiaPan");
            return (Criteria) this;
        }

        public Criteria andChosenIsNull() {
            addCriterion("chosen is null");
            return (Criteria) this;
        }

        public Criteria andChosenIsNotNull() {
            addCriterion("chosen is not null");
            return (Criteria) this;
        }

        public Criteria andChosenEqualTo(String value) {
            addCriterion("chosen =", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenNotEqualTo(String value) {
            addCriterion("chosen <>", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenGreaterThan(String value) {
            addCriterion("chosen >", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenGreaterThanOrEqualTo(String value) {
            addCriterion("chosen >=", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenLessThan(String value) {
            addCriterion("chosen <", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenLessThanOrEqualTo(String value) {
            addCriterion("chosen <=", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenLike(String value) {
            addCriterion("chosen like", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenNotLike(String value) {
            addCriterion("chosen not like", value, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenIn(List<String> values) {
            addCriterion("chosen in", values, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenNotIn(List<String> values) {
            addCriterion("chosen not in", values, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenBetween(String value1, String value2) {
            addCriterion("chosen between", value1, value2, "chosen");
            return (Criteria) this;
        }

        public Criteria andChosenNotBetween(String value1, String value2) {
            addCriterion("chosen not between", value1, value2, "chosen");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNull() {
            addCriterion("minute is null");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNotNull() {
            addCriterion("minute is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteEqualTo(String value) {
            addCriterion("minute =", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotEqualTo(String value) {
            addCriterion("minute <>", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThan(String value) {
            addCriterion("minute >", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThanOrEqualTo(String value) {
            addCriterion("minute >=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThan(String value) {
            addCriterion("minute <", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThanOrEqualTo(String value) {
            addCriterion("minute <=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLike(String value) {
            addCriterion("minute like", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotLike(String value) {
            addCriterion("minute not like", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteIn(List<String> values) {
            addCriterion("minute in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotIn(List<String> values) {
            addCriterion("minute not in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteBetween(String value1, String value2) {
            addCriterion("minute between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotBetween(String value1, String value2) {
            addCriterion("minute not between", value1, value2, "minute");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}