package com.unknow.spiderparent.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaceRateScoreAndExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceRateScoreAndExample() {
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

        public Criteria andS0010IsNull() {
            addCriterion("s_0_0_1_0 is null");
            return (Criteria) this;
        }

        public Criteria andS0010IsNotNull() {
            addCriterion("s_0_0_1_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS0010EqualTo(Double value) {
            addCriterion("s_0_0_1_0 =", value, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010NotEqualTo(Double value) {
            addCriterion("s_0_0_1_0 <>", value, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010GreaterThan(Double value) {
            addCriterion("s_0_0_1_0 >", value, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_0 >=", value, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010LessThan(Double value) {
            addCriterion("s_0_0_1_0 <", value, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_0 <=", value, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010In(List<Double> values) {
            addCriterion("s_0_0_1_0 in", values, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010NotIn(List<Double> values) {
            addCriterion("s_0_0_1_0 not in", values, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010Between(Double value1, Double value2) {
            addCriterion("s_0_0_1_0 between", value1, value2, "s0010");
            return (Criteria) this;
        }

        public Criteria andS0010NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_1_0 not between", value1, value2, "s0010");
            return (Criteria) this;
        }

        public Criteria andS1010IsNull() {
            addCriterion("s_1_0_1_0 is null");
            return (Criteria) this;
        }

        public Criteria andS1010IsNotNull() {
            addCriterion("s_1_0_1_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS1010EqualTo(Double value) {
            addCriterion("s_1_0_1_0 =", value, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010NotEqualTo(Double value) {
            addCriterion("s_1_0_1_0 <>", value, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010GreaterThan(Double value) {
            addCriterion("s_1_0_1_0 >", value, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_0 >=", value, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010LessThan(Double value) {
            addCriterion("s_1_0_1_0 <", value, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_0 <=", value, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010In(List<Double> values) {
            addCriterion("s_1_0_1_0 in", values, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010NotIn(List<Double> values) {
            addCriterion("s_1_0_1_0 not in", values, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010Between(Double value1, Double value2) {
            addCriterion("s_1_0_1_0 between", value1, value2, "s1010");
            return (Criteria) this;
        }

        public Criteria andS1010NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_1_0 not between", value1, value2, "s1010");
            return (Criteria) this;
        }

        public Criteria andS0020IsNull() {
            addCriterion("s_0_0_2_0 is null");
            return (Criteria) this;
        }

        public Criteria andS0020IsNotNull() {
            addCriterion("s_0_0_2_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS0020EqualTo(Double value) {
            addCriterion("s_0_0_2_0 =", value, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020NotEqualTo(Double value) {
            addCriterion("s_0_0_2_0 <>", value, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020GreaterThan(Double value) {
            addCriterion("s_0_0_2_0 >", value, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_2_0 >=", value, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020LessThan(Double value) {
            addCriterion("s_0_0_2_0 <", value, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_2_0 <=", value, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020In(List<Double> values) {
            addCriterion("s_0_0_2_0 in", values, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020NotIn(List<Double> values) {
            addCriterion("s_0_0_2_0 not in", values, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020Between(Double value1, Double value2) {
            addCriterion("s_0_0_2_0 between", value1, value2, "s0020");
            return (Criteria) this;
        }

        public Criteria andS0020NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_2_0 not between", value1, value2, "s0020");
            return (Criteria) this;
        }

        public Criteria andS1020IsNull() {
            addCriterion("s_1_0_2_0 is null");
            return (Criteria) this;
        }

        public Criteria andS1020IsNotNull() {
            addCriterion("s_1_0_2_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS1020EqualTo(Double value) {
            addCriterion("s_1_0_2_0 =", value, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020NotEqualTo(Double value) {
            addCriterion("s_1_0_2_0 <>", value, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020GreaterThan(Double value) {
            addCriterion("s_1_0_2_0 >", value, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_2_0 >=", value, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020LessThan(Double value) {
            addCriterion("s_1_0_2_0 <", value, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_2_0 <=", value, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020In(List<Double> values) {
            addCriterion("s_1_0_2_0 in", values, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020NotIn(List<Double> values) {
            addCriterion("s_1_0_2_0 not in", values, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020Between(Double value1, Double value2) {
            addCriterion("s_1_0_2_0 between", value1, value2, "s1020");
            return (Criteria) this;
        }

        public Criteria andS1020NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_2_0 not between", value1, value2, "s1020");
            return (Criteria) this;
        }

        public Criteria andS2020IsNull() {
            addCriterion("s_2_0_2_0 is null");
            return (Criteria) this;
        }

        public Criteria andS2020IsNotNull() {
            addCriterion("s_2_0_2_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS2020EqualTo(Double value) {
            addCriterion("s_2_0_2_0 =", value, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020NotEqualTo(Double value) {
            addCriterion("s_2_0_2_0 <>", value, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020GreaterThan(Double value) {
            addCriterion("s_2_0_2_0 >", value, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_0_2_0 >=", value, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020LessThan(Double value) {
            addCriterion("s_2_0_2_0 <", value, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020LessThanOrEqualTo(Double value) {
            addCriterion("s_2_0_2_0 <=", value, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020In(List<Double> values) {
            addCriterion("s_2_0_2_0 in", values, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020NotIn(List<Double> values) {
            addCriterion("s_2_0_2_0 not in", values, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020Between(Double value1, Double value2) {
            addCriterion("s_2_0_2_0 between", value1, value2, "s2020");
            return (Criteria) this;
        }

        public Criteria andS2020NotBetween(Double value1, Double value2) {
            addCriterion("s_2_0_2_0 not between", value1, value2, "s2020");
            return (Criteria) this;
        }

        public Criteria andS1021IsNull() {
            addCriterion("s_1_0_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1021IsNotNull() {
            addCriterion("s_1_0_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1021EqualTo(Double value) {
            addCriterion("s_1_0_2_1 =", value, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021NotEqualTo(Double value) {
            addCriterion("s_1_0_2_1 <>", value, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021GreaterThan(Double value) {
            addCriterion("s_1_0_2_1 >", value, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_2_1 >=", value, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021LessThan(Double value) {
            addCriterion("s_1_0_2_1 <", value, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_2_1 <=", value, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021In(List<Double> values) {
            addCriterion("s_1_0_2_1 in", values, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021NotIn(List<Double> values) {
            addCriterion("s_1_0_2_1 not in", values, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021Between(Double value1, Double value2) {
            addCriterion("s_1_0_2_1 between", value1, value2, "s1021");
            return (Criteria) this;
        }

        public Criteria andS1021NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_2_1 not between", value1, value2, "s1021");
            return (Criteria) this;
        }

        public Criteria andS2021IsNull() {
            addCriterion("s_2_0_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS2021IsNotNull() {
            addCriterion("s_2_0_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS2021EqualTo(Double value) {
            addCriterion("s_2_0_2_1 =", value, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021NotEqualTo(Double value) {
            addCriterion("s_2_0_2_1 <>", value, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021GreaterThan(Double value) {
            addCriterion("s_2_0_2_1 >", value, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_0_2_1 >=", value, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021LessThan(Double value) {
            addCriterion("s_2_0_2_1 <", value, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021LessThanOrEqualTo(Double value) {
            addCriterion("s_2_0_2_1 <=", value, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021In(List<Double> values) {
            addCriterion("s_2_0_2_1 in", values, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021NotIn(List<Double> values) {
            addCriterion("s_2_0_2_1 not in", values, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021Between(Double value1, Double value2) {
            addCriterion("s_2_0_2_1 between", value1, value2, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2021NotBetween(Double value1, Double value2) {
            addCriterion("s_2_0_2_1 not between", value1, value2, "s2021");
            return (Criteria) this;
        }

        public Criteria andS2121IsNull() {
            addCriterion("s_2_1_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS2121IsNotNull() {
            addCriterion("s_2_1_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS2121EqualTo(Double value) {
            addCriterion("s_2_1_2_1 =", value, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121NotEqualTo(Double value) {
            addCriterion("s_2_1_2_1 <>", value, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121GreaterThan(Double value) {
            addCriterion("s_2_1_2_1 >", value, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_1_2_1 >=", value, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121LessThan(Double value) {
            addCriterion("s_2_1_2_1 <", value, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121LessThanOrEqualTo(Double value) {
            addCriterion("s_2_1_2_1 <=", value, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121In(List<Double> values) {
            addCriterion("s_2_1_2_1 in", values, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121NotIn(List<Double> values) {
            addCriterion("s_2_1_2_1 not in", values, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121Between(Double value1, Double value2) {
            addCriterion("s_2_1_2_1 between", value1, value2, "s2121");
            return (Criteria) this;
        }

        public Criteria andS2121NotBetween(Double value1, Double value2) {
            addCriterion("s_2_1_2_1 not between", value1, value2, "s2121");
            return (Criteria) this;
        }

        public Criteria andS0021IsNull() {
            addCriterion("s_0_0_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0021IsNotNull() {
            addCriterion("s_0_0_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0021EqualTo(Double value) {
            addCriterion("s_0_0_2_1 =", value, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021NotEqualTo(Double value) {
            addCriterion("s_0_0_2_1 <>", value, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021GreaterThan(Double value) {
            addCriterion("s_0_0_2_1 >", value, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_2_1 >=", value, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021LessThan(Double value) {
            addCriterion("s_0_0_2_1 <", value, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_2_1 <=", value, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021In(List<Double> values) {
            addCriterion("s_0_0_2_1 in", values, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021NotIn(List<Double> values) {
            addCriterion("s_0_0_2_1 not in", values, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021Between(Double value1, Double value2) {
            addCriterion("s_0_0_2_1 between", value1, value2, "s0021");
            return (Criteria) this;
        }

        public Criteria andS0021NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_2_1 not between", value1, value2, "s0021");
            return (Criteria) this;
        }

        public Criteria andS1121IsNull() {
            addCriterion("s_1_1_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1121IsNotNull() {
            addCriterion("s_1_1_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1121EqualTo(Double value) {
            addCriterion("s_1_1_2_1 =", value, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121NotEqualTo(Double value) {
            addCriterion("s_1_1_2_1 <>", value, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121GreaterThan(Double value) {
            addCriterion("s_1_1_2_1 >", value, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1_2_1 >=", value, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121LessThan(Double value) {
            addCriterion("s_1_1_2_1 <", value, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1_2_1 <=", value, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121In(List<Double> values) {
            addCriterion("s_1_1_2_1 in", values, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121NotIn(List<Double> values) {
            addCriterion("s_1_1_2_1 not in", values, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121Between(Double value1, Double value2) {
            addCriterion("s_1_1_2_1 between", value1, value2, "s1121");
            return (Criteria) this;
        }

        public Criteria andS1121NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1_2_1 not between", value1, value2, "s1121");
            return (Criteria) this;
        }

        public Criteria andS0121IsNull() {
            addCriterion("s_0_1_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0121IsNotNull() {
            addCriterion("s_0_1_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0121EqualTo(Double value) {
            addCriterion("s_0_1_2_1 =", value, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121NotEqualTo(Double value) {
            addCriterion("s_0_1_2_1 <>", value, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121GreaterThan(Double value) {
            addCriterion("s_0_1_2_1 >", value, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_2_1 >=", value, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121LessThan(Double value) {
            addCriterion("s_0_1_2_1 <", value, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_2_1 <=", value, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121In(List<Double> values) {
            addCriterion("s_0_1_2_1 in", values, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121NotIn(List<Double> values) {
            addCriterion("s_0_1_2_1 not in", values, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121Between(Double value1, Double value2) {
            addCriterion("s_0_1_2_1 between", value1, value2, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0121NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_2_1 not between", value1, value2, "s0121");
            return (Criteria) this;
        }

        public Criteria andS0030IsNull() {
            addCriterion("s_0_0_3_0 is null");
            return (Criteria) this;
        }

        public Criteria andS0030IsNotNull() {
            addCriterion("s_0_0_3_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS0030EqualTo(Double value) {
            addCriterion("s_0_0_3_0 =", value, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030NotEqualTo(Double value) {
            addCriterion("s_0_0_3_0 <>", value, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030GreaterThan(Double value) {
            addCriterion("s_0_0_3_0 >", value, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_3_0 >=", value, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030LessThan(Double value) {
            addCriterion("s_0_0_3_0 <", value, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_3_0 <=", value, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030In(List<Double> values) {
            addCriterion("s_0_0_3_0 in", values, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030NotIn(List<Double> values) {
            addCriterion("s_0_0_3_0 not in", values, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030Between(Double value1, Double value2) {
            addCriterion("s_0_0_3_0 between", value1, value2, "s0030");
            return (Criteria) this;
        }

        public Criteria andS0030NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_3_0 not between", value1, value2, "s0030");
            return (Criteria) this;
        }

        public Criteria andS1030IsNull() {
            addCriterion("s_1_0_3_0 is null");
            return (Criteria) this;
        }

        public Criteria andS1030IsNotNull() {
            addCriterion("s_1_0_3_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS1030EqualTo(Double value) {
            addCriterion("s_1_0_3_0 =", value, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030NotEqualTo(Double value) {
            addCriterion("s_1_0_3_0 <>", value, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030GreaterThan(Double value) {
            addCriterion("s_1_0_3_0 >", value, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_3_0 >=", value, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030LessThan(Double value) {
            addCriterion("s_1_0_3_0 <", value, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_3_0 <=", value, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030In(List<Double> values) {
            addCriterion("s_1_0_3_0 in", values, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030NotIn(List<Double> values) {
            addCriterion("s_1_0_3_0 not in", values, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030Between(Double value1, Double value2) {
            addCriterion("s_1_0_3_0 between", value1, value2, "s1030");
            return (Criteria) this;
        }

        public Criteria andS1030NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_3_0 not between", value1, value2, "s1030");
            return (Criteria) this;
        }

        public Criteria andS2030IsNull() {
            addCriterion("s_2_0_3_0 is null");
            return (Criteria) this;
        }

        public Criteria andS2030IsNotNull() {
            addCriterion("s_2_0_3_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS2030EqualTo(Double value) {
            addCriterion("s_2_0_3_0 =", value, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030NotEqualTo(Double value) {
            addCriterion("s_2_0_3_0 <>", value, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030GreaterThan(Double value) {
            addCriterion("s_2_0_3_0 >", value, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_0_3_0 >=", value, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030LessThan(Double value) {
            addCriterion("s_2_0_3_0 <", value, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030LessThanOrEqualTo(Double value) {
            addCriterion("s_2_0_3_0 <=", value, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030In(List<Double> values) {
            addCriterion("s_2_0_3_0 in", values, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030NotIn(List<Double> values) {
            addCriterion("s_2_0_3_0 not in", values, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030Between(Double value1, Double value2) {
            addCriterion("s_2_0_3_0 between", value1, value2, "s2030");
            return (Criteria) this;
        }

        public Criteria andS2030NotBetween(Double value1, Double value2) {
            addCriterion("s_2_0_3_0 not between", value1, value2, "s2030");
            return (Criteria) this;
        }

        public Criteria andS3030IsNull() {
            addCriterion("s_3_0_3_0 is null");
            return (Criteria) this;
        }

        public Criteria andS3030IsNotNull() {
            addCriterion("s_3_0_3_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS3030EqualTo(Double value) {
            addCriterion("s_3_0_3_0 =", value, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030NotEqualTo(Double value) {
            addCriterion("s_3_0_3_0 <>", value, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030GreaterThan(Double value) {
            addCriterion("s_3_0_3_0 >", value, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3_0_3_0 >=", value, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030LessThan(Double value) {
            addCriterion("s_3_0_3_0 <", value, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030LessThanOrEqualTo(Double value) {
            addCriterion("s_3_0_3_0 <=", value, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030In(List<Double> values) {
            addCriterion("s_3_0_3_0 in", values, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030NotIn(List<Double> values) {
            addCriterion("s_3_0_3_0 not in", values, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030Between(Double value1, Double value2) {
            addCriterion("s_3_0_3_0 between", value1, value2, "s3030");
            return (Criteria) this;
        }

        public Criteria andS3030NotBetween(Double value1, Double value2) {
            addCriterion("s_3_0_3_0 not between", value1, value2, "s3030");
            return (Criteria) this;
        }

        public Criteria andS0031IsNull() {
            addCriterion("s_0_0_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0031IsNotNull() {
            addCriterion("s_0_0_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0031EqualTo(Double value) {
            addCriterion("s_0_0_3_1 =", value, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031NotEqualTo(Double value) {
            addCriterion("s_0_0_3_1 <>", value, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031GreaterThan(Double value) {
            addCriterion("s_0_0_3_1 >", value, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_3_1 >=", value, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031LessThan(Double value) {
            addCriterion("s_0_0_3_1 <", value, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_3_1 <=", value, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031In(List<Double> values) {
            addCriterion("s_0_0_3_1 in", values, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031NotIn(List<Double> values) {
            addCriterion("s_0_0_3_1 not in", values, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031Between(Double value1, Double value2) {
            addCriterion("s_0_0_3_1 between", value1, value2, "s0031");
            return (Criteria) this;
        }

        public Criteria andS0031NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_3_1 not between", value1, value2, "s0031");
            return (Criteria) this;
        }

        public Criteria andS1031IsNull() {
            addCriterion("s_1_0_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1031IsNotNull() {
            addCriterion("s_1_0_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1031EqualTo(Double value) {
            addCriterion("s_1_0_3_1 =", value, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031NotEqualTo(Double value) {
            addCriterion("s_1_0_3_1 <>", value, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031GreaterThan(Double value) {
            addCriterion("s_1_0_3_1 >", value, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_3_1 >=", value, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031LessThan(Double value) {
            addCriterion("s_1_0_3_1 <", value, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_3_1 <=", value, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031In(List<Double> values) {
            addCriterion("s_1_0_3_1 in", values, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031NotIn(List<Double> values) {
            addCriterion("s_1_0_3_1 not in", values, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031Between(Double value1, Double value2) {
            addCriterion("s_1_0_3_1 between", value1, value2, "s1031");
            return (Criteria) this;
        }

        public Criteria andS1031NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_3_1 not between", value1, value2, "s1031");
            return (Criteria) this;
        }

        public Criteria andS2031IsNull() {
            addCriterion("s_2_0_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS2031IsNotNull() {
            addCriterion("s_2_0_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS2031EqualTo(Double value) {
            addCriterion("s_2_0_3_1 =", value, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031NotEqualTo(Double value) {
            addCriterion("s_2_0_3_1 <>", value, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031GreaterThan(Double value) {
            addCriterion("s_2_0_3_1 >", value, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_0_3_1 >=", value, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031LessThan(Double value) {
            addCriterion("s_2_0_3_1 <", value, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031LessThanOrEqualTo(Double value) {
            addCriterion("s_2_0_3_1 <=", value, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031In(List<Double> values) {
            addCriterion("s_2_0_3_1 in", values, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031NotIn(List<Double> values) {
            addCriterion("s_2_0_3_1 not in", values, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031Between(Double value1, Double value2) {
            addCriterion("s_2_0_3_1 between", value1, value2, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2031NotBetween(Double value1, Double value2) {
            addCriterion("s_2_0_3_1 not between", value1, value2, "s2031");
            return (Criteria) this;
        }

        public Criteria andS2131IsNull() {
            addCriterion("s_2_1_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS2131IsNotNull() {
            addCriterion("s_2_1_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS2131EqualTo(Double value) {
            addCriterion("s_2_1_3_1 =", value, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131NotEqualTo(Double value) {
            addCriterion("s_2_1_3_1 <>", value, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131GreaterThan(Double value) {
            addCriterion("s_2_1_3_1 >", value, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_1_3_1 >=", value, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131LessThan(Double value) {
            addCriterion("s_2_1_3_1 <", value, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131LessThanOrEqualTo(Double value) {
            addCriterion("s_2_1_3_1 <=", value, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131In(List<Double> values) {
            addCriterion("s_2_1_3_1 in", values, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131NotIn(List<Double> values) {
            addCriterion("s_2_1_3_1 not in", values, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131Between(Double value1, Double value2) {
            addCriterion("s_2_1_3_1 between", value1, value2, "s2131");
            return (Criteria) this;
        }

        public Criteria andS2131NotBetween(Double value1, Double value2) {
            addCriterion("s_2_1_3_1 not between", value1, value2, "s2131");
            return (Criteria) this;
        }

        public Criteria andS3031IsNull() {
            addCriterion("s_3_0_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS3031IsNotNull() {
            addCriterion("s_3_0_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS3031EqualTo(Double value) {
            addCriterion("s_3_0_3_1 =", value, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031NotEqualTo(Double value) {
            addCriterion("s_3_0_3_1 <>", value, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031GreaterThan(Double value) {
            addCriterion("s_3_0_3_1 >", value, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3_0_3_1 >=", value, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031LessThan(Double value) {
            addCriterion("s_3_0_3_1 <", value, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031LessThanOrEqualTo(Double value) {
            addCriterion("s_3_0_3_1 <=", value, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031In(List<Double> values) {
            addCriterion("s_3_0_3_1 in", values, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031NotIn(List<Double> values) {
            addCriterion("s_3_0_3_1 not in", values, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031Between(Double value1, Double value2) {
            addCriterion("s_3_0_3_1 between", value1, value2, "s3031");
            return (Criteria) this;
        }

        public Criteria andS3031NotBetween(Double value1, Double value2) {
            addCriterion("s_3_0_3_1 not between", value1, value2, "s3031");
            return (Criteria) this;
        }

        public Criteria andS1131IsNull() {
            addCriterion("s_1_1_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1131IsNotNull() {
            addCriterion("s_1_1_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1131EqualTo(Double value) {
            addCriterion("s_1_1_3_1 =", value, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131NotEqualTo(Double value) {
            addCriterion("s_1_1_3_1 <>", value, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131GreaterThan(Double value) {
            addCriterion("s_1_1_3_1 >", value, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1_3_1 >=", value, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131LessThan(Double value) {
            addCriterion("s_1_1_3_1 <", value, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1_3_1 <=", value, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131In(List<Double> values) {
            addCriterion("s_1_1_3_1 in", values, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131NotIn(List<Double> values) {
            addCriterion("s_1_1_3_1 not in", values, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131Between(Double value1, Double value2) {
            addCriterion("s_1_1_3_1 between", value1, value2, "s1131");
            return (Criteria) this;
        }

        public Criteria andS1131NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1_3_1 not between", value1, value2, "s1131");
            return (Criteria) this;
        }

        public Criteria andS0131IsNull() {
            addCriterion("s_0_1_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0131IsNotNull() {
            addCriterion("s_0_1_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0131EqualTo(Double value) {
            addCriterion("s_0_1_3_1 =", value, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131NotEqualTo(Double value) {
            addCriterion("s_0_1_3_1 <>", value, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131GreaterThan(Double value) {
            addCriterion("s_0_1_3_1 >", value, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_3_1 >=", value, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131LessThan(Double value) {
            addCriterion("s_0_1_3_1 <", value, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_3_1 <=", value, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131In(List<Double> values) {
            addCriterion("s_0_1_3_1 in", values, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131NotIn(List<Double> values) {
            addCriterion("s_0_1_3_1 not in", values, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131Between(Double value1, Double value2) {
            addCriterion("s_0_1_3_1 between", value1, value2, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0131NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_3_1 not between", value1, value2, "s0131");
            return (Criteria) this;
        }

        public Criteria andS0011IsNull() {
            addCriterion("s_0_0_1_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0011IsNotNull() {
            addCriterion("s_0_0_1_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0011EqualTo(Double value) {
            addCriterion("s_0_0_1_1 =", value, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011NotEqualTo(Double value) {
            addCriterion("s_0_0_1_1 <>", value, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011GreaterThan(Double value) {
            addCriterion("s_0_0_1_1 >", value, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_1 >=", value, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011LessThan(Double value) {
            addCriterion("s_0_0_1_1 <", value, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_1 <=", value, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011In(List<Double> values) {
            addCriterion("s_0_0_1_1 in", values, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011NotIn(List<Double> values) {
            addCriterion("s_0_0_1_1 not in", values, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011Between(Double value1, Double value2) {
            addCriterion("s_0_0_1_1 between", value1, value2, "s0011");
            return (Criteria) this;
        }

        public Criteria andS0011NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_1_1 not between", value1, value2, "s0011");
            return (Criteria) this;
        }

        public Criteria andS1111IsNull() {
            addCriterion("s_1_1_1_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1111IsNotNull() {
            addCriterion("s_1_1_1_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1111EqualTo(Double value) {
            addCriterion("s_1_1_1_1 =", value, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111NotEqualTo(Double value) {
            addCriterion("s_1_1_1_1 <>", value, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111GreaterThan(Double value) {
            addCriterion("s_1_1_1_1 >", value, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1_1_1 >=", value, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111LessThan(Double value) {
            addCriterion("s_1_1_1_1 <", value, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1_1_1 <=", value, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111In(List<Double> values) {
            addCriterion("s_1_1_1_1 in", values, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111NotIn(List<Double> values) {
            addCriterion("s_1_1_1_1 not in", values, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111Between(Double value1, Double value2) {
            addCriterion("s_1_1_1_1 between", value1, value2, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1111NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1_1_1 not between", value1, value2, "s1111");
            return (Criteria) this;
        }

        public Criteria andS1011IsNull() {
            addCriterion("s_1_0_1_1 is null");
            return (Criteria) this;
        }

        public Criteria andS1011IsNotNull() {
            addCriterion("s_1_0_1_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1011EqualTo(Double value) {
            addCriterion("s_1_0_1_1 =", value, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011NotEqualTo(Double value) {
            addCriterion("s_1_0_1_1 <>", value, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011GreaterThan(Double value) {
            addCriterion("s_1_0_1_1 >", value, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_1 >=", value, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011LessThan(Double value) {
            addCriterion("s_1_0_1_1 <", value, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_1 <=", value, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011In(List<Double> values) {
            addCriterion("s_1_0_1_1 in", values, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011NotIn(List<Double> values) {
            addCriterion("s_1_0_1_1 not in", values, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011Between(Double value1, Double value2) {
            addCriterion("s_1_0_1_1 between", value1, value2, "s1011");
            return (Criteria) this;
        }

        public Criteria andS1011NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_1_1 not between", value1, value2, "s1011");
            return (Criteria) this;
        }

        public Criteria andS0111IsNull() {
            addCriterion("s_0_1_1_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0111IsNotNull() {
            addCriterion("s_0_1_1_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0111EqualTo(Double value) {
            addCriterion("s_0_1_1_1 =", value, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111NotEqualTo(Double value) {
            addCriterion("s_0_1_1_1 <>", value, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111GreaterThan(Double value) {
            addCriterion("s_0_1_1_1 >", value, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_1_1 >=", value, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111LessThan(Double value) {
            addCriterion("s_0_1_1_1 <", value, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_1_1 <=", value, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111In(List<Double> values) {
            addCriterion("s_0_1_1_1 in", values, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111NotIn(List<Double> values) {
            addCriterion("s_0_1_1_1 not in", values, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111Between(Double value1, Double value2) {
            addCriterion("s_0_1_1_1 between", value1, value2, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0111NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_1_1 not between", value1, value2, "s0111");
            return (Criteria) this;
        }

        public Criteria andS0022IsNull() {
            addCriterion("s_0_0_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0022IsNotNull() {
            addCriterion("s_0_0_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0022EqualTo(Double value) {
            addCriterion("s_0_0_2_2 =", value, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022NotEqualTo(Double value) {
            addCriterion("s_0_0_2_2 <>", value, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022GreaterThan(Double value) {
            addCriterion("s_0_0_2_2 >", value, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_2_2 >=", value, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022LessThan(Double value) {
            addCriterion("s_0_0_2_2 <", value, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_2_2 <=", value, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022In(List<Double> values) {
            addCriterion("s_0_0_2_2 in", values, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022NotIn(List<Double> values) {
            addCriterion("s_0_0_2_2 not in", values, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022Between(Double value1, Double value2) {
            addCriterion("s_0_0_2_2 between", value1, value2, "s0022");
            return (Criteria) this;
        }

        public Criteria andS0022NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_2_2 not between", value1, value2, "s0022");
            return (Criteria) this;
        }

        public Criteria andS1122IsNull() {
            addCriterion("s_1_1_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS1122IsNotNull() {
            addCriterion("s_1_1_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS1122EqualTo(Double value) {
            addCriterion("s_1_1_2_2 =", value, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122NotEqualTo(Double value) {
            addCriterion("s_1_1_2_2 <>", value, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122GreaterThan(Double value) {
            addCriterion("s_1_1_2_2 >", value, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1_2_2 >=", value, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122LessThan(Double value) {
            addCriterion("s_1_1_2_2 <", value, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1_2_2 <=", value, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122In(List<Double> values) {
            addCriterion("s_1_1_2_2 in", values, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122NotIn(List<Double> values) {
            addCriterion("s_1_1_2_2 not in", values, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122Between(Double value1, Double value2) {
            addCriterion("s_1_1_2_2 between", value1, value2, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1122NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1_2_2 not between", value1, value2, "s1122");
            return (Criteria) this;
        }

        public Criteria andS1022IsNull() {
            addCriterion("s_1_0_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS1022IsNotNull() {
            addCriterion("s_1_0_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS1022EqualTo(Double value) {
            addCriterion("s_1_0_2_2 =", value, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022NotEqualTo(Double value) {
            addCriterion("s_1_0_2_2 <>", value, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022GreaterThan(Double value) {
            addCriterion("s_1_0_2_2 >", value, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_2_2 >=", value, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022LessThan(Double value) {
            addCriterion("s_1_0_2_2 <", value, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_2_2 <=", value, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022In(List<Double> values) {
            addCriterion("s_1_0_2_2 in", values, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022NotIn(List<Double> values) {
            addCriterion("s_1_0_2_2 not in", values, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022Between(Double value1, Double value2) {
            addCriterion("s_1_0_2_2 between", value1, value2, "s1022");
            return (Criteria) this;
        }

        public Criteria andS1022NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_2_2 not between", value1, value2, "s1022");
            return (Criteria) this;
        }

        public Criteria andS2022IsNull() {
            addCriterion("s_2_0_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS2022IsNotNull() {
            addCriterion("s_2_0_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2022EqualTo(Double value) {
            addCriterion("s_2_0_2_2 =", value, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022NotEqualTo(Double value) {
            addCriterion("s_2_0_2_2 <>", value, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022GreaterThan(Double value) {
            addCriterion("s_2_0_2_2 >", value, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_0_2_2 >=", value, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022LessThan(Double value) {
            addCriterion("s_2_0_2_2 <", value, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022LessThanOrEqualTo(Double value) {
            addCriterion("s_2_0_2_2 <=", value, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022In(List<Double> values) {
            addCriterion("s_2_0_2_2 in", values, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022NotIn(List<Double> values) {
            addCriterion("s_2_0_2_2 not in", values, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022Between(Double value1, Double value2) {
            addCriterion("s_2_0_2_2 between", value1, value2, "s2022");
            return (Criteria) this;
        }

        public Criteria andS2022NotBetween(Double value1, Double value2) {
            addCriterion("s_2_0_2_2 not between", value1, value2, "s2022");
            return (Criteria) this;
        }

        public Criteria andS0122IsNull() {
            addCriterion("s_0_1_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0122IsNotNull() {
            addCriterion("s_0_1_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0122EqualTo(Double value) {
            addCriterion("s_0_1_2_2 =", value, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122NotEqualTo(Double value) {
            addCriterion("s_0_1_2_2 <>", value, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122GreaterThan(Double value) {
            addCriterion("s_0_1_2_2 >", value, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_2_2 >=", value, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122LessThan(Double value) {
            addCriterion("s_0_1_2_2 <", value, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_2_2 <=", value, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122In(List<Double> values) {
            addCriterion("s_0_1_2_2 in", values, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122NotIn(List<Double> values) {
            addCriterion("s_0_1_2_2 not in", values, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122Between(Double value1, Double value2) {
            addCriterion("s_0_1_2_2 between", value1, value2, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0122NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_2_2 not between", value1, value2, "s0122");
            return (Criteria) this;
        }

        public Criteria andS0222IsNull() {
            addCriterion("s_0_2_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0222IsNotNull() {
            addCriterion("s_0_2_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0222EqualTo(Double value) {
            addCriterion("s_0_2_2_2 =", value, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222NotEqualTo(Double value) {
            addCriterion("s_0_2_2_2 <>", value, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222GreaterThan(Double value) {
            addCriterion("s_0_2_2_2 >", value, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_2_2_2 >=", value, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222LessThan(Double value) {
            addCriterion("s_0_2_2_2 <", value, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222LessThanOrEqualTo(Double value) {
            addCriterion("s_0_2_2_2 <=", value, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222In(List<Double> values) {
            addCriterion("s_0_2_2_2 in", values, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222NotIn(List<Double> values) {
            addCriterion("s_0_2_2_2 not in", values, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222Between(Double value1, Double value2) {
            addCriterion("s_0_2_2_2 between", value1, value2, "s0222");
            return (Criteria) this;
        }

        public Criteria andS0222NotBetween(Double value1, Double value2) {
            addCriterion("s_0_2_2_2 not between", value1, value2, "s0222");
            return (Criteria) this;
        }

        public Criteria andS2122IsNull() {
            addCriterion("s_2_1_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS2122IsNotNull() {
            addCriterion("s_2_1_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2122EqualTo(Double value) {
            addCriterion("s_2_1_2_2 =", value, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122NotEqualTo(Double value) {
            addCriterion("s_2_1_2_2 <>", value, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122GreaterThan(Double value) {
            addCriterion("s_2_1_2_2 >", value, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_1_2_2 >=", value, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122LessThan(Double value) {
            addCriterion("s_2_1_2_2 <", value, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122LessThanOrEqualTo(Double value) {
            addCriterion("s_2_1_2_2 <=", value, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122In(List<Double> values) {
            addCriterion("s_2_1_2_2 in", values, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122NotIn(List<Double> values) {
            addCriterion("s_2_1_2_2 not in", values, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122Between(Double value1, Double value2) {
            addCriterion("s_2_1_2_2 between", value1, value2, "s2122");
            return (Criteria) this;
        }

        public Criteria andS2122NotBetween(Double value1, Double value2) {
            addCriterion("s_2_1_2_2 not between", value1, value2, "s2122");
            return (Criteria) this;
        }

        public Criteria andS1222IsNull() {
            addCriterion("s_1_2_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS1222IsNotNull() {
            addCriterion("s_1_2_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS1222EqualTo(Double value) {
            addCriterion("s_1_2_2_2 =", value, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222NotEqualTo(Double value) {
            addCriterion("s_1_2_2_2 <>", value, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222GreaterThan(Double value) {
            addCriterion("s_1_2_2_2 >", value, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_2_2_2 >=", value, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222LessThan(Double value) {
            addCriterion("s_1_2_2_2 <", value, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222LessThanOrEqualTo(Double value) {
            addCriterion("s_1_2_2_2 <=", value, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222In(List<Double> values) {
            addCriterion("s_1_2_2_2 in", values, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222NotIn(List<Double> values) {
            addCriterion("s_1_2_2_2 not in", values, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222Between(Double value1, Double value2) {
            addCriterion("s_1_2_2_2 between", value1, value2, "s1222");
            return (Criteria) this;
        }

        public Criteria andS1222NotBetween(Double value1, Double value2) {
            addCriterion("s_1_2_2_2 not between", value1, value2, "s1222");
            return (Criteria) this;
        }

        public Criteria andS2222IsNull() {
            addCriterion("s_2_2_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS2222IsNotNull() {
            addCriterion("s_2_2_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2222EqualTo(Double value) {
            addCriterion("s_2_2_2_2 =", value, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222NotEqualTo(Double value) {
            addCriterion("s_2_2_2_2 <>", value, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222GreaterThan(Double value) {
            addCriterion("s_2_2_2_2 >", value, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_2_2_2 >=", value, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222LessThan(Double value) {
            addCriterion("s_2_2_2_2 <", value, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222LessThanOrEqualTo(Double value) {
            addCriterion("s_2_2_2_2 <=", value, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222In(List<Double> values) {
            addCriterion("s_2_2_2_2 in", values, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222NotIn(List<Double> values) {
            addCriterion("s_2_2_2_2 not in", values, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222Between(Double value1, Double value2) {
            addCriterion("s_2_2_2_2 between", value1, value2, "s2222");
            return (Criteria) this;
        }

        public Criteria andS2222NotBetween(Double value1, Double value2) {
            addCriterion("s_2_2_2_2 not between", value1, value2, "s2222");
            return (Criteria) this;
        }

        public Criteria andS0001IsNull() {
            addCriterion("s_0_0_0_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0001IsNotNull() {
            addCriterion("s_0_0_0_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0001EqualTo(Double value) {
            addCriterion("s_0_0_0_1 =", value, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001NotEqualTo(Double value) {
            addCriterion("s_0_0_0_1 <>", value, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001GreaterThan(Double value) {
            addCriterion("s_0_0_0_1 >", value, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_0_1 >=", value, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001LessThan(Double value) {
            addCriterion("s_0_0_0_1 <", value, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_0_1 <=", value, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001In(List<Double> values) {
            addCriterion("s_0_0_0_1 in", values, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001NotIn(List<Double> values) {
            addCriterion("s_0_0_0_1 not in", values, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001Between(Double value1, Double value2) {
            addCriterion("s_0_0_0_1 between", value1, value2, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0001NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_0_1 not between", value1, value2, "s0001");
            return (Criteria) this;
        }

        public Criteria andS0101IsNull() {
            addCriterion("s_0_1_0_1 is null");
            return (Criteria) this;
        }

        public Criteria andS0101IsNotNull() {
            addCriterion("s_0_1_0_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS0101EqualTo(Double value) {
            addCriterion("s_0_1_0_1 =", value, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101NotEqualTo(Double value) {
            addCriterion("s_0_1_0_1 <>", value, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101GreaterThan(Double value) {
            addCriterion("s_0_1_0_1 >", value, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_0_1 >=", value, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101LessThan(Double value) {
            addCriterion("s_0_1_0_1 <", value, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_0_1 <=", value, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101In(List<Double> values) {
            addCriterion("s_0_1_0_1 in", values, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101NotIn(List<Double> values) {
            addCriterion("s_0_1_0_1 not in", values, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101Between(Double value1, Double value2) {
            addCriterion("s_0_1_0_1 between", value1, value2, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0101NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_0_1 not between", value1, value2, "s0101");
            return (Criteria) this;
        }

        public Criteria andS0002IsNull() {
            addCriterion("s_0_0_0_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0002IsNotNull() {
            addCriterion("s_0_0_0_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0002EqualTo(Double value) {
            addCriterion("s_0_0_0_2 =", value, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002NotEqualTo(Double value) {
            addCriterion("s_0_0_0_2 <>", value, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002GreaterThan(Double value) {
            addCriterion("s_0_0_0_2 >", value, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_0_2 >=", value, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002LessThan(Double value) {
            addCriterion("s_0_0_0_2 <", value, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_0_2 <=", value, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002In(List<Double> values) {
            addCriterion("s_0_0_0_2 in", values, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002NotIn(List<Double> values) {
            addCriterion("s_0_0_0_2 not in", values, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002Between(Double value1, Double value2) {
            addCriterion("s_0_0_0_2 between", value1, value2, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0002NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_0_2 not between", value1, value2, "s0002");
            return (Criteria) this;
        }

        public Criteria andS0102IsNull() {
            addCriterion("s_0_1_0_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0102IsNotNull() {
            addCriterion("s_0_1_0_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0102EqualTo(Double value) {
            addCriterion("s_0_1_0_2 =", value, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102NotEqualTo(Double value) {
            addCriterion("s_0_1_0_2 <>", value, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102GreaterThan(Double value) {
            addCriterion("s_0_1_0_2 >", value, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_0_2 >=", value, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102LessThan(Double value) {
            addCriterion("s_0_1_0_2 <", value, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_0_2 <=", value, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102In(List<Double> values) {
            addCriterion("s_0_1_0_2 in", values, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102NotIn(List<Double> values) {
            addCriterion("s_0_1_0_2 not in", values, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102Between(Double value1, Double value2) {
            addCriterion("s_0_1_0_2 between", value1, value2, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0102NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_0_2 not between", value1, value2, "s0102");
            return (Criteria) this;
        }

        public Criteria andS0202IsNull() {
            addCriterion("s_0_2_0_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0202IsNotNull() {
            addCriterion("s_0_2_0_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0202EqualTo(Double value) {
            addCriterion("s_0_2_0_2 =", value, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202NotEqualTo(Double value) {
            addCriterion("s_0_2_0_2 <>", value, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202GreaterThan(Double value) {
            addCriterion("s_0_2_0_2 >", value, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_2_0_2 >=", value, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202LessThan(Double value) {
            addCriterion("s_0_2_0_2 <", value, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202LessThanOrEqualTo(Double value) {
            addCriterion("s_0_2_0_2 <=", value, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202In(List<Double> values) {
            addCriterion("s_0_2_0_2 in", values, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202NotIn(List<Double> values) {
            addCriterion("s_0_2_0_2 not in", values, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202Between(Double value1, Double value2) {
            addCriterion("s_0_2_0_2 between", value1, value2, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0202NotBetween(Double value1, Double value2) {
            addCriterion("s_0_2_0_2 not between", value1, value2, "s0202");
            return (Criteria) this;
        }

        public Criteria andS0112IsNull() {
            addCriterion("s_0_1_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0112IsNotNull() {
            addCriterion("s_0_1_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0112EqualTo(Double value) {
            addCriterion("s_0_1_1_2 =", value, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112NotEqualTo(Double value) {
            addCriterion("s_0_1_1_2 <>", value, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112GreaterThan(Double value) {
            addCriterion("s_0_1_1_2 >", value, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_1_2 >=", value, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112LessThan(Double value) {
            addCriterion("s_0_1_1_2 <", value, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_1_2 <=", value, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112In(List<Double> values) {
            addCriterion("s_0_1_1_2 in", values, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112NotIn(List<Double> values) {
            addCriterion("s_0_1_1_2 not in", values, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112Between(Double value1, Double value2) {
            addCriterion("s_0_1_1_2 between", value1, value2, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0112NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_1_2 not between", value1, value2, "s0112");
            return (Criteria) this;
        }

        public Criteria andS0212IsNull() {
            addCriterion("s_0_2_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0212IsNotNull() {
            addCriterion("s_0_2_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0212EqualTo(Double value) {
            addCriterion("s_0_2_1_2 =", value, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212NotEqualTo(Double value) {
            addCriterion("s_0_2_1_2 <>", value, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212GreaterThan(Double value) {
            addCriterion("s_0_2_1_2 >", value, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_2_1_2 >=", value, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212LessThan(Double value) {
            addCriterion("s_0_2_1_2 <", value, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212LessThanOrEqualTo(Double value) {
            addCriterion("s_0_2_1_2 <=", value, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212In(List<Double> values) {
            addCriterion("s_0_2_1_2 in", values, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212NotIn(List<Double> values) {
            addCriterion("s_0_2_1_2 not in", values, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212Between(Double value1, Double value2) {
            addCriterion("s_0_2_1_2 between", value1, value2, "s0212");
            return (Criteria) this;
        }

        public Criteria andS0212NotBetween(Double value1, Double value2) {
            addCriterion("s_0_2_1_2 not between", value1, value2, "s0212");
            return (Criteria) this;
        }

        public Criteria andS1212IsNull() {
            addCriterion("s_1_2_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andS1212IsNotNull() {
            addCriterion("s_1_2_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS1212EqualTo(Double value) {
            addCriterion("s_1_2_1_2 =", value, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212NotEqualTo(Double value) {
            addCriterion("s_1_2_1_2 <>", value, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212GreaterThan(Double value) {
            addCriterion("s_1_2_1_2 >", value, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_2_1_2 >=", value, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212LessThan(Double value) {
            addCriterion("s_1_2_1_2 <", value, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212LessThanOrEqualTo(Double value) {
            addCriterion("s_1_2_1_2 <=", value, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212In(List<Double> values) {
            addCriterion("s_1_2_1_2 in", values, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212NotIn(List<Double> values) {
            addCriterion("s_1_2_1_2 not in", values, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212Between(Double value1, Double value2) {
            addCriterion("s_1_2_1_2 between", value1, value2, "s1212");
            return (Criteria) this;
        }

        public Criteria andS1212NotBetween(Double value1, Double value2) {
            addCriterion("s_1_2_1_2 not between", value1, value2, "s1212");
            return (Criteria) this;
        }

        public Criteria andS0012IsNull() {
            addCriterion("s_0_0_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andS0012IsNotNull() {
            addCriterion("s_0_0_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS0012EqualTo(Double value) {
            addCriterion("s_0_0_1_2 =", value, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012NotEqualTo(Double value) {
            addCriterion("s_0_0_1_2 <>", value, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012GreaterThan(Double value) {
            addCriterion("s_0_0_1_2 >", value, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_2 >=", value, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012LessThan(Double value) {
            addCriterion("s_0_0_1_2 <", value, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_2 <=", value, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012In(List<Double> values) {
            addCriterion("s_0_0_1_2 in", values, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012NotIn(List<Double> values) {
            addCriterion("s_0_0_1_2 not in", values, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012Between(Double value1, Double value2) {
            addCriterion("s_0_0_1_2 between", value1, value2, "s0012");
            return (Criteria) this;
        }

        public Criteria andS0012NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_1_2 not between", value1, value2, "s0012");
            return (Criteria) this;
        }

        public Criteria andS1112IsNull() {
            addCriterion("s_1_1_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andS1112IsNotNull() {
            addCriterion("s_1_1_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS1112EqualTo(Double value) {
            addCriterion("s_1_1_1_2 =", value, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112NotEqualTo(Double value) {
            addCriterion("s_1_1_1_2 <>", value, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112GreaterThan(Double value) {
            addCriterion("s_1_1_1_2 >", value, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1_1_2 >=", value, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112LessThan(Double value) {
            addCriterion("s_1_1_1_2 <", value, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1_1_2 <=", value, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112In(List<Double> values) {
            addCriterion("s_1_1_1_2 in", values, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112NotIn(List<Double> values) {
            addCriterion("s_1_1_1_2 not in", values, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112Between(Double value1, Double value2) {
            addCriterion("s_1_1_1_2 between", value1, value2, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1112NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1_1_2 not between", value1, value2, "s1112");
            return (Criteria) this;
        }

        public Criteria andS1012IsNull() {
            addCriterion("s_1_0_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andS1012IsNotNull() {
            addCriterion("s_1_0_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS1012EqualTo(Double value) {
            addCriterion("s_1_0_1_2 =", value, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012NotEqualTo(Double value) {
            addCriterion("s_1_0_1_2 <>", value, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012GreaterThan(Double value) {
            addCriterion("s_1_0_1_2 >", value, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_2 >=", value, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012LessThan(Double value) {
            addCriterion("s_1_0_1_2 <", value, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_2 <=", value, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012In(List<Double> values) {
            addCriterion("s_1_0_1_2 in", values, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012NotIn(List<Double> values) {
            addCriterion("s_1_0_1_2 not in", values, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012Between(Double value1, Double value2) {
            addCriterion("s_1_0_1_2 between", value1, value2, "s1012");
            return (Criteria) this;
        }

        public Criteria andS1012NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_1_2 not between", value1, value2, "s1012");
            return (Criteria) this;
        }

        public Criteria andS0003IsNull() {
            addCriterion("s_0_0_0_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0003IsNotNull() {
            addCriterion("s_0_0_0_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0003EqualTo(Double value) {
            addCriterion("s_0_0_0_3 =", value, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003NotEqualTo(Double value) {
            addCriterion("s_0_0_0_3 <>", value, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003GreaterThan(Double value) {
            addCriterion("s_0_0_0_3 >", value, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_0_3 >=", value, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003LessThan(Double value) {
            addCriterion("s_0_0_0_3 <", value, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_0_3 <=", value, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003In(List<Double> values) {
            addCriterion("s_0_0_0_3 in", values, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003NotIn(List<Double> values) {
            addCriterion("s_0_0_0_3 not in", values, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003Between(Double value1, Double value2) {
            addCriterion("s_0_0_0_3 between", value1, value2, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0003NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_0_3 not between", value1, value2, "s0003");
            return (Criteria) this;
        }

        public Criteria andS0103IsNull() {
            addCriterion("s_0_1_0_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0103IsNotNull() {
            addCriterion("s_0_1_0_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0103EqualTo(Double value) {
            addCriterion("s_0_1_0_3 =", value, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103NotEqualTo(Double value) {
            addCriterion("s_0_1_0_3 <>", value, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103GreaterThan(Double value) {
            addCriterion("s_0_1_0_3 >", value, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_0_3 >=", value, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103LessThan(Double value) {
            addCriterion("s_0_1_0_3 <", value, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_0_3 <=", value, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103In(List<Double> values) {
            addCriterion("s_0_1_0_3 in", values, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103NotIn(List<Double> values) {
            addCriterion("s_0_1_0_3 not in", values, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103Between(Double value1, Double value2) {
            addCriterion("s_0_1_0_3 between", value1, value2, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0103NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_0_3 not between", value1, value2, "s0103");
            return (Criteria) this;
        }

        public Criteria andS0203IsNull() {
            addCriterion("s_0_2_0_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0203IsNotNull() {
            addCriterion("s_0_2_0_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0203EqualTo(Double value) {
            addCriterion("s_0_2_0_3 =", value, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203NotEqualTo(Double value) {
            addCriterion("s_0_2_0_3 <>", value, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203GreaterThan(Double value) {
            addCriterion("s_0_2_0_3 >", value, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_2_0_3 >=", value, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203LessThan(Double value) {
            addCriterion("s_0_2_0_3 <", value, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203LessThanOrEqualTo(Double value) {
            addCriterion("s_0_2_0_3 <=", value, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203In(List<Double> values) {
            addCriterion("s_0_2_0_3 in", values, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203NotIn(List<Double> values) {
            addCriterion("s_0_2_0_3 not in", values, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203Between(Double value1, Double value2) {
            addCriterion("s_0_2_0_3 between", value1, value2, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0203NotBetween(Double value1, Double value2) {
            addCriterion("s_0_2_0_3 not between", value1, value2, "s0203");
            return (Criteria) this;
        }

        public Criteria andS0303IsNull() {
            addCriterion("s_0_3_0_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0303IsNotNull() {
            addCriterion("s_0_3_0_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0303EqualTo(Double value) {
            addCriterion("s_0_3_0_3 =", value, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303NotEqualTo(Double value) {
            addCriterion("s_0_3_0_3 <>", value, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303GreaterThan(Double value) {
            addCriterion("s_0_3_0_3 >", value, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_3_0_3 >=", value, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303LessThan(Double value) {
            addCriterion("s_0_3_0_3 <", value, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303LessThanOrEqualTo(Double value) {
            addCriterion("s_0_3_0_3 <=", value, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303In(List<Double> values) {
            addCriterion("s_0_3_0_3 in", values, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303NotIn(List<Double> values) {
            addCriterion("s_0_3_0_3 not in", values, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303Between(Double value1, Double value2) {
            addCriterion("s_0_3_0_3 between", value1, value2, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0303NotBetween(Double value1, Double value2) {
            addCriterion("s_0_3_0_3 not between", value1, value2, "s0303");
            return (Criteria) this;
        }

        public Criteria andS0013IsNull() {
            addCriterion("s_0_0_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0013IsNotNull() {
            addCriterion("s_0_0_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0013EqualTo(Double value) {
            addCriterion("s_0_0_1_3 =", value, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013NotEqualTo(Double value) {
            addCriterion("s_0_0_1_3 <>", value, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013GreaterThan(Double value) {
            addCriterion("s_0_0_1_3 >", value, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_3 >=", value, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013LessThan(Double value) {
            addCriterion("s_0_0_1_3 <", value, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0_1_3 <=", value, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013In(List<Double> values) {
            addCriterion("s_0_0_1_3 in", values, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013NotIn(List<Double> values) {
            addCriterion("s_0_0_1_3 not in", values, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013Between(Double value1, Double value2) {
            addCriterion("s_0_0_1_3 between", value1, value2, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0013NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0_1_3 not between", value1, value2, "s0013");
            return (Criteria) this;
        }

        public Criteria andS0113IsNull() {
            addCriterion("s_0_1_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0113IsNotNull() {
            addCriterion("s_0_1_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0113EqualTo(Double value) {
            addCriterion("s_0_1_1_3 =", value, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113NotEqualTo(Double value) {
            addCriterion("s_0_1_1_3 <>", value, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113GreaterThan(Double value) {
            addCriterion("s_0_1_1_3 >", value, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_1_1_3 >=", value, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113LessThan(Double value) {
            addCriterion("s_0_1_1_3 <", value, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113LessThanOrEqualTo(Double value) {
            addCriterion("s_0_1_1_3 <=", value, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113In(List<Double> values) {
            addCriterion("s_0_1_1_3 in", values, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113NotIn(List<Double> values) {
            addCriterion("s_0_1_1_3 not in", values, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113Between(Double value1, Double value2) {
            addCriterion("s_0_1_1_3 between", value1, value2, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0113NotBetween(Double value1, Double value2) {
            addCriterion("s_0_1_1_3 not between", value1, value2, "s0113");
            return (Criteria) this;
        }

        public Criteria andS0213IsNull() {
            addCriterion("s_0_2_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0213IsNotNull() {
            addCriterion("s_0_2_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0213EqualTo(Double value) {
            addCriterion("s_0_2_1_3 =", value, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213NotEqualTo(Double value) {
            addCriterion("s_0_2_1_3 <>", value, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213GreaterThan(Double value) {
            addCriterion("s_0_2_1_3 >", value, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_2_1_3 >=", value, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213LessThan(Double value) {
            addCriterion("s_0_2_1_3 <", value, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213LessThanOrEqualTo(Double value) {
            addCriterion("s_0_2_1_3 <=", value, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213In(List<Double> values) {
            addCriterion("s_0_2_1_3 in", values, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213NotIn(List<Double> values) {
            addCriterion("s_0_2_1_3 not in", values, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213Between(Double value1, Double value2) {
            addCriterion("s_0_2_1_3 between", value1, value2, "s0213");
            return (Criteria) this;
        }

        public Criteria andS0213NotBetween(Double value1, Double value2) {
            addCriterion("s_0_2_1_3 not between", value1, value2, "s0213");
            return (Criteria) this;
        }

        public Criteria andS1213IsNull() {
            addCriterion("s_1_2_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS1213IsNotNull() {
            addCriterion("s_1_2_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS1213EqualTo(Double value) {
            addCriterion("s_1_2_1_3 =", value, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213NotEqualTo(Double value) {
            addCriterion("s_1_2_1_3 <>", value, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213GreaterThan(Double value) {
            addCriterion("s_1_2_1_3 >", value, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_2_1_3 >=", value, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213LessThan(Double value) {
            addCriterion("s_1_2_1_3 <", value, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213LessThanOrEqualTo(Double value) {
            addCriterion("s_1_2_1_3 <=", value, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213In(List<Double> values) {
            addCriterion("s_1_2_1_3 in", values, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213NotIn(List<Double> values) {
            addCriterion("s_1_2_1_3 not in", values, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213Between(Double value1, Double value2) {
            addCriterion("s_1_2_1_3 between", value1, value2, "s1213");
            return (Criteria) this;
        }

        public Criteria andS1213NotBetween(Double value1, Double value2) {
            addCriterion("s_1_2_1_3 not between", value1, value2, "s1213");
            return (Criteria) this;
        }

        public Criteria andS0313IsNull() {
            addCriterion("s_0_3_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS0313IsNotNull() {
            addCriterion("s_0_3_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS0313EqualTo(Double value) {
            addCriterion("s_0_3_1_3 =", value, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313NotEqualTo(Double value) {
            addCriterion("s_0_3_1_3 <>", value, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313GreaterThan(Double value) {
            addCriterion("s_0_3_1_3 >", value, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_3_1_3 >=", value, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313LessThan(Double value) {
            addCriterion("s_0_3_1_3 <", value, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313LessThanOrEqualTo(Double value) {
            addCriterion("s_0_3_1_3 <=", value, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313In(List<Double> values) {
            addCriterion("s_0_3_1_3 in", values, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313NotIn(List<Double> values) {
            addCriterion("s_0_3_1_3 not in", values, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313Between(Double value1, Double value2) {
            addCriterion("s_0_3_1_3 between", value1, value2, "s0313");
            return (Criteria) this;
        }

        public Criteria andS0313NotBetween(Double value1, Double value2) {
            addCriterion("s_0_3_1_3 not between", value1, value2, "s0313");
            return (Criteria) this;
        }

        public Criteria andS1113IsNull() {
            addCriterion("s_1_1_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS1113IsNotNull() {
            addCriterion("s_1_1_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS1113EqualTo(Double value) {
            addCriterion("s_1_1_1_3 =", value, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113NotEqualTo(Double value) {
            addCriterion("s_1_1_1_3 <>", value, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113GreaterThan(Double value) {
            addCriterion("s_1_1_1_3 >", value, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1_1_3 >=", value, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113LessThan(Double value) {
            addCriterion("s_1_1_1_3 <", value, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1_1_3 <=", value, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113In(List<Double> values) {
            addCriterion("s_1_1_1_3 in", values, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113NotIn(List<Double> values) {
            addCriterion("s_1_1_1_3 not in", values, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113Between(Double value1, Double value2) {
            addCriterion("s_1_1_1_3 between", value1, value2, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1113NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1_1_3 not between", value1, value2, "s1113");
            return (Criteria) this;
        }

        public Criteria andS1013IsNull() {
            addCriterion("s_1_0_1_3 is null");
            return (Criteria) this;
        }

        public Criteria andS1013IsNotNull() {
            addCriterion("s_1_0_1_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS1013EqualTo(Double value) {
            addCriterion("s_1_0_1_3 =", value, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013NotEqualTo(Double value) {
            addCriterion("s_1_0_1_3 <>", value, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013GreaterThan(Double value) {
            addCriterion("s_1_0_1_3 >", value, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_3 >=", value, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013LessThan(Double value) {
            addCriterion("s_1_0_1_3 <", value, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0_1_3 <=", value, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013In(List<Double> values) {
            addCriterion("s_1_0_1_3 in", values, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013NotIn(List<Double> values) {
            addCriterion("s_1_0_1_3 not in", values, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013Between(Double value1, Double value2) {
            addCriterion("s_1_0_1_3 between", value1, value2, "s1013");
            return (Criteria) this;
        }

        public Criteria andS1013NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0_1_3 not between", value1, value2, "s1013");
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