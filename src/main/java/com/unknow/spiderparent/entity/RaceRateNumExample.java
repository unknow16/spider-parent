package com.unknow.spiderparent.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaceRateNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceRateNumExample() {
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

        public Criteria andS0IsNull() {
            addCriterion("s_0 is null");
            return (Criteria) this;
        }

        public Criteria andS0IsNotNull() {
            addCriterion("s_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS0EqualTo(Double value) {
            addCriterion("s_0 =", value, "s0");
            return (Criteria) this;
        }

        public Criteria andS0NotEqualTo(Double value) {
            addCriterion("s_0 <>", value, "s0");
            return (Criteria) this;
        }

        public Criteria andS0GreaterThan(Double value) {
            addCriterion("s_0 >", value, "s0");
            return (Criteria) this;
        }

        public Criteria andS0GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0 >=", value, "s0");
            return (Criteria) this;
        }

        public Criteria andS0LessThan(Double value) {
            addCriterion("s_0 <", value, "s0");
            return (Criteria) this;
        }

        public Criteria andS0LessThanOrEqualTo(Double value) {
            addCriterion("s_0 <=", value, "s0");
            return (Criteria) this;
        }

        public Criteria andS0In(List<Double> values) {
            addCriterion("s_0 in", values, "s0");
            return (Criteria) this;
        }

        public Criteria andS0NotIn(List<Double> values) {
            addCriterion("s_0 not in", values, "s0");
            return (Criteria) this;
        }

        public Criteria andS0Between(Double value1, Double value2) {
            addCriterion("s_0 between", value1, value2, "s0");
            return (Criteria) this;
        }

        public Criteria andS0NotBetween(Double value1, Double value2) {
            addCriterion("s_0 not between", value1, value2, "s0");
            return (Criteria) this;
        }

        public Criteria andS1IsNull() {
            addCriterion("s_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1IsNotNull() {
            addCriterion("s_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1EqualTo(Double value) {
            addCriterion("s_1 =", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotEqualTo(Double value) {
            addCriterion("s_1 <>", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThan(Double value) {
            addCriterion("s_1 >", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1 >=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThan(Double value) {
            addCriterion("s_1 <", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThanOrEqualTo(Double value) {
            addCriterion("s_1 <=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1In(List<Double> values) {
            addCriterion("s_1 in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotIn(List<Double> values) {
            addCriterion("s_1 not in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Between(Double value1, Double value2) {
            addCriterion("s_1 between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotBetween(Double value1, Double value2) {
            addCriterion("s_1 not between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS2IsNull() {
            addCriterion("s_2 is null");
            return (Criteria) this;
        }

        public Criteria andS2IsNotNull() {
            addCriterion("s_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2EqualTo(Double value) {
            addCriterion("s_2 =", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotEqualTo(Double value) {
            addCriterion("s_2 <>", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThan(Double value) {
            addCriterion("s_2 >", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2 >=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThan(Double value) {
            addCriterion("s_2 <", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThanOrEqualTo(Double value) {
            addCriterion("s_2 <=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2In(List<Double> values) {
            addCriterion("s_2 in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotIn(List<Double> values) {
            addCriterion("s_2 not in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Between(Double value1, Double value2) {
            addCriterion("s_2 between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotBetween(Double value1, Double value2) {
            addCriterion("s_2 not between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS3IsNull() {
            addCriterion("s_3 is null");
            return (Criteria) this;
        }

        public Criteria andS3IsNotNull() {
            addCriterion("s_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS3EqualTo(Double value) {
            addCriterion("s_3 =", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotEqualTo(Double value) {
            addCriterion("s_3 <>", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThan(Double value) {
            addCriterion("s_3 >", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3 >=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThan(Double value) {
            addCriterion("s_3 <", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThanOrEqualTo(Double value) {
            addCriterion("s_3 <=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3In(List<Double> values) {
            addCriterion("s_3 in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotIn(List<Double> values) {
            addCriterion("s_3 not in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Between(Double value1, Double value2) {
            addCriterion("s_3 between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotBetween(Double value1, Double value2) {
            addCriterion("s_3 not between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS4IsNull() {
            addCriterion("s_4 is null");
            return (Criteria) this;
        }

        public Criteria andS4IsNotNull() {
            addCriterion("s_4 is not null");
            return (Criteria) this;
        }

        public Criteria andS4EqualTo(Double value) {
            addCriterion("s_4 =", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotEqualTo(Double value) {
            addCriterion("s_4 <>", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThan(Double value) {
            addCriterion("s_4 >", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThanOrEqualTo(Double value) {
            addCriterion("s_4 >=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThan(Double value) {
            addCriterion("s_4 <", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThanOrEqualTo(Double value) {
            addCriterion("s_4 <=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4In(List<Double> values) {
            addCriterion("s_4 in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotIn(List<Double> values) {
            addCriterion("s_4 not in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Between(Double value1, Double value2) {
            addCriterion("s_4 between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotBetween(Double value1, Double value2) {
            addCriterion("s_4 not between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS5UpIsNull() {
            addCriterion("s_5_up is null");
            return (Criteria) this;
        }

        public Criteria andS5UpIsNotNull() {
            addCriterion("s_5_up is not null");
            return (Criteria) this;
        }

        public Criteria andS5UpEqualTo(Double value) {
            addCriterion("s_5_up =", value, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpNotEqualTo(Double value) {
            addCriterion("s_5_up <>", value, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpGreaterThan(Double value) {
            addCriterion("s_5_up >", value, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpGreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_up >=", value, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpLessThan(Double value) {
            addCriterion("s_5_up <", value, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpLessThanOrEqualTo(Double value) {
            addCriterion("s_5_up <=", value, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpIn(List<Double> values) {
            addCriterion("s_5_up in", values, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpNotIn(List<Double> values) {
            addCriterion("s_5_up not in", values, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpBetween(Double value1, Double value2) {
            addCriterion("s_5_up between", value1, value2, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5UpNotBetween(Double value1, Double value2) {
            addCriterion("s_5_up not between", value1, value2, "s5Up");
            return (Criteria) this;
        }

        public Criteria andS5IsNull() {
            addCriterion("s_5 is null");
            return (Criteria) this;
        }

        public Criteria andS5IsNotNull() {
            addCriterion("s_5 is not null");
            return (Criteria) this;
        }

        public Criteria andS5EqualTo(Double value) {
            addCriterion("s_5 =", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotEqualTo(Double value) {
            addCriterion("s_5 <>", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThan(Double value) {
            addCriterion("s_5 >", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5 >=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThan(Double value) {
            addCriterion("s_5 <", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThanOrEqualTo(Double value) {
            addCriterion("s_5 <=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5In(List<Double> values) {
            addCriterion("s_5 in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotIn(List<Double> values) {
            addCriterion("s_5 not in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Between(Double value1, Double value2) {
            addCriterion("s_5 between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotBetween(Double value1, Double value2) {
            addCriterion("s_5 not between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS6IsNull() {
            addCriterion("s_6 is null");
            return (Criteria) this;
        }

        public Criteria andS6IsNotNull() {
            addCriterion("s_6 is not null");
            return (Criteria) this;
        }

        public Criteria andS6EqualTo(Double value) {
            addCriterion("s_6 =", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotEqualTo(Double value) {
            addCriterion("s_6 <>", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6GreaterThan(Double value) {
            addCriterion("s_6 >", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6 >=", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6LessThan(Double value) {
            addCriterion("s_6 <", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6LessThanOrEqualTo(Double value) {
            addCriterion("s_6 <=", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6In(List<Double> values) {
            addCriterion("s_6 in", values, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotIn(List<Double> values) {
            addCriterion("s_6 not in", values, "s6");
            return (Criteria) this;
        }

        public Criteria andS6Between(Double value1, Double value2) {
            addCriterion("s_6 between", value1, value2, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotBetween(Double value1, Double value2) {
            addCriterion("s_6 not between", value1, value2, "s6");
            return (Criteria) this;
        }

        public Criteria andS7IsNull() {
            addCriterion("s_7 is null");
            return (Criteria) this;
        }

        public Criteria andS7IsNotNull() {
            addCriterion("s_7 is not null");
            return (Criteria) this;
        }

        public Criteria andS7EqualTo(Double value) {
            addCriterion("s_7 =", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotEqualTo(Double value) {
            addCriterion("s_7 <>", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7GreaterThan(Double value) {
            addCriterion("s_7 >", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7 >=", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7LessThan(Double value) {
            addCriterion("s_7 <", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7LessThanOrEqualTo(Double value) {
            addCriterion("s_7 <=", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7In(List<Double> values) {
            addCriterion("s_7 in", values, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotIn(List<Double> values) {
            addCriterion("s_7 not in", values, "s7");
            return (Criteria) this;
        }

        public Criteria andS7Between(Double value1, Double value2) {
            addCriterion("s_7 between", value1, value2, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotBetween(Double value1, Double value2) {
            addCriterion("s_7 not between", value1, value2, "s7");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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