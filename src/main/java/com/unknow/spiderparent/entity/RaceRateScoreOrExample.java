package com.unknow.spiderparent.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaceRateScoreOrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceRateScoreOrExample() {
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

        public Criteria andS10IsNull() {
            addCriterion("s_1_0 is null");
            return (Criteria) this;
        }

        public Criteria andS10IsNotNull() {
            addCriterion("s_1_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS10EqualTo(Double value) {
            addCriterion("s_1_0 =", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotEqualTo(Double value) {
            addCriterion("s_1_0 <>", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10GreaterThan(Double value) {
            addCriterion("s_1_0 >", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_0 >=", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10LessThan(Double value) {
            addCriterion("s_1_0 <", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10LessThanOrEqualTo(Double value) {
            addCriterion("s_1_0 <=", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10In(List<Double> values) {
            addCriterion("s_1_0 in", values, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotIn(List<Double> values) {
            addCriterion("s_1_0 not in", values, "s10");
            return (Criteria) this;
        }

        public Criteria andS10Between(Double value1, Double value2) {
            addCriterion("s_1_0 between", value1, value2, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotBetween(Double value1, Double value2) {
            addCriterion("s_1_0 not between", value1, value2, "s10");
            return (Criteria) this;
        }

        public Criteria andS20IsNull() {
            addCriterion("s_2_0 is null");
            return (Criteria) this;
        }

        public Criteria andS20IsNotNull() {
            addCriterion("s_2_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS20EqualTo(Double value) {
            addCriterion("s_2_0 =", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotEqualTo(Double value) {
            addCriterion("s_2_0 <>", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20GreaterThan(Double value) {
            addCriterion("s_2_0 >", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_0 >=", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20LessThan(Double value) {
            addCriterion("s_2_0 <", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20LessThanOrEqualTo(Double value) {
            addCriterion("s_2_0 <=", value, "s20");
            return (Criteria) this;
        }

        public Criteria andS20In(List<Double> values) {
            addCriterion("s_2_0 in", values, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotIn(List<Double> values) {
            addCriterion("s_2_0 not in", values, "s20");
            return (Criteria) this;
        }

        public Criteria andS20Between(Double value1, Double value2) {
            addCriterion("s_2_0 between", value1, value2, "s20");
            return (Criteria) this;
        }

        public Criteria andS20NotBetween(Double value1, Double value2) {
            addCriterion("s_2_0 not between", value1, value2, "s20");
            return (Criteria) this;
        }

        public Criteria andS21IsNull() {
            addCriterion("s_2_1 is null");
            return (Criteria) this;
        }

        public Criteria andS21IsNotNull() {
            addCriterion("s_2_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS21EqualTo(Double value) {
            addCriterion("s_2_1 =", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotEqualTo(Double value) {
            addCriterion("s_2_1 <>", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21GreaterThan(Double value) {
            addCriterion("s_2_1 >", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_1 >=", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21LessThan(Double value) {
            addCriterion("s_2_1 <", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21LessThanOrEqualTo(Double value) {
            addCriterion("s_2_1 <=", value, "s21");
            return (Criteria) this;
        }

        public Criteria andS21In(List<Double> values) {
            addCriterion("s_2_1 in", values, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotIn(List<Double> values) {
            addCriterion("s_2_1 not in", values, "s21");
            return (Criteria) this;
        }

        public Criteria andS21Between(Double value1, Double value2) {
            addCriterion("s_2_1 between", value1, value2, "s21");
            return (Criteria) this;
        }

        public Criteria andS21NotBetween(Double value1, Double value2) {
            addCriterion("s_2_1 not between", value1, value2, "s21");
            return (Criteria) this;
        }

        public Criteria andS30IsNull() {
            addCriterion("s_3_0 is null");
            return (Criteria) this;
        }

        public Criteria andS30IsNotNull() {
            addCriterion("s_3_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS30EqualTo(Double value) {
            addCriterion("s_3_0 =", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotEqualTo(Double value) {
            addCriterion("s_3_0 <>", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30GreaterThan(Double value) {
            addCriterion("s_3_0 >", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3_0 >=", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30LessThan(Double value) {
            addCriterion("s_3_0 <", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30LessThanOrEqualTo(Double value) {
            addCriterion("s_3_0 <=", value, "s30");
            return (Criteria) this;
        }

        public Criteria andS30In(List<Double> values) {
            addCriterion("s_3_0 in", values, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotIn(List<Double> values) {
            addCriterion("s_3_0 not in", values, "s30");
            return (Criteria) this;
        }

        public Criteria andS30Between(Double value1, Double value2) {
            addCriterion("s_3_0 between", value1, value2, "s30");
            return (Criteria) this;
        }

        public Criteria andS30NotBetween(Double value1, Double value2) {
            addCriterion("s_3_0 not between", value1, value2, "s30");
            return (Criteria) this;
        }

        public Criteria andS31IsNull() {
            addCriterion("s_3_1 is null");
            return (Criteria) this;
        }

        public Criteria andS31IsNotNull() {
            addCriterion("s_3_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS31EqualTo(Double value) {
            addCriterion("s_3_1 =", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotEqualTo(Double value) {
            addCriterion("s_3_1 <>", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31GreaterThan(Double value) {
            addCriterion("s_3_1 >", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3_1 >=", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31LessThan(Double value) {
            addCriterion("s_3_1 <", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31LessThanOrEqualTo(Double value) {
            addCriterion("s_3_1 <=", value, "s31");
            return (Criteria) this;
        }

        public Criteria andS31In(List<Double> values) {
            addCriterion("s_3_1 in", values, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotIn(List<Double> values) {
            addCriterion("s_3_1 not in", values, "s31");
            return (Criteria) this;
        }

        public Criteria andS31Between(Double value1, Double value2) {
            addCriterion("s_3_1 between", value1, value2, "s31");
            return (Criteria) this;
        }

        public Criteria andS31NotBetween(Double value1, Double value2) {
            addCriterion("s_3_1 not between", value1, value2, "s31");
            return (Criteria) this;
        }

        public Criteria andS32IsNull() {
            addCriterion("s_3_2 is null");
            return (Criteria) this;
        }

        public Criteria andS32IsNotNull() {
            addCriterion("s_3_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS32EqualTo(Double value) {
            addCriterion("s_3_2 =", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotEqualTo(Double value) {
            addCriterion("s_3_2 <>", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32GreaterThan(Double value) {
            addCriterion("s_3_2 >", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3_2 >=", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32LessThan(Double value) {
            addCriterion("s_3_2 <", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32LessThanOrEqualTo(Double value) {
            addCriterion("s_3_2 <=", value, "s32");
            return (Criteria) this;
        }

        public Criteria andS32In(List<Double> values) {
            addCriterion("s_3_2 in", values, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotIn(List<Double> values) {
            addCriterion("s_3_2 not in", values, "s32");
            return (Criteria) this;
        }

        public Criteria andS32Between(Double value1, Double value2) {
            addCriterion("s_3_2 between", value1, value2, "s32");
            return (Criteria) this;
        }

        public Criteria andS32NotBetween(Double value1, Double value2) {
            addCriterion("s_3_2 not between", value1, value2, "s32");
            return (Criteria) this;
        }

        public Criteria andS40IsNull() {
            addCriterion("s_4_0 is null");
            return (Criteria) this;
        }

        public Criteria andS40IsNotNull() {
            addCriterion("s_4_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS40EqualTo(Double value) {
            addCriterion("s_4_0 =", value, "s40");
            return (Criteria) this;
        }

        public Criteria andS40NotEqualTo(Double value) {
            addCriterion("s_4_0 <>", value, "s40");
            return (Criteria) this;
        }

        public Criteria andS40GreaterThan(Double value) {
            addCriterion("s_4_0 >", value, "s40");
            return (Criteria) this;
        }

        public Criteria andS40GreaterThanOrEqualTo(Double value) {
            addCriterion("s_4_0 >=", value, "s40");
            return (Criteria) this;
        }

        public Criteria andS40LessThan(Double value) {
            addCriterion("s_4_0 <", value, "s40");
            return (Criteria) this;
        }

        public Criteria andS40LessThanOrEqualTo(Double value) {
            addCriterion("s_4_0 <=", value, "s40");
            return (Criteria) this;
        }

        public Criteria andS40In(List<Double> values) {
            addCriterion("s_4_0 in", values, "s40");
            return (Criteria) this;
        }

        public Criteria andS40NotIn(List<Double> values) {
            addCriterion("s_4_0 not in", values, "s40");
            return (Criteria) this;
        }

        public Criteria andS40Between(Double value1, Double value2) {
            addCriterion("s_4_0 between", value1, value2, "s40");
            return (Criteria) this;
        }

        public Criteria andS40NotBetween(Double value1, Double value2) {
            addCriterion("s_4_0 not between", value1, value2, "s40");
            return (Criteria) this;
        }

        public Criteria andS41IsNull() {
            addCriterion("s_4_1 is null");
            return (Criteria) this;
        }

        public Criteria andS41IsNotNull() {
            addCriterion("s_4_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS41EqualTo(Double value) {
            addCriterion("s_4_1 =", value, "s41");
            return (Criteria) this;
        }

        public Criteria andS41NotEqualTo(Double value) {
            addCriterion("s_4_1 <>", value, "s41");
            return (Criteria) this;
        }

        public Criteria andS41GreaterThan(Double value) {
            addCriterion("s_4_1 >", value, "s41");
            return (Criteria) this;
        }

        public Criteria andS41GreaterThanOrEqualTo(Double value) {
            addCriterion("s_4_1 >=", value, "s41");
            return (Criteria) this;
        }

        public Criteria andS41LessThan(Double value) {
            addCriterion("s_4_1 <", value, "s41");
            return (Criteria) this;
        }

        public Criteria andS41LessThanOrEqualTo(Double value) {
            addCriterion("s_4_1 <=", value, "s41");
            return (Criteria) this;
        }

        public Criteria andS41In(List<Double> values) {
            addCriterion("s_4_1 in", values, "s41");
            return (Criteria) this;
        }

        public Criteria andS41NotIn(List<Double> values) {
            addCriterion("s_4_1 not in", values, "s41");
            return (Criteria) this;
        }

        public Criteria andS41Between(Double value1, Double value2) {
            addCriterion("s_4_1 between", value1, value2, "s41");
            return (Criteria) this;
        }

        public Criteria andS41NotBetween(Double value1, Double value2) {
            addCriterion("s_4_1 not between", value1, value2, "s41");
            return (Criteria) this;
        }

        public Criteria andS42IsNull() {
            addCriterion("s_4_2 is null");
            return (Criteria) this;
        }

        public Criteria andS42IsNotNull() {
            addCriterion("s_4_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS42EqualTo(Double value) {
            addCriterion("s_4_2 =", value, "s42");
            return (Criteria) this;
        }

        public Criteria andS42NotEqualTo(Double value) {
            addCriterion("s_4_2 <>", value, "s42");
            return (Criteria) this;
        }

        public Criteria andS42GreaterThan(Double value) {
            addCriterion("s_4_2 >", value, "s42");
            return (Criteria) this;
        }

        public Criteria andS42GreaterThanOrEqualTo(Double value) {
            addCriterion("s_4_2 >=", value, "s42");
            return (Criteria) this;
        }

        public Criteria andS42LessThan(Double value) {
            addCriterion("s_4_2 <", value, "s42");
            return (Criteria) this;
        }

        public Criteria andS42LessThanOrEqualTo(Double value) {
            addCriterion("s_4_2 <=", value, "s42");
            return (Criteria) this;
        }

        public Criteria andS42In(List<Double> values) {
            addCriterion("s_4_2 in", values, "s42");
            return (Criteria) this;
        }

        public Criteria andS42NotIn(List<Double> values) {
            addCriterion("s_4_2 not in", values, "s42");
            return (Criteria) this;
        }

        public Criteria andS42Between(Double value1, Double value2) {
            addCriterion("s_4_2 between", value1, value2, "s42");
            return (Criteria) this;
        }

        public Criteria andS42NotBetween(Double value1, Double value2) {
            addCriterion("s_4_2 not between", value1, value2, "s42");
            return (Criteria) this;
        }

        public Criteria andS43IsNull() {
            addCriterion("s_4_3 is null");
            return (Criteria) this;
        }

        public Criteria andS43IsNotNull() {
            addCriterion("s_4_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS43EqualTo(Double value) {
            addCriterion("s_4_3 =", value, "s43");
            return (Criteria) this;
        }

        public Criteria andS43NotEqualTo(Double value) {
            addCriterion("s_4_3 <>", value, "s43");
            return (Criteria) this;
        }

        public Criteria andS43GreaterThan(Double value) {
            addCriterion("s_4_3 >", value, "s43");
            return (Criteria) this;
        }

        public Criteria andS43GreaterThanOrEqualTo(Double value) {
            addCriterion("s_4_3 >=", value, "s43");
            return (Criteria) this;
        }

        public Criteria andS43LessThan(Double value) {
            addCriterion("s_4_3 <", value, "s43");
            return (Criteria) this;
        }

        public Criteria andS43LessThanOrEqualTo(Double value) {
            addCriterion("s_4_3 <=", value, "s43");
            return (Criteria) this;
        }

        public Criteria andS43In(List<Double> values) {
            addCriterion("s_4_3 in", values, "s43");
            return (Criteria) this;
        }

        public Criteria andS43NotIn(List<Double> values) {
            addCriterion("s_4_3 not in", values, "s43");
            return (Criteria) this;
        }

        public Criteria andS43Between(Double value1, Double value2) {
            addCriterion("s_4_3 between", value1, value2, "s43");
            return (Criteria) this;
        }

        public Criteria andS43NotBetween(Double value1, Double value2) {
            addCriterion("s_4_3 not between", value1, value2, "s43");
            return (Criteria) this;
        }

        public Criteria andS50IsNull() {
            addCriterion("s_5_0 is null");
            return (Criteria) this;
        }

        public Criteria andS50IsNotNull() {
            addCriterion("s_5_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS50EqualTo(Double value) {
            addCriterion("s_5_0 =", value, "s50");
            return (Criteria) this;
        }

        public Criteria andS50NotEqualTo(Double value) {
            addCriterion("s_5_0 <>", value, "s50");
            return (Criteria) this;
        }

        public Criteria andS50GreaterThan(Double value) {
            addCriterion("s_5_0 >", value, "s50");
            return (Criteria) this;
        }

        public Criteria andS50GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_0 >=", value, "s50");
            return (Criteria) this;
        }

        public Criteria andS50LessThan(Double value) {
            addCriterion("s_5_0 <", value, "s50");
            return (Criteria) this;
        }

        public Criteria andS50LessThanOrEqualTo(Double value) {
            addCriterion("s_5_0 <=", value, "s50");
            return (Criteria) this;
        }

        public Criteria andS50In(List<Double> values) {
            addCriterion("s_5_0 in", values, "s50");
            return (Criteria) this;
        }

        public Criteria andS50NotIn(List<Double> values) {
            addCriterion("s_5_0 not in", values, "s50");
            return (Criteria) this;
        }

        public Criteria andS50Between(Double value1, Double value2) {
            addCriterion("s_5_0 between", value1, value2, "s50");
            return (Criteria) this;
        }

        public Criteria andS50NotBetween(Double value1, Double value2) {
            addCriterion("s_5_0 not between", value1, value2, "s50");
            return (Criteria) this;
        }

        public Criteria andS51IsNull() {
            addCriterion("s_5_1 is null");
            return (Criteria) this;
        }

        public Criteria andS51IsNotNull() {
            addCriterion("s_5_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS51EqualTo(Double value) {
            addCriterion("s_5_1 =", value, "s51");
            return (Criteria) this;
        }

        public Criteria andS51NotEqualTo(Double value) {
            addCriterion("s_5_1 <>", value, "s51");
            return (Criteria) this;
        }

        public Criteria andS51GreaterThan(Double value) {
            addCriterion("s_5_1 >", value, "s51");
            return (Criteria) this;
        }

        public Criteria andS51GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_1 >=", value, "s51");
            return (Criteria) this;
        }

        public Criteria andS51LessThan(Double value) {
            addCriterion("s_5_1 <", value, "s51");
            return (Criteria) this;
        }

        public Criteria andS51LessThanOrEqualTo(Double value) {
            addCriterion("s_5_1 <=", value, "s51");
            return (Criteria) this;
        }

        public Criteria andS51In(List<Double> values) {
            addCriterion("s_5_1 in", values, "s51");
            return (Criteria) this;
        }

        public Criteria andS51NotIn(List<Double> values) {
            addCriterion("s_5_1 not in", values, "s51");
            return (Criteria) this;
        }

        public Criteria andS51Between(Double value1, Double value2) {
            addCriterion("s_5_1 between", value1, value2, "s51");
            return (Criteria) this;
        }

        public Criteria andS51NotBetween(Double value1, Double value2) {
            addCriterion("s_5_1 not between", value1, value2, "s51");
            return (Criteria) this;
        }

        public Criteria andS52IsNull() {
            addCriterion("s_5_2 is null");
            return (Criteria) this;
        }

        public Criteria andS52IsNotNull() {
            addCriterion("s_5_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS52EqualTo(Double value) {
            addCriterion("s_5_2 =", value, "s52");
            return (Criteria) this;
        }

        public Criteria andS52NotEqualTo(Double value) {
            addCriterion("s_5_2 <>", value, "s52");
            return (Criteria) this;
        }

        public Criteria andS52GreaterThan(Double value) {
            addCriterion("s_5_2 >", value, "s52");
            return (Criteria) this;
        }

        public Criteria andS52GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_2 >=", value, "s52");
            return (Criteria) this;
        }

        public Criteria andS52LessThan(Double value) {
            addCriterion("s_5_2 <", value, "s52");
            return (Criteria) this;
        }

        public Criteria andS52LessThanOrEqualTo(Double value) {
            addCriterion("s_5_2 <=", value, "s52");
            return (Criteria) this;
        }

        public Criteria andS52In(List<Double> values) {
            addCriterion("s_5_2 in", values, "s52");
            return (Criteria) this;
        }

        public Criteria andS52NotIn(List<Double> values) {
            addCriterion("s_5_2 not in", values, "s52");
            return (Criteria) this;
        }

        public Criteria andS52Between(Double value1, Double value2) {
            addCriterion("s_5_2 between", value1, value2, "s52");
            return (Criteria) this;
        }

        public Criteria andS52NotBetween(Double value1, Double value2) {
            addCriterion("s_5_2 not between", value1, value2, "s52");
            return (Criteria) this;
        }

        public Criteria andS53IsNull() {
            addCriterion("s_5_3 is null");
            return (Criteria) this;
        }

        public Criteria andS53IsNotNull() {
            addCriterion("s_5_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS53EqualTo(Double value) {
            addCriterion("s_5_3 =", value, "s53");
            return (Criteria) this;
        }

        public Criteria andS53NotEqualTo(Double value) {
            addCriterion("s_5_3 <>", value, "s53");
            return (Criteria) this;
        }

        public Criteria andS53GreaterThan(Double value) {
            addCriterion("s_5_3 >", value, "s53");
            return (Criteria) this;
        }

        public Criteria andS53GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_3 >=", value, "s53");
            return (Criteria) this;
        }

        public Criteria andS53LessThan(Double value) {
            addCriterion("s_5_3 <", value, "s53");
            return (Criteria) this;
        }

        public Criteria andS53LessThanOrEqualTo(Double value) {
            addCriterion("s_5_3 <=", value, "s53");
            return (Criteria) this;
        }

        public Criteria andS53In(List<Double> values) {
            addCriterion("s_5_3 in", values, "s53");
            return (Criteria) this;
        }

        public Criteria andS53NotIn(List<Double> values) {
            addCriterion("s_5_3 not in", values, "s53");
            return (Criteria) this;
        }

        public Criteria andS53Between(Double value1, Double value2) {
            addCriterion("s_5_3 between", value1, value2, "s53");
            return (Criteria) this;
        }

        public Criteria andS53NotBetween(Double value1, Double value2) {
            addCriterion("s_5_3 not between", value1, value2, "s53");
            return (Criteria) this;
        }

        public Criteria andS54IsNull() {
            addCriterion("s_5_4 is null");
            return (Criteria) this;
        }

        public Criteria andS54IsNotNull() {
            addCriterion("s_5_4 is not null");
            return (Criteria) this;
        }

        public Criteria andS54EqualTo(Double value) {
            addCriterion("s_5_4 =", value, "s54");
            return (Criteria) this;
        }

        public Criteria andS54NotEqualTo(Double value) {
            addCriterion("s_5_4 <>", value, "s54");
            return (Criteria) this;
        }

        public Criteria andS54GreaterThan(Double value) {
            addCriterion("s_5_4 >", value, "s54");
            return (Criteria) this;
        }

        public Criteria andS54GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_4 >=", value, "s54");
            return (Criteria) this;
        }

        public Criteria andS54LessThan(Double value) {
            addCriterion("s_5_4 <", value, "s54");
            return (Criteria) this;
        }

        public Criteria andS54LessThanOrEqualTo(Double value) {
            addCriterion("s_5_4 <=", value, "s54");
            return (Criteria) this;
        }

        public Criteria andS54In(List<Double> values) {
            addCriterion("s_5_4 in", values, "s54");
            return (Criteria) this;
        }

        public Criteria andS54NotIn(List<Double> values) {
            addCriterion("s_5_4 not in", values, "s54");
            return (Criteria) this;
        }

        public Criteria andS54Between(Double value1, Double value2) {
            addCriterion("s_5_4 between", value1, value2, "s54");
            return (Criteria) this;
        }

        public Criteria andS54NotBetween(Double value1, Double value2) {
            addCriterion("s_5_4 not between", value1, value2, "s54");
            return (Criteria) this;
        }

        public Criteria andS60IsNull() {
            addCriterion("s_6_0 is null");
            return (Criteria) this;
        }

        public Criteria andS60IsNotNull() {
            addCriterion("s_6_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS60EqualTo(Double value) {
            addCriterion("s_6_0 =", value, "s60");
            return (Criteria) this;
        }

        public Criteria andS60NotEqualTo(Double value) {
            addCriterion("s_6_0 <>", value, "s60");
            return (Criteria) this;
        }

        public Criteria andS60GreaterThan(Double value) {
            addCriterion("s_6_0 >", value, "s60");
            return (Criteria) this;
        }

        public Criteria andS60GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_0 >=", value, "s60");
            return (Criteria) this;
        }

        public Criteria andS60LessThan(Double value) {
            addCriterion("s_6_0 <", value, "s60");
            return (Criteria) this;
        }

        public Criteria andS60LessThanOrEqualTo(Double value) {
            addCriterion("s_6_0 <=", value, "s60");
            return (Criteria) this;
        }

        public Criteria andS60In(List<Double> values) {
            addCriterion("s_6_0 in", values, "s60");
            return (Criteria) this;
        }

        public Criteria andS60NotIn(List<Double> values) {
            addCriterion("s_6_0 not in", values, "s60");
            return (Criteria) this;
        }

        public Criteria andS60Between(Double value1, Double value2) {
            addCriterion("s_6_0 between", value1, value2, "s60");
            return (Criteria) this;
        }

        public Criteria andS60NotBetween(Double value1, Double value2) {
            addCriterion("s_6_0 not between", value1, value2, "s60");
            return (Criteria) this;
        }

        public Criteria andS61IsNull() {
            addCriterion("s_6_1 is null");
            return (Criteria) this;
        }

        public Criteria andS61IsNotNull() {
            addCriterion("s_6_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS61EqualTo(Double value) {
            addCriterion("s_6_1 =", value, "s61");
            return (Criteria) this;
        }

        public Criteria andS61NotEqualTo(Double value) {
            addCriterion("s_6_1 <>", value, "s61");
            return (Criteria) this;
        }

        public Criteria andS61GreaterThan(Double value) {
            addCriterion("s_6_1 >", value, "s61");
            return (Criteria) this;
        }

        public Criteria andS61GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_1 >=", value, "s61");
            return (Criteria) this;
        }

        public Criteria andS61LessThan(Double value) {
            addCriterion("s_6_1 <", value, "s61");
            return (Criteria) this;
        }

        public Criteria andS61LessThanOrEqualTo(Double value) {
            addCriterion("s_6_1 <=", value, "s61");
            return (Criteria) this;
        }

        public Criteria andS61In(List<Double> values) {
            addCriterion("s_6_1 in", values, "s61");
            return (Criteria) this;
        }

        public Criteria andS61NotIn(List<Double> values) {
            addCriterion("s_6_1 not in", values, "s61");
            return (Criteria) this;
        }

        public Criteria andS61Between(Double value1, Double value2) {
            addCriterion("s_6_1 between", value1, value2, "s61");
            return (Criteria) this;
        }

        public Criteria andS61NotBetween(Double value1, Double value2) {
            addCriterion("s_6_1 not between", value1, value2, "s61");
            return (Criteria) this;
        }

        public Criteria andS62IsNull() {
            addCriterion("s_6_2 is null");
            return (Criteria) this;
        }

        public Criteria andS62IsNotNull() {
            addCriterion("s_6_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS62EqualTo(Double value) {
            addCriterion("s_6_2 =", value, "s62");
            return (Criteria) this;
        }

        public Criteria andS62NotEqualTo(Double value) {
            addCriterion("s_6_2 <>", value, "s62");
            return (Criteria) this;
        }

        public Criteria andS62GreaterThan(Double value) {
            addCriterion("s_6_2 >", value, "s62");
            return (Criteria) this;
        }

        public Criteria andS62GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_2 >=", value, "s62");
            return (Criteria) this;
        }

        public Criteria andS62LessThan(Double value) {
            addCriterion("s_6_2 <", value, "s62");
            return (Criteria) this;
        }

        public Criteria andS62LessThanOrEqualTo(Double value) {
            addCriterion("s_6_2 <=", value, "s62");
            return (Criteria) this;
        }

        public Criteria andS62In(List<Double> values) {
            addCriterion("s_6_2 in", values, "s62");
            return (Criteria) this;
        }

        public Criteria andS62NotIn(List<Double> values) {
            addCriterion("s_6_2 not in", values, "s62");
            return (Criteria) this;
        }

        public Criteria andS62Between(Double value1, Double value2) {
            addCriterion("s_6_2 between", value1, value2, "s62");
            return (Criteria) this;
        }

        public Criteria andS62NotBetween(Double value1, Double value2) {
            addCriterion("s_6_2 not between", value1, value2, "s62");
            return (Criteria) this;
        }

        public Criteria andS63IsNull() {
            addCriterion("s_6_3 is null");
            return (Criteria) this;
        }

        public Criteria andS63IsNotNull() {
            addCriterion("s_6_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS63EqualTo(Double value) {
            addCriterion("s_6_3 =", value, "s63");
            return (Criteria) this;
        }

        public Criteria andS63NotEqualTo(Double value) {
            addCriterion("s_6_3 <>", value, "s63");
            return (Criteria) this;
        }

        public Criteria andS63GreaterThan(Double value) {
            addCriterion("s_6_3 >", value, "s63");
            return (Criteria) this;
        }

        public Criteria andS63GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_3 >=", value, "s63");
            return (Criteria) this;
        }

        public Criteria andS63LessThan(Double value) {
            addCriterion("s_6_3 <", value, "s63");
            return (Criteria) this;
        }

        public Criteria andS63LessThanOrEqualTo(Double value) {
            addCriterion("s_6_3 <=", value, "s63");
            return (Criteria) this;
        }

        public Criteria andS63In(List<Double> values) {
            addCriterion("s_6_3 in", values, "s63");
            return (Criteria) this;
        }

        public Criteria andS63NotIn(List<Double> values) {
            addCriterion("s_6_3 not in", values, "s63");
            return (Criteria) this;
        }

        public Criteria andS63Between(Double value1, Double value2) {
            addCriterion("s_6_3 between", value1, value2, "s63");
            return (Criteria) this;
        }

        public Criteria andS63NotBetween(Double value1, Double value2) {
            addCriterion("s_6_3 not between", value1, value2, "s63");
            return (Criteria) this;
        }

        public Criteria andS64IsNull() {
            addCriterion("s_6_4 is null");
            return (Criteria) this;
        }

        public Criteria andS64IsNotNull() {
            addCriterion("s_6_4 is not null");
            return (Criteria) this;
        }

        public Criteria andS64EqualTo(Double value) {
            addCriterion("s_6_4 =", value, "s64");
            return (Criteria) this;
        }

        public Criteria andS64NotEqualTo(Double value) {
            addCriterion("s_6_4 <>", value, "s64");
            return (Criteria) this;
        }

        public Criteria andS64GreaterThan(Double value) {
            addCriterion("s_6_4 >", value, "s64");
            return (Criteria) this;
        }

        public Criteria andS64GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_4 >=", value, "s64");
            return (Criteria) this;
        }

        public Criteria andS64LessThan(Double value) {
            addCriterion("s_6_4 <", value, "s64");
            return (Criteria) this;
        }

        public Criteria andS64LessThanOrEqualTo(Double value) {
            addCriterion("s_6_4 <=", value, "s64");
            return (Criteria) this;
        }

        public Criteria andS64In(List<Double> values) {
            addCriterion("s_6_4 in", values, "s64");
            return (Criteria) this;
        }

        public Criteria andS64NotIn(List<Double> values) {
            addCriterion("s_6_4 not in", values, "s64");
            return (Criteria) this;
        }

        public Criteria andS64Between(Double value1, Double value2) {
            addCriterion("s_6_4 between", value1, value2, "s64");
            return (Criteria) this;
        }

        public Criteria andS64NotBetween(Double value1, Double value2) {
            addCriterion("s_6_4 not between", value1, value2, "s64");
            return (Criteria) this;
        }

        public Criteria andS65IsNull() {
            addCriterion("s_6_5 is null");
            return (Criteria) this;
        }

        public Criteria andS65IsNotNull() {
            addCriterion("s_6_5 is not null");
            return (Criteria) this;
        }

        public Criteria andS65EqualTo(Double value) {
            addCriterion("s_6_5 =", value, "s65");
            return (Criteria) this;
        }

        public Criteria andS65NotEqualTo(Double value) {
            addCriterion("s_6_5 <>", value, "s65");
            return (Criteria) this;
        }

        public Criteria andS65GreaterThan(Double value) {
            addCriterion("s_6_5 >", value, "s65");
            return (Criteria) this;
        }

        public Criteria andS65GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_5 >=", value, "s65");
            return (Criteria) this;
        }

        public Criteria andS65LessThan(Double value) {
            addCriterion("s_6_5 <", value, "s65");
            return (Criteria) this;
        }

        public Criteria andS65LessThanOrEqualTo(Double value) {
            addCriterion("s_6_5 <=", value, "s65");
            return (Criteria) this;
        }

        public Criteria andS65In(List<Double> values) {
            addCriterion("s_6_5 in", values, "s65");
            return (Criteria) this;
        }

        public Criteria andS65NotIn(List<Double> values) {
            addCriterion("s_6_5 not in", values, "s65");
            return (Criteria) this;
        }

        public Criteria andS65Between(Double value1, Double value2) {
            addCriterion("s_6_5 between", value1, value2, "s65");
            return (Criteria) this;
        }

        public Criteria andS65NotBetween(Double value1, Double value2) {
            addCriterion("s_6_5 not between", value1, value2, "s65");
            return (Criteria) this;
        }

        public Criteria andS70IsNull() {
            addCriterion("s_7_0 is null");
            return (Criteria) this;
        }

        public Criteria andS70IsNotNull() {
            addCriterion("s_7_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS70EqualTo(Double value) {
            addCriterion("s_7_0 =", value, "s70");
            return (Criteria) this;
        }

        public Criteria andS70NotEqualTo(Double value) {
            addCriterion("s_7_0 <>", value, "s70");
            return (Criteria) this;
        }

        public Criteria andS70GreaterThan(Double value) {
            addCriterion("s_7_0 >", value, "s70");
            return (Criteria) this;
        }

        public Criteria andS70GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_0 >=", value, "s70");
            return (Criteria) this;
        }

        public Criteria andS70LessThan(Double value) {
            addCriterion("s_7_0 <", value, "s70");
            return (Criteria) this;
        }

        public Criteria andS70LessThanOrEqualTo(Double value) {
            addCriterion("s_7_0 <=", value, "s70");
            return (Criteria) this;
        }

        public Criteria andS70In(List<Double> values) {
            addCriterion("s_7_0 in", values, "s70");
            return (Criteria) this;
        }

        public Criteria andS70NotIn(List<Double> values) {
            addCriterion("s_7_0 not in", values, "s70");
            return (Criteria) this;
        }

        public Criteria andS70Between(Double value1, Double value2) {
            addCriterion("s_7_0 between", value1, value2, "s70");
            return (Criteria) this;
        }

        public Criteria andS70NotBetween(Double value1, Double value2) {
            addCriterion("s_7_0 not between", value1, value2, "s70");
            return (Criteria) this;
        }

        public Criteria andS71IsNull() {
            addCriterion("s_7_1 is null");
            return (Criteria) this;
        }

        public Criteria andS71IsNotNull() {
            addCriterion("s_7_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS71EqualTo(Double value) {
            addCriterion("s_7_1 =", value, "s71");
            return (Criteria) this;
        }

        public Criteria andS71NotEqualTo(Double value) {
            addCriterion("s_7_1 <>", value, "s71");
            return (Criteria) this;
        }

        public Criteria andS71GreaterThan(Double value) {
            addCriterion("s_7_1 >", value, "s71");
            return (Criteria) this;
        }

        public Criteria andS71GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_1 >=", value, "s71");
            return (Criteria) this;
        }

        public Criteria andS71LessThan(Double value) {
            addCriterion("s_7_1 <", value, "s71");
            return (Criteria) this;
        }

        public Criteria andS71LessThanOrEqualTo(Double value) {
            addCriterion("s_7_1 <=", value, "s71");
            return (Criteria) this;
        }

        public Criteria andS71In(List<Double> values) {
            addCriterion("s_7_1 in", values, "s71");
            return (Criteria) this;
        }

        public Criteria andS71NotIn(List<Double> values) {
            addCriterion("s_7_1 not in", values, "s71");
            return (Criteria) this;
        }

        public Criteria andS71Between(Double value1, Double value2) {
            addCriterion("s_7_1 between", value1, value2, "s71");
            return (Criteria) this;
        }

        public Criteria andS71NotBetween(Double value1, Double value2) {
            addCriterion("s_7_1 not between", value1, value2, "s71");
            return (Criteria) this;
        }

        public Criteria andS72IsNull() {
            addCriterion("s_7_2 is null");
            return (Criteria) this;
        }

        public Criteria andS72IsNotNull() {
            addCriterion("s_7_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS72EqualTo(Double value) {
            addCriterion("s_7_2 =", value, "s72");
            return (Criteria) this;
        }

        public Criteria andS72NotEqualTo(Double value) {
            addCriterion("s_7_2 <>", value, "s72");
            return (Criteria) this;
        }

        public Criteria andS72GreaterThan(Double value) {
            addCriterion("s_7_2 >", value, "s72");
            return (Criteria) this;
        }

        public Criteria andS72GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_2 >=", value, "s72");
            return (Criteria) this;
        }

        public Criteria andS72LessThan(Double value) {
            addCriterion("s_7_2 <", value, "s72");
            return (Criteria) this;
        }

        public Criteria andS72LessThanOrEqualTo(Double value) {
            addCriterion("s_7_2 <=", value, "s72");
            return (Criteria) this;
        }

        public Criteria andS72In(List<Double> values) {
            addCriterion("s_7_2 in", values, "s72");
            return (Criteria) this;
        }

        public Criteria andS72NotIn(List<Double> values) {
            addCriterion("s_7_2 not in", values, "s72");
            return (Criteria) this;
        }

        public Criteria andS72Between(Double value1, Double value2) {
            addCriterion("s_7_2 between", value1, value2, "s72");
            return (Criteria) this;
        }

        public Criteria andS72NotBetween(Double value1, Double value2) {
            addCriterion("s_7_2 not between", value1, value2, "s72");
            return (Criteria) this;
        }

        public Criteria andS73IsNull() {
            addCriterion("s_7_3 is null");
            return (Criteria) this;
        }

        public Criteria andS73IsNotNull() {
            addCriterion("s_7_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS73EqualTo(Double value) {
            addCriterion("s_7_3 =", value, "s73");
            return (Criteria) this;
        }

        public Criteria andS73NotEqualTo(Double value) {
            addCriterion("s_7_3 <>", value, "s73");
            return (Criteria) this;
        }

        public Criteria andS73GreaterThan(Double value) {
            addCriterion("s_7_3 >", value, "s73");
            return (Criteria) this;
        }

        public Criteria andS73GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_3 >=", value, "s73");
            return (Criteria) this;
        }

        public Criteria andS73LessThan(Double value) {
            addCriterion("s_7_3 <", value, "s73");
            return (Criteria) this;
        }

        public Criteria andS73LessThanOrEqualTo(Double value) {
            addCriterion("s_7_3 <=", value, "s73");
            return (Criteria) this;
        }

        public Criteria andS73In(List<Double> values) {
            addCriterion("s_7_3 in", values, "s73");
            return (Criteria) this;
        }

        public Criteria andS73NotIn(List<Double> values) {
            addCriterion("s_7_3 not in", values, "s73");
            return (Criteria) this;
        }

        public Criteria andS73Between(Double value1, Double value2) {
            addCriterion("s_7_3 between", value1, value2, "s73");
            return (Criteria) this;
        }

        public Criteria andS73NotBetween(Double value1, Double value2) {
            addCriterion("s_7_3 not between", value1, value2, "s73");
            return (Criteria) this;
        }

        public Criteria andS74IsNull() {
            addCriterion("s_7_4 is null");
            return (Criteria) this;
        }

        public Criteria andS74IsNotNull() {
            addCriterion("s_7_4 is not null");
            return (Criteria) this;
        }

        public Criteria andS74EqualTo(Double value) {
            addCriterion("s_7_4 =", value, "s74");
            return (Criteria) this;
        }

        public Criteria andS74NotEqualTo(Double value) {
            addCriterion("s_7_4 <>", value, "s74");
            return (Criteria) this;
        }

        public Criteria andS74GreaterThan(Double value) {
            addCriterion("s_7_4 >", value, "s74");
            return (Criteria) this;
        }

        public Criteria andS74GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_4 >=", value, "s74");
            return (Criteria) this;
        }

        public Criteria andS74LessThan(Double value) {
            addCriterion("s_7_4 <", value, "s74");
            return (Criteria) this;
        }

        public Criteria andS74LessThanOrEqualTo(Double value) {
            addCriterion("s_7_4 <=", value, "s74");
            return (Criteria) this;
        }

        public Criteria andS74In(List<Double> values) {
            addCriterion("s_7_4 in", values, "s74");
            return (Criteria) this;
        }

        public Criteria andS74NotIn(List<Double> values) {
            addCriterion("s_7_4 not in", values, "s74");
            return (Criteria) this;
        }

        public Criteria andS74Between(Double value1, Double value2) {
            addCriterion("s_7_4 between", value1, value2, "s74");
            return (Criteria) this;
        }

        public Criteria andS74NotBetween(Double value1, Double value2) {
            addCriterion("s_7_4 not between", value1, value2, "s74");
            return (Criteria) this;
        }

        public Criteria andS75IsNull() {
            addCriterion("s_7_5 is null");
            return (Criteria) this;
        }

        public Criteria andS75IsNotNull() {
            addCriterion("s_7_5 is not null");
            return (Criteria) this;
        }

        public Criteria andS75EqualTo(Double value) {
            addCriterion("s_7_5 =", value, "s75");
            return (Criteria) this;
        }

        public Criteria andS75NotEqualTo(Double value) {
            addCriterion("s_7_5 <>", value, "s75");
            return (Criteria) this;
        }

        public Criteria andS75GreaterThan(Double value) {
            addCriterion("s_7_5 >", value, "s75");
            return (Criteria) this;
        }

        public Criteria andS75GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_5 >=", value, "s75");
            return (Criteria) this;
        }

        public Criteria andS75LessThan(Double value) {
            addCriterion("s_7_5 <", value, "s75");
            return (Criteria) this;
        }

        public Criteria andS75LessThanOrEqualTo(Double value) {
            addCriterion("s_7_5 <=", value, "s75");
            return (Criteria) this;
        }

        public Criteria andS75In(List<Double> values) {
            addCriterion("s_7_5 in", values, "s75");
            return (Criteria) this;
        }

        public Criteria andS75NotIn(List<Double> values) {
            addCriterion("s_7_5 not in", values, "s75");
            return (Criteria) this;
        }

        public Criteria andS75Between(Double value1, Double value2) {
            addCriterion("s_7_5 between", value1, value2, "s75");
            return (Criteria) this;
        }

        public Criteria andS75NotBetween(Double value1, Double value2) {
            addCriterion("s_7_5 not between", value1, value2, "s75");
            return (Criteria) this;
        }

        public Criteria andS76IsNull() {
            addCriterion("s_7_6 is null");
            return (Criteria) this;
        }

        public Criteria andS76IsNotNull() {
            addCriterion("s_7_6 is not null");
            return (Criteria) this;
        }

        public Criteria andS76EqualTo(Double value) {
            addCriterion("s_7_6 =", value, "s76");
            return (Criteria) this;
        }

        public Criteria andS76NotEqualTo(Double value) {
            addCriterion("s_7_6 <>", value, "s76");
            return (Criteria) this;
        }

        public Criteria andS76GreaterThan(Double value) {
            addCriterion("s_7_6 >", value, "s76");
            return (Criteria) this;
        }

        public Criteria andS76GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_6 >=", value, "s76");
            return (Criteria) this;
        }

        public Criteria andS76LessThan(Double value) {
            addCriterion("s_7_6 <", value, "s76");
            return (Criteria) this;
        }

        public Criteria andS76LessThanOrEqualTo(Double value) {
            addCriterion("s_7_6 <=", value, "s76");
            return (Criteria) this;
        }

        public Criteria andS76In(List<Double> values) {
            addCriterion("s_7_6 in", values, "s76");
            return (Criteria) this;
        }

        public Criteria andS76NotIn(List<Double> values) {
            addCriterion("s_7_6 not in", values, "s76");
            return (Criteria) this;
        }

        public Criteria andS76Between(Double value1, Double value2) {
            addCriterion("s_7_6 between", value1, value2, "s76");
            return (Criteria) this;
        }

        public Criteria andS76NotBetween(Double value1, Double value2) {
            addCriterion("s_7_6 not between", value1, value2, "s76");
            return (Criteria) this;
        }

        public Criteria andS00IsNull() {
            addCriterion("s_0_0 is null");
            return (Criteria) this;
        }

        public Criteria andS00IsNotNull() {
            addCriterion("s_0_0 is not null");
            return (Criteria) this;
        }

        public Criteria andS00EqualTo(Double value) {
            addCriterion("s_0_0 =", value, "s00");
            return (Criteria) this;
        }

        public Criteria andS00NotEqualTo(Double value) {
            addCriterion("s_0_0 <>", value, "s00");
            return (Criteria) this;
        }

        public Criteria andS00GreaterThan(Double value) {
            addCriterion("s_0_0 >", value, "s00");
            return (Criteria) this;
        }

        public Criteria andS00GreaterThanOrEqualTo(Double value) {
            addCriterion("s_0_0 >=", value, "s00");
            return (Criteria) this;
        }

        public Criteria andS00LessThan(Double value) {
            addCriterion("s_0_0 <", value, "s00");
            return (Criteria) this;
        }

        public Criteria andS00LessThanOrEqualTo(Double value) {
            addCriterion("s_0_0 <=", value, "s00");
            return (Criteria) this;
        }

        public Criteria andS00In(List<Double> values) {
            addCriterion("s_0_0 in", values, "s00");
            return (Criteria) this;
        }

        public Criteria andS00NotIn(List<Double> values) {
            addCriterion("s_0_0 not in", values, "s00");
            return (Criteria) this;
        }

        public Criteria andS00Between(Double value1, Double value2) {
            addCriterion("s_0_0 between", value1, value2, "s00");
            return (Criteria) this;
        }

        public Criteria andS00NotBetween(Double value1, Double value2) {
            addCriterion("s_0_0 not between", value1, value2, "s00");
            return (Criteria) this;
        }

        public Criteria andS11IsNull() {
            addCriterion("s_1_1 is null");
            return (Criteria) this;
        }

        public Criteria andS11IsNotNull() {
            addCriterion("s_1_1 is not null");
            return (Criteria) this;
        }

        public Criteria andS11EqualTo(Double value) {
            addCriterion("s_1_1 =", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotEqualTo(Double value) {
            addCriterion("s_1_1 <>", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11GreaterThan(Double value) {
            addCriterion("s_1_1 >", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11GreaterThanOrEqualTo(Double value) {
            addCriterion("s_1_1 >=", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11LessThan(Double value) {
            addCriterion("s_1_1 <", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11LessThanOrEqualTo(Double value) {
            addCriterion("s_1_1 <=", value, "s11");
            return (Criteria) this;
        }

        public Criteria andS11In(List<Double> values) {
            addCriterion("s_1_1 in", values, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotIn(List<Double> values) {
            addCriterion("s_1_1 not in", values, "s11");
            return (Criteria) this;
        }

        public Criteria andS11Between(Double value1, Double value2) {
            addCriterion("s_1_1 between", value1, value2, "s11");
            return (Criteria) this;
        }

        public Criteria andS11NotBetween(Double value1, Double value2) {
            addCriterion("s_1_1 not between", value1, value2, "s11");
            return (Criteria) this;
        }

        public Criteria andS22IsNull() {
            addCriterion("s_2_2 is null");
            return (Criteria) this;
        }

        public Criteria andS22IsNotNull() {
            addCriterion("s_2_2 is not null");
            return (Criteria) this;
        }

        public Criteria andS22EqualTo(Double value) {
            addCriterion("s_2_2 =", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotEqualTo(Double value) {
            addCriterion("s_2_2 <>", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22GreaterThan(Double value) {
            addCriterion("s_2_2 >", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22GreaterThanOrEqualTo(Double value) {
            addCriterion("s_2_2 >=", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22LessThan(Double value) {
            addCriterion("s_2_2 <", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22LessThanOrEqualTo(Double value) {
            addCriterion("s_2_2 <=", value, "s22");
            return (Criteria) this;
        }

        public Criteria andS22In(List<Double> values) {
            addCriterion("s_2_2 in", values, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotIn(List<Double> values) {
            addCriterion("s_2_2 not in", values, "s22");
            return (Criteria) this;
        }

        public Criteria andS22Between(Double value1, Double value2) {
            addCriterion("s_2_2 between", value1, value2, "s22");
            return (Criteria) this;
        }

        public Criteria andS22NotBetween(Double value1, Double value2) {
            addCriterion("s_2_2 not between", value1, value2, "s22");
            return (Criteria) this;
        }

        public Criteria andS33IsNull() {
            addCriterion("s_3_3 is null");
            return (Criteria) this;
        }

        public Criteria andS33IsNotNull() {
            addCriterion("s_3_3 is not null");
            return (Criteria) this;
        }

        public Criteria andS33EqualTo(Double value) {
            addCriterion("s_3_3 =", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotEqualTo(Double value) {
            addCriterion("s_3_3 <>", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33GreaterThan(Double value) {
            addCriterion("s_3_3 >", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33GreaterThanOrEqualTo(Double value) {
            addCriterion("s_3_3 >=", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33LessThan(Double value) {
            addCriterion("s_3_3 <", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33LessThanOrEqualTo(Double value) {
            addCriterion("s_3_3 <=", value, "s33");
            return (Criteria) this;
        }

        public Criteria andS33In(List<Double> values) {
            addCriterion("s_3_3 in", values, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotIn(List<Double> values) {
            addCriterion("s_3_3 not in", values, "s33");
            return (Criteria) this;
        }

        public Criteria andS33Between(Double value1, Double value2) {
            addCriterion("s_3_3 between", value1, value2, "s33");
            return (Criteria) this;
        }

        public Criteria andS33NotBetween(Double value1, Double value2) {
            addCriterion("s_3_3 not between", value1, value2, "s33");
            return (Criteria) this;
        }

        public Criteria andS44IsNull() {
            addCriterion("s_4_4 is null");
            return (Criteria) this;
        }

        public Criteria andS44IsNotNull() {
            addCriterion("s_4_4 is not null");
            return (Criteria) this;
        }

        public Criteria andS44EqualTo(Double value) {
            addCriterion("s_4_4 =", value, "s44");
            return (Criteria) this;
        }

        public Criteria andS44NotEqualTo(Double value) {
            addCriterion("s_4_4 <>", value, "s44");
            return (Criteria) this;
        }

        public Criteria andS44GreaterThan(Double value) {
            addCriterion("s_4_4 >", value, "s44");
            return (Criteria) this;
        }

        public Criteria andS44GreaterThanOrEqualTo(Double value) {
            addCriterion("s_4_4 >=", value, "s44");
            return (Criteria) this;
        }

        public Criteria andS44LessThan(Double value) {
            addCriterion("s_4_4 <", value, "s44");
            return (Criteria) this;
        }

        public Criteria andS44LessThanOrEqualTo(Double value) {
            addCriterion("s_4_4 <=", value, "s44");
            return (Criteria) this;
        }

        public Criteria andS44In(List<Double> values) {
            addCriterion("s_4_4 in", values, "s44");
            return (Criteria) this;
        }

        public Criteria andS44NotIn(List<Double> values) {
            addCriterion("s_4_4 not in", values, "s44");
            return (Criteria) this;
        }

        public Criteria andS44Between(Double value1, Double value2) {
            addCriterion("s_4_4 between", value1, value2, "s44");
            return (Criteria) this;
        }

        public Criteria andS44NotBetween(Double value1, Double value2) {
            addCriterion("s_4_4 not between", value1, value2, "s44");
            return (Criteria) this;
        }

        public Criteria andS55IsNull() {
            addCriterion("s_5_5 is null");
            return (Criteria) this;
        }

        public Criteria andS55IsNotNull() {
            addCriterion("s_5_5 is not null");
            return (Criteria) this;
        }

        public Criteria andS55EqualTo(Double value) {
            addCriterion("s_5_5 =", value, "s55");
            return (Criteria) this;
        }

        public Criteria andS55NotEqualTo(Double value) {
            addCriterion("s_5_5 <>", value, "s55");
            return (Criteria) this;
        }

        public Criteria andS55GreaterThan(Double value) {
            addCriterion("s_5_5 >", value, "s55");
            return (Criteria) this;
        }

        public Criteria andS55GreaterThanOrEqualTo(Double value) {
            addCriterion("s_5_5 >=", value, "s55");
            return (Criteria) this;
        }

        public Criteria andS55LessThan(Double value) {
            addCriterion("s_5_5 <", value, "s55");
            return (Criteria) this;
        }

        public Criteria andS55LessThanOrEqualTo(Double value) {
            addCriterion("s_5_5 <=", value, "s55");
            return (Criteria) this;
        }

        public Criteria andS55In(List<Double> values) {
            addCriterion("s_5_5 in", values, "s55");
            return (Criteria) this;
        }

        public Criteria andS55NotIn(List<Double> values) {
            addCriterion("s_5_5 not in", values, "s55");
            return (Criteria) this;
        }

        public Criteria andS55Between(Double value1, Double value2) {
            addCriterion("s_5_5 between", value1, value2, "s55");
            return (Criteria) this;
        }

        public Criteria andS55NotBetween(Double value1, Double value2) {
            addCriterion("s_5_5 not between", value1, value2, "s55");
            return (Criteria) this;
        }

        public Criteria andS66IsNull() {
            addCriterion("s_6_6 is null");
            return (Criteria) this;
        }

        public Criteria andS66IsNotNull() {
            addCriterion("s_6_6 is not null");
            return (Criteria) this;
        }

        public Criteria andS66EqualTo(Double value) {
            addCriterion("s_6_6 =", value, "s66");
            return (Criteria) this;
        }

        public Criteria andS66NotEqualTo(Double value) {
            addCriterion("s_6_6 <>", value, "s66");
            return (Criteria) this;
        }

        public Criteria andS66GreaterThan(Double value) {
            addCriterion("s_6_6 >", value, "s66");
            return (Criteria) this;
        }

        public Criteria andS66GreaterThanOrEqualTo(Double value) {
            addCriterion("s_6_6 >=", value, "s66");
            return (Criteria) this;
        }

        public Criteria andS66LessThan(Double value) {
            addCriterion("s_6_6 <", value, "s66");
            return (Criteria) this;
        }

        public Criteria andS66LessThanOrEqualTo(Double value) {
            addCriterion("s_6_6 <=", value, "s66");
            return (Criteria) this;
        }

        public Criteria andS66In(List<Double> values) {
            addCriterion("s_6_6 in", values, "s66");
            return (Criteria) this;
        }

        public Criteria andS66NotIn(List<Double> values) {
            addCriterion("s_6_6 not in", values, "s66");
            return (Criteria) this;
        }

        public Criteria andS66Between(Double value1, Double value2) {
            addCriterion("s_6_6 between", value1, value2, "s66");
            return (Criteria) this;
        }

        public Criteria andS66NotBetween(Double value1, Double value2) {
            addCriterion("s_6_6 not between", value1, value2, "s66");
            return (Criteria) this;
        }

        public Criteria andS77IsNull() {
            addCriterion("s_7_7 is null");
            return (Criteria) this;
        }

        public Criteria andS77IsNotNull() {
            addCriterion("s_7_7 is not null");
            return (Criteria) this;
        }

        public Criteria andS77EqualTo(Double value) {
            addCriterion("s_7_7 =", value, "s77");
            return (Criteria) this;
        }

        public Criteria andS77NotEqualTo(Double value) {
            addCriterion("s_7_7 <>", value, "s77");
            return (Criteria) this;
        }

        public Criteria andS77GreaterThan(Double value) {
            addCriterion("s_7_7 >", value, "s77");
            return (Criteria) this;
        }

        public Criteria andS77GreaterThanOrEqualTo(Double value) {
            addCriterion("s_7_7 >=", value, "s77");
            return (Criteria) this;
        }

        public Criteria andS77LessThan(Double value) {
            addCriterion("s_7_7 <", value, "s77");
            return (Criteria) this;
        }

        public Criteria andS77LessThanOrEqualTo(Double value) {
            addCriterion("s_7_7 <=", value, "s77");
            return (Criteria) this;
        }

        public Criteria andS77In(List<Double> values) {
            addCriterion("s_7_7 in", values, "s77");
            return (Criteria) this;
        }

        public Criteria andS77NotIn(List<Double> values) {
            addCriterion("s_7_7 not in", values, "s77");
            return (Criteria) this;
        }

        public Criteria andS77Between(Double value1, Double value2) {
            addCriterion("s_7_7 between", value1, value2, "s77");
            return (Criteria) this;
        }

        public Criteria andS77NotBetween(Double value1, Double value2) {
            addCriterion("s_7_7 not between", value1, value2, "s77");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIsNull() {
            addCriterion("session_type is null");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIsNotNull() {
            addCriterion("session_type is not null");
            return (Criteria) this;
        }

        public Criteria andSessionTypeEqualTo(Integer value) {
            addCriterion("session_type =", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotEqualTo(Integer value) {
            addCriterion("session_type <>", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThan(Integer value) {
            addCriterion("session_type >", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_type >=", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThan(Integer value) {
            addCriterion("session_type <", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("session_type <=", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIn(List<Integer> values) {
            addCriterion("session_type in", values, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotIn(List<Integer> values) {
            addCriterion("session_type not in", values, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeBetween(Integer value1, Integer value2) {
            addCriterion("session_type between", value1, value2, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("session_type not between", value1, value2, "sessionType");
            return (Criteria) this;
        }

        public Criteria andHostTypeIsNull() {
            addCriterion("host_type is null");
            return (Criteria) this;
        }

        public Criteria andHostTypeIsNotNull() {
            addCriterion("host_type is not null");
            return (Criteria) this;
        }

        public Criteria andHostTypeEqualTo(Integer value) {
            addCriterion("host_type =", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotEqualTo(Integer value) {
            addCriterion("host_type <>", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeGreaterThan(Integer value) {
            addCriterion("host_type >", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_type >=", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeLessThan(Integer value) {
            addCriterion("host_type <", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeLessThanOrEqualTo(Integer value) {
            addCriterion("host_type <=", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeIn(List<Integer> values) {
            addCriterion("host_type in", values, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotIn(List<Integer> values) {
            addCriterion("host_type not in", values, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeBetween(Integer value1, Integer value2) {
            addCriterion("host_type between", value1, value2, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("host_type not between", value1, value2, "hostType");
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