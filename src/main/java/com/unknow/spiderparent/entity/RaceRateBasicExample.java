package com.unknow.spiderparent.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaceRateBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceRateBasicExample() {
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

        public Criteria andFullHostWinIsNull() {
            addCriterion("full_host_win is null");
            return (Criteria) this;
        }

        public Criteria andFullHostWinIsNotNull() {
            addCriterion("full_host_win is not null");
            return (Criteria) this;
        }

        public Criteria andFullHostWinEqualTo(Double value) {
            addCriterion("full_host_win =", value, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinNotEqualTo(Double value) {
            addCriterion("full_host_win <>", value, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinGreaterThan(Double value) {
            addCriterion("full_host_win >", value, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinGreaterThanOrEqualTo(Double value) {
            addCriterion("full_host_win >=", value, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinLessThan(Double value) {
            addCriterion("full_host_win <", value, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinLessThanOrEqualTo(Double value) {
            addCriterion("full_host_win <=", value, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinIn(List<Double> values) {
            addCriterion("full_host_win in", values, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinNotIn(List<Double> values) {
            addCriterion("full_host_win not in", values, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinBetween(Double value1, Double value2) {
            addCriterion("full_host_win between", value1, value2, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullHostWinNotBetween(Double value1, Double value2) {
            addCriterion("full_host_win not between", value1, value2, "fullHostWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinIsNull() {
            addCriterion("full_guest_win is null");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinIsNotNull() {
            addCriterion("full_guest_win is not null");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinEqualTo(Double value) {
            addCriterion("full_guest_win =", value, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinNotEqualTo(Double value) {
            addCriterion("full_guest_win <>", value, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinGreaterThan(Double value) {
            addCriterion("full_guest_win >", value, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinGreaterThanOrEqualTo(Double value) {
            addCriterion("full_guest_win >=", value, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinLessThan(Double value) {
            addCriterion("full_guest_win <", value, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinLessThanOrEqualTo(Double value) {
            addCriterion("full_guest_win <=", value, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinIn(List<Double> values) {
            addCriterion("full_guest_win in", values, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinNotIn(List<Double> values) {
            addCriterion("full_guest_win not in", values, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinBetween(Double value1, Double value2) {
            addCriterion("full_guest_win between", value1, value2, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullGuestWinNotBetween(Double value1, Double value2) {
            addCriterion("full_guest_win not between", value1, value2, "fullGuestWin");
            return (Criteria) this;
        }

        public Criteria andFullDrawIsNull() {
            addCriterion("full_draw is null");
            return (Criteria) this;
        }

        public Criteria andFullDrawIsNotNull() {
            addCriterion("full_draw is not null");
            return (Criteria) this;
        }

        public Criteria andFullDrawEqualTo(Double value) {
            addCriterion("full_draw =", value, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawNotEqualTo(Double value) {
            addCriterion("full_draw <>", value, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawGreaterThan(Double value) {
            addCriterion("full_draw >", value, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawGreaterThanOrEqualTo(Double value) {
            addCriterion("full_draw >=", value, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawLessThan(Double value) {
            addCriterion("full_draw <", value, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawLessThanOrEqualTo(Double value) {
            addCriterion("full_draw <=", value, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawIn(List<Double> values) {
            addCriterion("full_draw in", values, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawNotIn(List<Double> values) {
            addCriterion("full_draw not in", values, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawBetween(Double value1, Double value2) {
            addCriterion("full_draw between", value1, value2, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andFullDrawNotBetween(Double value1, Double value2) {
            addCriterion("full_draw not between", value1, value2, "fullDraw");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinIsNull() {
            addCriterion("half_host_win is null");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinIsNotNull() {
            addCriterion("half_host_win is not null");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinEqualTo(Double value) {
            addCriterion("half_host_win =", value, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinNotEqualTo(Double value) {
            addCriterion("half_host_win <>", value, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinGreaterThan(Double value) {
            addCriterion("half_host_win >", value, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinGreaterThanOrEqualTo(Double value) {
            addCriterion("half_host_win >=", value, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinLessThan(Double value) {
            addCriterion("half_host_win <", value, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinLessThanOrEqualTo(Double value) {
            addCriterion("half_host_win <=", value, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinIn(List<Double> values) {
            addCriterion("half_host_win in", values, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinNotIn(List<Double> values) {
            addCriterion("half_host_win not in", values, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinBetween(Double value1, Double value2) {
            addCriterion("half_host_win between", value1, value2, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfHostWinNotBetween(Double value1, Double value2) {
            addCriterion("half_host_win not between", value1, value2, "halfHostWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinIsNull() {
            addCriterion("half_guest_win is null");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinIsNotNull() {
            addCriterion("half_guest_win is not null");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinEqualTo(Double value) {
            addCriterion("half_guest_win =", value, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinNotEqualTo(Double value) {
            addCriterion("half_guest_win <>", value, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinGreaterThan(Double value) {
            addCriterion("half_guest_win >", value, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinGreaterThanOrEqualTo(Double value) {
            addCriterion("half_guest_win >=", value, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinLessThan(Double value) {
            addCriterion("half_guest_win <", value, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinLessThanOrEqualTo(Double value) {
            addCriterion("half_guest_win <=", value, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinIn(List<Double> values) {
            addCriterion("half_guest_win in", values, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinNotIn(List<Double> values) {
            addCriterion("half_guest_win not in", values, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinBetween(Double value1, Double value2) {
            addCriterion("half_guest_win between", value1, value2, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfGuestWinNotBetween(Double value1, Double value2) {
            addCriterion("half_guest_win not between", value1, value2, "halfGuestWin");
            return (Criteria) this;
        }

        public Criteria andHalfDrawIsNull() {
            addCriterion("half_draw is null");
            return (Criteria) this;
        }

        public Criteria andHalfDrawIsNotNull() {
            addCriterion("half_draw is not null");
            return (Criteria) this;
        }

        public Criteria andHalfDrawEqualTo(Double value) {
            addCriterion("half_draw =", value, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawNotEqualTo(Double value) {
            addCriterion("half_draw <>", value, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawGreaterThan(Double value) {
            addCriterion("half_draw >", value, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawGreaterThanOrEqualTo(Double value) {
            addCriterion("half_draw >=", value, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawLessThan(Double value) {
            addCriterion("half_draw <", value, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawLessThanOrEqualTo(Double value) {
            addCriterion("half_draw <=", value, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawIn(List<Double> values) {
            addCriterion("half_draw in", values, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawNotIn(List<Double> values) {
            addCriterion("half_draw not in", values, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawBetween(Double value1, Double value2) {
            addCriterion("half_draw between", value1, value2, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHalfDrawNotBetween(Double value1, Double value2) {
            addCriterion("half_draw not between", value1, value2, "halfDraw");
            return (Criteria) this;
        }

        public Criteria andHostHostIsNull() {
            addCriterion("host_host is null");
            return (Criteria) this;
        }

        public Criteria andHostHostIsNotNull() {
            addCriterion("host_host is not null");
            return (Criteria) this;
        }

        public Criteria andHostHostEqualTo(Double value) {
            addCriterion("host_host =", value, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostNotEqualTo(Double value) {
            addCriterion("host_host <>", value, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostGreaterThan(Double value) {
            addCriterion("host_host >", value, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostGreaterThanOrEqualTo(Double value) {
            addCriterion("host_host >=", value, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostLessThan(Double value) {
            addCriterion("host_host <", value, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostLessThanOrEqualTo(Double value) {
            addCriterion("host_host <=", value, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostIn(List<Double> values) {
            addCriterion("host_host in", values, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostNotIn(List<Double> values) {
            addCriterion("host_host not in", values, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostBetween(Double value1, Double value2) {
            addCriterion("host_host between", value1, value2, "hostHost");
            return (Criteria) this;
        }

        public Criteria andHostHostNotBetween(Double value1, Double value2) {
            addCriterion("host_host not between", value1, value2, "hostHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostIsNull() {
            addCriterion("draw_host is null");
            return (Criteria) this;
        }

        public Criteria andDrawHostIsNotNull() {
            addCriterion("draw_host is not null");
            return (Criteria) this;
        }

        public Criteria andDrawHostEqualTo(Double value) {
            addCriterion("draw_host =", value, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostNotEqualTo(Double value) {
            addCriterion("draw_host <>", value, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostGreaterThan(Double value) {
            addCriterion("draw_host >", value, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostGreaterThanOrEqualTo(Double value) {
            addCriterion("draw_host >=", value, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostLessThan(Double value) {
            addCriterion("draw_host <", value, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostLessThanOrEqualTo(Double value) {
            addCriterion("draw_host <=", value, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostIn(List<Double> values) {
            addCriterion("draw_host in", values, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostNotIn(List<Double> values) {
            addCriterion("draw_host not in", values, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostBetween(Double value1, Double value2) {
            addCriterion("draw_host between", value1, value2, "drawHost");
            return (Criteria) this;
        }

        public Criteria andDrawHostNotBetween(Double value1, Double value2) {
            addCriterion("draw_host not between", value1, value2, "drawHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostIsNull() {
            addCriterion("guest_host is null");
            return (Criteria) this;
        }

        public Criteria andGuestHostIsNotNull() {
            addCriterion("guest_host is not null");
            return (Criteria) this;
        }

        public Criteria andGuestHostEqualTo(Double value) {
            addCriterion("guest_host =", value, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostNotEqualTo(Double value) {
            addCriterion("guest_host <>", value, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostGreaterThan(Double value) {
            addCriterion("guest_host >", value, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostGreaterThanOrEqualTo(Double value) {
            addCriterion("guest_host >=", value, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostLessThan(Double value) {
            addCriterion("guest_host <", value, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostLessThanOrEqualTo(Double value) {
            addCriterion("guest_host <=", value, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostIn(List<Double> values) {
            addCriterion("guest_host in", values, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostNotIn(List<Double> values) {
            addCriterion("guest_host not in", values, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostBetween(Double value1, Double value2) {
            addCriterion("guest_host between", value1, value2, "guestHost");
            return (Criteria) this;
        }

        public Criteria andGuestHostNotBetween(Double value1, Double value2) {
            addCriterion("guest_host not between", value1, value2, "guestHost");
            return (Criteria) this;
        }

        public Criteria andDrawDrawIsNull() {
            addCriterion("draw_draw is null");
            return (Criteria) this;
        }

        public Criteria andDrawDrawIsNotNull() {
            addCriterion("draw_draw is not null");
            return (Criteria) this;
        }

        public Criteria andDrawDrawEqualTo(Double value) {
            addCriterion("draw_draw =", value, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawNotEqualTo(Double value) {
            addCriterion("draw_draw <>", value, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawGreaterThan(Double value) {
            addCriterion("draw_draw >", value, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawGreaterThanOrEqualTo(Double value) {
            addCriterion("draw_draw >=", value, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawLessThan(Double value) {
            addCriterion("draw_draw <", value, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawLessThanOrEqualTo(Double value) {
            addCriterion("draw_draw <=", value, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawIn(List<Double> values) {
            addCriterion("draw_draw in", values, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawNotIn(List<Double> values) {
            addCriterion("draw_draw not in", values, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawBetween(Double value1, Double value2) {
            addCriterion("draw_draw between", value1, value2, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andDrawDrawNotBetween(Double value1, Double value2) {
            addCriterion("draw_draw not between", value1, value2, "drawDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawIsNull() {
            addCriterion("host_draw is null");
            return (Criteria) this;
        }

        public Criteria andHostDrawIsNotNull() {
            addCriterion("host_draw is not null");
            return (Criteria) this;
        }

        public Criteria andHostDrawEqualTo(Double value) {
            addCriterion("host_draw =", value, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawNotEqualTo(Double value) {
            addCriterion("host_draw <>", value, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawGreaterThan(Double value) {
            addCriterion("host_draw >", value, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawGreaterThanOrEqualTo(Double value) {
            addCriterion("host_draw >=", value, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawLessThan(Double value) {
            addCriterion("host_draw <", value, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawLessThanOrEqualTo(Double value) {
            addCriterion("host_draw <=", value, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawIn(List<Double> values) {
            addCriterion("host_draw in", values, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawNotIn(List<Double> values) {
            addCriterion("host_draw not in", values, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawBetween(Double value1, Double value2) {
            addCriterion("host_draw between", value1, value2, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andHostDrawNotBetween(Double value1, Double value2) {
            addCriterion("host_draw not between", value1, value2, "hostDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawIsNull() {
            addCriterion("guest_draw is null");
            return (Criteria) this;
        }

        public Criteria andGuestDrawIsNotNull() {
            addCriterion("guest_draw is not null");
            return (Criteria) this;
        }

        public Criteria andGuestDrawEqualTo(Double value) {
            addCriterion("guest_draw =", value, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawNotEqualTo(Double value) {
            addCriterion("guest_draw <>", value, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawGreaterThan(Double value) {
            addCriterion("guest_draw >", value, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawGreaterThanOrEqualTo(Double value) {
            addCriterion("guest_draw >=", value, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawLessThan(Double value) {
            addCriterion("guest_draw <", value, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawLessThanOrEqualTo(Double value) {
            addCriterion("guest_draw <=", value, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawIn(List<Double> values) {
            addCriterion("guest_draw in", values, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawNotIn(List<Double> values) {
            addCriterion("guest_draw not in", values, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawBetween(Double value1, Double value2) {
            addCriterion("guest_draw between", value1, value2, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestDrawNotBetween(Double value1, Double value2) {
            addCriterion("guest_draw not between", value1, value2, "guestDraw");
            return (Criteria) this;
        }

        public Criteria andGuestGuestIsNull() {
            addCriterion("guest_guest is null");
            return (Criteria) this;
        }

        public Criteria andGuestGuestIsNotNull() {
            addCriterion("guest_guest is not null");
            return (Criteria) this;
        }

        public Criteria andGuestGuestEqualTo(Double value) {
            addCriterion("guest_guest =", value, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestNotEqualTo(Double value) {
            addCriterion("guest_guest <>", value, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestGreaterThan(Double value) {
            addCriterion("guest_guest >", value, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestGreaterThanOrEqualTo(Double value) {
            addCriterion("guest_guest >=", value, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestLessThan(Double value) {
            addCriterion("guest_guest <", value, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestLessThanOrEqualTo(Double value) {
            addCriterion("guest_guest <=", value, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestIn(List<Double> values) {
            addCriterion("guest_guest in", values, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestNotIn(List<Double> values) {
            addCriterion("guest_guest not in", values, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestBetween(Double value1, Double value2) {
            addCriterion("guest_guest between", value1, value2, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andGuestGuestNotBetween(Double value1, Double value2) {
            addCriterion("guest_guest not between", value1, value2, "guestGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestIsNull() {
            addCriterion("draw_guest is null");
            return (Criteria) this;
        }

        public Criteria andDrawGuestIsNotNull() {
            addCriterion("draw_guest is not null");
            return (Criteria) this;
        }

        public Criteria andDrawGuestEqualTo(Double value) {
            addCriterion("draw_guest =", value, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestNotEqualTo(Double value) {
            addCriterion("draw_guest <>", value, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestGreaterThan(Double value) {
            addCriterion("draw_guest >", value, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestGreaterThanOrEqualTo(Double value) {
            addCriterion("draw_guest >=", value, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestLessThan(Double value) {
            addCriterion("draw_guest <", value, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestLessThanOrEqualTo(Double value) {
            addCriterion("draw_guest <=", value, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestIn(List<Double> values) {
            addCriterion("draw_guest in", values, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestNotIn(List<Double> values) {
            addCriterion("draw_guest not in", values, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestBetween(Double value1, Double value2) {
            addCriterion("draw_guest between", value1, value2, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andDrawGuestNotBetween(Double value1, Double value2) {
            addCriterion("draw_guest not between", value1, value2, "drawGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestIsNull() {
            addCriterion("host_guest is null");
            return (Criteria) this;
        }

        public Criteria andHostGuestIsNotNull() {
            addCriterion("host_guest is not null");
            return (Criteria) this;
        }

        public Criteria andHostGuestEqualTo(Double value) {
            addCriterion("host_guest =", value, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestNotEqualTo(Double value) {
            addCriterion("host_guest <>", value, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestGreaterThan(Double value) {
            addCriterion("host_guest >", value, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestGreaterThanOrEqualTo(Double value) {
            addCriterion("host_guest >=", value, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestLessThan(Double value) {
            addCriterion("host_guest <", value, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestLessThanOrEqualTo(Double value) {
            addCriterion("host_guest <=", value, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestIn(List<Double> values) {
            addCriterion("host_guest in", values, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestNotIn(List<Double> values) {
            addCriterion("host_guest not in", values, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestBetween(Double value1, Double value2) {
            addCriterion("host_guest between", value1, value2, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHostGuestNotBetween(Double value1, Double value2) {
            addCriterion("host_guest not between", value1, value2, "hostGuest");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreIsNull() {
            addCriterion("half_score_more is null");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreIsNotNull() {
            addCriterion("half_score_more is not null");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreEqualTo(Double value) {
            addCriterion("half_score_more =", value, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreNotEqualTo(Double value) {
            addCriterion("half_score_more <>", value, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreGreaterThan(Double value) {
            addCriterion("half_score_more >", value, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreGreaterThanOrEqualTo(Double value) {
            addCriterion("half_score_more >=", value, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreLessThan(Double value) {
            addCriterion("half_score_more <", value, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreLessThanOrEqualTo(Double value) {
            addCriterion("half_score_more <=", value, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreIn(List<Double> values) {
            addCriterion("half_score_more in", values, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreNotIn(List<Double> values) {
            addCriterion("half_score_more not in", values, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreBetween(Double value1, Double value2) {
            addCriterion("half_score_more between", value1, value2, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfScoreMoreNotBetween(Double value1, Double value2) {
            addCriterion("half_score_more not between", value1, value2, "halfScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreIsNull() {
            addCriterion("full_score_more is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreIsNotNull() {
            addCriterion("full_score_more is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreEqualTo(Double value) {
            addCriterion("full_score_more =", value, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreNotEqualTo(Double value) {
            addCriterion("full_score_more <>", value, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreGreaterThan(Double value) {
            addCriterion("full_score_more >", value, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreGreaterThanOrEqualTo(Double value) {
            addCriterion("full_score_more >=", value, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreLessThan(Double value) {
            addCriterion("full_score_more <", value, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreLessThanOrEqualTo(Double value) {
            addCriterion("full_score_more <=", value, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreIn(List<Double> values) {
            addCriterion("full_score_more in", values, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreNotIn(List<Double> values) {
            addCriterion("full_score_more not in", values, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreBetween(Double value1, Double value2) {
            addCriterion("full_score_more between", value1, value2, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andFullScoreMoreNotBetween(Double value1, Double value2) {
            addCriterion("full_score_more not between", value1, value2, "fullScoreMore");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawIsNull() {
            addCriterion("half_full_score_draw is null");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawIsNotNull() {
            addCriterion("half_full_score_draw is not null");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawEqualTo(Double value) {
            addCriterion("half_full_score_draw =", value, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawNotEqualTo(Double value) {
            addCriterion("half_full_score_draw <>", value, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawGreaterThan(Double value) {
            addCriterion("half_full_score_draw >", value, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawGreaterThanOrEqualTo(Double value) {
            addCriterion("half_full_score_draw >=", value, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawLessThan(Double value) {
            addCriterion("half_full_score_draw <", value, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawLessThanOrEqualTo(Double value) {
            addCriterion("half_full_score_draw <=", value, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawIn(List<Double> values) {
            addCriterion("half_full_score_draw in", values, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawNotIn(List<Double> values) {
            addCriterion("half_full_score_draw not in", values, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawBetween(Double value1, Double value2) {
            addCriterion("half_full_score_draw between", value1, value2, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHalfFullScoreDrawNotBetween(Double value1, Double value2) {
            addCriterion("half_full_score_draw not between", value1, value2, "halfFullScoreDraw");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreIsNull() {
            addCriterion("host_first_score is null");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreIsNotNull() {
            addCriterion("host_first_score is not null");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreEqualTo(Double value) {
            addCriterion("host_first_score =", value, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreNotEqualTo(Double value) {
            addCriterion("host_first_score <>", value, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreGreaterThan(Double value) {
            addCriterion("host_first_score >", value, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("host_first_score >=", value, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreLessThan(Double value) {
            addCriterion("host_first_score <", value, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreLessThanOrEqualTo(Double value) {
            addCriterion("host_first_score <=", value, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreIn(List<Double> values) {
            addCriterion("host_first_score in", values, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreNotIn(List<Double> values) {
            addCriterion("host_first_score not in", values, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreBetween(Double value1, Double value2) {
            addCriterion("host_first_score between", value1, value2, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andHostFirstScoreNotBetween(Double value1, Double value2) {
            addCriterion("host_first_score not between", value1, value2, "hostFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreIsNull() {
            addCriterion("guest_first_score is null");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreIsNotNull() {
            addCriterion("guest_first_score is not null");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreEqualTo(Double value) {
            addCriterion("guest_first_score =", value, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreNotEqualTo(Double value) {
            addCriterion("guest_first_score <>", value, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreGreaterThan(Double value) {
            addCriterion("guest_first_score >", value, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("guest_first_score >=", value, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreLessThan(Double value) {
            addCriterion("guest_first_score <", value, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreLessThanOrEqualTo(Double value) {
            addCriterion("guest_first_score <=", value, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreIn(List<Double> values) {
            addCriterion("guest_first_score in", values, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreNotIn(List<Double> values) {
            addCriterion("guest_first_score not in", values, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreBetween(Double value1, Double value2) {
            addCriterion("guest_first_score between", value1, value2, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andGuestFirstScoreNotBetween(Double value1, Double value2) {
            addCriterion("guest_first_score not between", value1, value2, "guestFirstScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreIsNull() {
            addCriterion("no_score is null");
            return (Criteria) this;
        }

        public Criteria andNoScoreIsNotNull() {
            addCriterion("no_score is not null");
            return (Criteria) this;
        }

        public Criteria andNoScoreEqualTo(Double value) {
            addCriterion("no_score =", value, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreNotEqualTo(Double value) {
            addCriterion("no_score <>", value, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreGreaterThan(Double value) {
            addCriterion("no_score >", value, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("no_score >=", value, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreLessThan(Double value) {
            addCriterion("no_score <", value, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreLessThanOrEqualTo(Double value) {
            addCriterion("no_score <=", value, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreIn(List<Double> values) {
            addCriterion("no_score in", values, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreNotIn(List<Double> values) {
            addCriterion("no_score not in", values, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreBetween(Double value1, Double value2) {
            addCriterion("no_score between", value1, value2, "noScore");
            return (Criteria) this;
        }

        public Criteria andNoScoreNotBetween(Double value1, Double value2) {
            addCriterion("no_score not between", value1, value2, "noScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01IsNull() {
            addCriterion("full_score_range_0_1 is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01IsNotNull() {
            addCriterion("full_score_range_0_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01EqualTo(Double value) {
            addCriterion("full_score_range_0_1 =", value, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01NotEqualTo(Double value) {
            addCriterion("full_score_range_0_1 <>", value, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01GreaterThan(Double value) {
            addCriterion("full_score_range_0_1 >", value, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01GreaterThanOrEqualTo(Double value) {
            addCriterion("full_score_range_0_1 >=", value, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01LessThan(Double value) {
            addCriterion("full_score_range_0_1 <", value, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01LessThanOrEqualTo(Double value) {
            addCriterion("full_score_range_0_1 <=", value, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01In(List<Double> values) {
            addCriterion("full_score_range_0_1 in", values, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01NotIn(List<Double> values) {
            addCriterion("full_score_range_0_1 not in", values, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01Between(Double value1, Double value2) {
            addCriterion("full_score_range_0_1 between", value1, value2, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange01NotBetween(Double value1, Double value2) {
            addCriterion("full_score_range_0_1 not between", value1, value2, "fullScoreRange01");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23IsNull() {
            addCriterion("full_score_range_2_3 is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23IsNotNull() {
            addCriterion("full_score_range_2_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23EqualTo(Double value) {
            addCriterion("full_score_range_2_3 =", value, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23NotEqualTo(Double value) {
            addCriterion("full_score_range_2_3 <>", value, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23GreaterThan(Double value) {
            addCriterion("full_score_range_2_3 >", value, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23GreaterThanOrEqualTo(Double value) {
            addCriterion("full_score_range_2_3 >=", value, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23LessThan(Double value) {
            addCriterion("full_score_range_2_3 <", value, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23LessThanOrEqualTo(Double value) {
            addCriterion("full_score_range_2_3 <=", value, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23In(List<Double> values) {
            addCriterion("full_score_range_2_3 in", values, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23NotIn(List<Double> values) {
            addCriterion("full_score_range_2_3 not in", values, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23Between(Double value1, Double value2) {
            addCriterion("full_score_range_2_3 between", value1, value2, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange23NotBetween(Double value1, Double value2) {
            addCriterion("full_score_range_2_3 not between", value1, value2, "fullScoreRange23");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpIsNull() {
            addCriterion("full_score_range_3_up is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpIsNotNull() {
            addCriterion("full_score_range_3_up is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpEqualTo(Double value) {
            addCriterion("full_score_range_3_up =", value, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpNotEqualTo(Double value) {
            addCriterion("full_score_range_3_up <>", value, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpGreaterThan(Double value) {
            addCriterion("full_score_range_3_up >", value, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpGreaterThanOrEqualTo(Double value) {
            addCriterion("full_score_range_3_up >=", value, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpLessThan(Double value) {
            addCriterion("full_score_range_3_up <", value, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpLessThanOrEqualTo(Double value) {
            addCriterion("full_score_range_3_up <=", value, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpIn(List<Double> values) {
            addCriterion("full_score_range_3_up in", values, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpNotIn(List<Double> values) {
            addCriterion("full_score_range_3_up not in", values, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpBetween(Double value1, Double value2) {
            addCriterion("full_score_range_3_up between", value1, value2, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreRange3UpNotBetween(Double value1, Double value2) {
            addCriterion("full_score_range_3_up not between", value1, value2, "fullScoreRange3Up");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddIsNull() {
            addCriterion("full_score_odd is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddIsNotNull() {
            addCriterion("full_score_odd is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddEqualTo(Double value) {
            addCriterion("full_score_odd =", value, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddNotEqualTo(Double value) {
            addCriterion("full_score_odd <>", value, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddGreaterThan(Double value) {
            addCriterion("full_score_odd >", value, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddGreaterThanOrEqualTo(Double value) {
            addCriterion("full_score_odd >=", value, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddLessThan(Double value) {
            addCriterion("full_score_odd <", value, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddLessThanOrEqualTo(Double value) {
            addCriterion("full_score_odd <=", value, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddIn(List<Double> values) {
            addCriterion("full_score_odd in", values, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddNotIn(List<Double> values) {
            addCriterion("full_score_odd not in", values, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddBetween(Double value1, Double value2) {
            addCriterion("full_score_odd between", value1, value2, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreOddNotBetween(Double value1, Double value2) {
            addCriterion("full_score_odd not between", value1, value2, "fullScoreOdd");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenIsNull() {
            addCriterion("full_score_even is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenIsNotNull() {
            addCriterion("full_score_even is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenEqualTo(Double value) {
            addCriterion("full_score_even =", value, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenNotEqualTo(Double value) {
            addCriterion("full_score_even <>", value, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenGreaterThan(Double value) {
            addCriterion("full_score_even >", value, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenGreaterThanOrEqualTo(Double value) {
            addCriterion("full_score_even >=", value, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenLessThan(Double value) {
            addCriterion("full_score_even <", value, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenLessThanOrEqualTo(Double value) {
            addCriterion("full_score_even <=", value, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenIn(List<Double> values) {
            addCriterion("full_score_even in", values, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenNotIn(List<Double> values) {
            addCriterion("full_score_even not in", values, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenBetween(Double value1, Double value2) {
            addCriterion("full_score_even between", value1, value2, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andFullScoreEvenNotBetween(Double value1, Double value2) {
            addCriterion("full_score_even not between", value1, value2, "fullScoreEven");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreIsNull() {
            addCriterion("half_all_score is null");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreIsNotNull() {
            addCriterion("half_all_score is not null");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreEqualTo(Double value) {
            addCriterion("half_all_score =", value, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNotEqualTo(Double value) {
            addCriterion("half_all_score <>", value, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreGreaterThan(Double value) {
            addCriterion("half_all_score >", value, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("half_all_score >=", value, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreLessThan(Double value) {
            addCriterion("half_all_score <", value, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreLessThanOrEqualTo(Double value) {
            addCriterion("half_all_score <=", value, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreIn(List<Double> values) {
            addCriterion("half_all_score in", values, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNotIn(List<Double> values) {
            addCriterion("half_all_score not in", values, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreBetween(Double value1, Double value2) {
            addCriterion("half_all_score between", value1, value2, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNotBetween(Double value1, Double value2) {
            addCriterion("half_all_score not between", value1, value2, "halfAllScore");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoIsNull() {
            addCriterion("half_all_score_no is null");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoIsNotNull() {
            addCriterion("half_all_score_no is not null");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoEqualTo(Double value) {
            addCriterion("half_all_score_no =", value, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoNotEqualTo(Double value) {
            addCriterion("half_all_score_no <>", value, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoGreaterThan(Double value) {
            addCriterion("half_all_score_no >", value, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoGreaterThanOrEqualTo(Double value) {
            addCriterion("half_all_score_no >=", value, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoLessThan(Double value) {
            addCriterion("half_all_score_no <", value, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoLessThanOrEqualTo(Double value) {
            addCriterion("half_all_score_no <=", value, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoIn(List<Double> values) {
            addCriterion("half_all_score_no in", values, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoNotIn(List<Double> values) {
            addCriterion("half_all_score_no not in", values, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoBetween(Double value1, Double value2) {
            addCriterion("half_all_score_no between", value1, value2, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andHalfAllScoreNoNotBetween(Double value1, Double value2) {
            addCriterion("half_all_score_no not between", value1, value2, "halfAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreIsNull() {
            addCriterion("full_all_score is null");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreIsNotNull() {
            addCriterion("full_all_score is not null");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreEqualTo(Double value) {
            addCriterion("full_all_score =", value, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNotEqualTo(Double value) {
            addCriterion("full_all_score <>", value, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreGreaterThan(Double value) {
            addCriterion("full_all_score >", value, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("full_all_score >=", value, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreLessThan(Double value) {
            addCriterion("full_all_score <", value, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreLessThanOrEqualTo(Double value) {
            addCriterion("full_all_score <=", value, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreIn(List<Double> values) {
            addCriterion("full_all_score in", values, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNotIn(List<Double> values) {
            addCriterion("full_all_score not in", values, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreBetween(Double value1, Double value2) {
            addCriterion("full_all_score between", value1, value2, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNotBetween(Double value1, Double value2) {
            addCriterion("full_all_score not between", value1, value2, "fullAllScore");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoIsNull() {
            addCriterion("full_all_score_no is null");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoIsNotNull() {
            addCriterion("full_all_score_no is not null");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoEqualTo(Double value) {
            addCriterion("full_all_score_no =", value, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoNotEqualTo(Double value) {
            addCriterion("full_all_score_no <>", value, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoGreaterThan(Double value) {
            addCriterion("full_all_score_no >", value, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoGreaterThanOrEqualTo(Double value) {
            addCriterion("full_all_score_no >=", value, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoLessThan(Double value) {
            addCriterion("full_all_score_no <", value, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoLessThanOrEqualTo(Double value) {
            addCriterion("full_all_score_no <=", value, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoIn(List<Double> values) {
            addCriterion("full_all_score_no in", values, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoNotIn(List<Double> values) {
            addCriterion("full_all_score_no not in", values, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoBetween(Double value1, Double value2) {
            addCriterion("full_all_score_no between", value1, value2, "fullAllScoreNo");
            return (Criteria) this;
        }

        public Criteria andFullAllScoreNoNotBetween(Double value1, Double value2) {
            addCriterion("full_all_score_no not between", value1, value2, "fullAllScoreNo");
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