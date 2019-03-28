package com.unknow.spiderparent.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceInfoExample() {
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

        public Criteria andRaceTypeIsNull() {
            addCriterion("race_type is null");
            return (Criteria) this;
        }

        public Criteria andRaceTypeIsNotNull() {
            addCriterion("race_type is not null");
            return (Criteria) this;
        }

        public Criteria andRaceTypeEqualTo(Integer value) {
            addCriterion("race_type =", value, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeNotEqualTo(Integer value) {
            addCriterion("race_type <>", value, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeGreaterThan(Integer value) {
            addCriterion("race_type >", value, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("race_type >=", value, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeLessThan(Integer value) {
            addCriterion("race_type <", value, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("race_type <=", value, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeIn(List<Integer> values) {
            addCriterion("race_type in", values, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeNotIn(List<Integer> values) {
            addCriterion("race_type not in", values, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeBetween(Integer value1, Integer value2) {
            addCriterion("race_type between", value1, value2, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("race_type not between", value1, value2, "raceType");
            return (Criteria) this;
        }

        public Criteria andRaceTimeIsNull() {
            addCriterion("race_time is null");
            return (Criteria) this;
        }

        public Criteria andRaceTimeIsNotNull() {
            addCriterion("race_time is not null");
            return (Criteria) this;
        }

        public Criteria andRaceTimeEqualTo(Date value) {
            addCriterion("race_time =", value, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeNotEqualTo(Date value) {
            addCriterion("race_time <>", value, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeGreaterThan(Date value) {
            addCriterion("race_time >", value, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("race_time >=", value, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeLessThan(Date value) {
            addCriterion("race_time <", value, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeLessThanOrEqualTo(Date value) {
            addCriterion("race_time <=", value, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeIn(List<Date> values) {
            addCriterion("race_time in", values, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeNotIn(List<Date> values) {
            addCriterion("race_time not in", values, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeBetween(Date value1, Date value2) {
            addCriterion("race_time between", value1, value2, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceTimeNotBetween(Date value1, Date value2) {
            addCriterion("race_time not between", value1, value2, "raceTime");
            return (Criteria) this;
        }

        public Criteria andRaceNumIsNull() {
            addCriterion("race_num is null");
            return (Criteria) this;
        }

        public Criteria andRaceNumIsNotNull() {
            addCriterion("race_num is not null");
            return (Criteria) this;
        }

        public Criteria andRaceNumEqualTo(Integer value) {
            addCriterion("race_num =", value, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumNotEqualTo(Integer value) {
            addCriterion("race_num <>", value, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumGreaterThan(Integer value) {
            addCriterion("race_num >", value, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("race_num >=", value, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumLessThan(Integer value) {
            addCriterion("race_num <", value, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumLessThanOrEqualTo(Integer value) {
            addCriterion("race_num <=", value, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumIn(List<Integer> values) {
            addCriterion("race_num in", values, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumNotIn(List<Integer> values) {
            addCriterion("race_num not in", values, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumBetween(Integer value1, Integer value2) {
            addCriterion("race_num between", value1, value2, "raceNum");
            return (Criteria) this;
        }

        public Criteria andRaceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("race_num not between", value1, value2, "raceNum");
            return (Criteria) this;
        }

        public Criteria andHostTeamIsNull() {
            addCriterion("host_team is null");
            return (Criteria) this;
        }

        public Criteria andHostTeamIsNotNull() {
            addCriterion("host_team is not null");
            return (Criteria) this;
        }

        public Criteria andHostTeamEqualTo(String value) {
            addCriterion("host_team =", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamNotEqualTo(String value) {
            addCriterion("host_team <>", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamGreaterThan(String value) {
            addCriterion("host_team >", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamGreaterThanOrEqualTo(String value) {
            addCriterion("host_team >=", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamLessThan(String value) {
            addCriterion("host_team <", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamLessThanOrEqualTo(String value) {
            addCriterion("host_team <=", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamLike(String value) {
            addCriterion("host_team like", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamNotLike(String value) {
            addCriterion("host_team not like", value, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamIn(List<String> values) {
            addCriterion("host_team in", values, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamNotIn(List<String> values) {
            addCriterion("host_team not in", values, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamBetween(String value1, String value2) {
            addCriterion("host_team between", value1, value2, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andHostTeamNotBetween(String value1, String value2) {
            addCriterion("host_team not between", value1, value2, "hostTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIsNull() {
            addCriterion("guest_team is null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIsNotNull() {
            addCriterion("guest_team is not null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamEqualTo(String value) {
            addCriterion("guest_team =", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotEqualTo(String value) {
            addCriterion("guest_team <>", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamGreaterThan(String value) {
            addCriterion("guest_team >", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamGreaterThanOrEqualTo(String value) {
            addCriterion("guest_team >=", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamLessThan(String value) {
            addCriterion("guest_team <", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamLessThanOrEqualTo(String value) {
            addCriterion("guest_team <=", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamLike(String value) {
            addCriterion("guest_team like", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotLike(String value) {
            addCriterion("guest_team not like", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIn(List<String> values) {
            addCriterion("guest_team in", values, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotIn(List<String> values) {
            addCriterion("guest_team not in", values, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamBetween(String value1, String value2) {
            addCriterion("guest_team between", value1, value2, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotBetween(String value1, String value2) {
            addCriterion("guest_team not between", value1, value2, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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