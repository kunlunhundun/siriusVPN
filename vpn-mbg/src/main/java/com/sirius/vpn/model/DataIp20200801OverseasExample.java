package com.sirius.vpn.model;

import java.util.ArrayList;
import java.util.List;

public class DataIp20200801OverseasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataIp20200801OverseasExample() {
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

        public Criteria andIpStartIsNull() {
            addCriterion("ip_start is null");
            return (Criteria) this;
        }

        public Criteria andIpStartIsNotNull() {
            addCriterion("ip_start is not null");
            return (Criteria) this;
        }

        public Criteria andIpStartEqualTo(String value) {
            addCriterion("ip_start =", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotEqualTo(String value) {
            addCriterion("ip_start <>", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartGreaterThan(String value) {
            addCriterion("ip_start >", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartGreaterThanOrEqualTo(String value) {
            addCriterion("ip_start >=", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartLessThan(String value) {
            addCriterion("ip_start <", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartLessThanOrEqualTo(String value) {
            addCriterion("ip_start <=", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartLike(String value) {
            addCriterion("ip_start like", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotLike(String value) {
            addCriterion("ip_start not like", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartIn(List<String> values) {
            addCriterion("ip_start in", values, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotIn(List<String> values) {
            addCriterion("ip_start not in", values, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartBetween(String value1, String value2) {
            addCriterion("ip_start between", value1, value2, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotBetween(String value1, String value2) {
            addCriterion("ip_start not between", value1, value2, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpEndIsNull() {
            addCriterion("ip_end is null");
            return (Criteria) this;
        }

        public Criteria andIpEndIsNotNull() {
            addCriterion("ip_end is not null");
            return (Criteria) this;
        }

        public Criteria andIpEndEqualTo(String value) {
            addCriterion("ip_end =", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotEqualTo(String value) {
            addCriterion("ip_end <>", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndGreaterThan(String value) {
            addCriterion("ip_end >", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndGreaterThanOrEqualTo(String value) {
            addCriterion("ip_end >=", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndLessThan(String value) {
            addCriterion("ip_end <", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndLessThanOrEqualTo(String value) {
            addCriterion("ip_end <=", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndLike(String value) {
            addCriterion("ip_end like", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotLike(String value) {
            addCriterion("ip_end not like", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndIn(List<String> values) {
            addCriterion("ip_end in", values, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotIn(List<String> values) {
            addCriterion("ip_end not in", values, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndBetween(String value1, String value2) {
            addCriterion("ip_end between", value1, value2, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotBetween(String value1, String value2) {
            addCriterion("ip_end not between", value1, value2, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andNumStartIsNull() {
            addCriterion("num_start is null");
            return (Criteria) this;
        }

        public Criteria andNumStartIsNotNull() {
            addCriterion("num_start is not null");
            return (Criteria) this;
        }

        public Criteria andNumStartEqualTo(Long value) {
            addCriterion("num_start =", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartNotEqualTo(Long value) {
            addCriterion("num_start <>", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartGreaterThan(Long value) {
            addCriterion("num_start >", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartGreaterThanOrEqualTo(Long value) {
            addCriterion("num_start >=", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartLessThan(Long value) {
            addCriterion("num_start <", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartLessThanOrEqualTo(Long value) {
            addCriterion("num_start <=", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartIn(List<Long> values) {
            addCriterion("num_start in", values, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartNotIn(List<Long> values) {
            addCriterion("num_start not in", values, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartBetween(Long value1, Long value2) {
            addCriterion("num_start between", value1, value2, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartNotBetween(Long value1, Long value2) {
            addCriterion("num_start not between", value1, value2, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumEndIsNull() {
            addCriterion("num_end is null");
            return (Criteria) this;
        }

        public Criteria andNumEndIsNotNull() {
            addCriterion("num_end is not null");
            return (Criteria) this;
        }

        public Criteria andNumEndEqualTo(Long value) {
            addCriterion("num_end =", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndNotEqualTo(Long value) {
            addCriterion("num_end <>", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndGreaterThan(Long value) {
            addCriterion("num_end >", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndGreaterThanOrEqualTo(Long value) {
            addCriterion("num_end >=", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndLessThan(Long value) {
            addCriterion("num_end <", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndLessThanOrEqualTo(Long value) {
            addCriterion("num_end <=", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndIn(List<Long> values) {
            addCriterion("num_end in", values, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndNotIn(List<Long> values) {
            addCriterion("num_end not in", values, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndBetween(Long value1, Long value2) {
            addCriterion("num_end between", value1, value2, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndNotBetween(Long value1, Long value2) {
            addCriterion("num_end not between", value1, value2, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andLandIsNull() {
            addCriterion("land is null");
            return (Criteria) this;
        }

        public Criteria andLandIsNotNull() {
            addCriterion("land is not null");
            return (Criteria) this;
        }

        public Criteria andLandEqualTo(String value) {
            addCriterion("land =", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandNotEqualTo(String value) {
            addCriterion("land <>", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandGreaterThan(String value) {
            addCriterion("land >", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandGreaterThanOrEqualTo(String value) {
            addCriterion("land >=", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandLessThan(String value) {
            addCriterion("land <", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandLessThanOrEqualTo(String value) {
            addCriterion("land <=", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandLike(String value) {
            addCriterion("land like", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandNotLike(String value) {
            addCriterion("land not like", value, "land");
            return (Criteria) this;
        }

        public Criteria andLandIn(List<String> values) {
            addCriterion("land in", values, "land");
            return (Criteria) this;
        }

        public Criteria andLandNotIn(List<String> values) {
            addCriterion("land not in", values, "land");
            return (Criteria) this;
        }

        public Criteria andLandBetween(String value1, String value2) {
            addCriterion("land between", value1, value2, "land");
            return (Criteria) this;
        }

        public Criteria andLandNotBetween(String value1, String value2) {
            addCriterion("land not between", value1, value2, "land");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishIsNull() {
            addCriterion("country_english is null");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishIsNotNull() {
            addCriterion("country_english is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishEqualTo(String value) {
            addCriterion("country_english =", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishNotEqualTo(String value) {
            addCriterion("country_english <>", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishGreaterThan(String value) {
            addCriterion("country_english >", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("country_english >=", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishLessThan(String value) {
            addCriterion("country_english <", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishLessThanOrEqualTo(String value) {
            addCriterion("country_english <=", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishLike(String value) {
            addCriterion("country_english like", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishNotLike(String value) {
            addCriterion("country_english not like", value, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishIn(List<String> values) {
            addCriterion("country_english in", values, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishNotIn(List<String> values) {
            addCriterion("country_english not in", values, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishBetween(String value1, String value2) {
            addCriterion("country_english between", value1, value2, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishNotBetween(String value1, String value2) {
            addCriterion("country_english not between", value1, value2, "countryEnglish");
            return (Criteria) this;
        }

        public Criteria andIspIsNull() {
            addCriterion("isp is null");
            return (Criteria) this;
        }

        public Criteria andIspIsNotNull() {
            addCriterion("isp is not null");
            return (Criteria) this;
        }

        public Criteria andIspEqualTo(String value) {
            addCriterion("isp =", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspNotEqualTo(String value) {
            addCriterion("isp <>", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspGreaterThan(String value) {
            addCriterion("isp >", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspGreaterThanOrEqualTo(String value) {
            addCriterion("isp >=", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspLessThan(String value) {
            addCriterion("isp <", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspLessThanOrEqualTo(String value) {
            addCriterion("isp <=", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspLike(String value) {
            addCriterion("isp like", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspNotLike(String value) {
            addCriterion("isp not like", value, "isp");
            return (Criteria) this;
        }

        public Criteria andIspIn(List<String> values) {
            addCriterion("isp in", values, "isp");
            return (Criteria) this;
        }

        public Criteria andIspNotIn(List<String> values) {
            addCriterion("isp not in", values, "isp");
            return (Criteria) this;
        }

        public Criteria andIspBetween(String value1, String value2) {
            addCriterion("isp between", value1, value2, "isp");
            return (Criteria) this;
        }

        public Criteria andIspNotBetween(String value1, String value2) {
            addCriterion("isp not between", value1, value2, "isp");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(String value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(String value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(String value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(String value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(String value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLike(String value) {
            addCriterion("country_id like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotLike(String value) {
            addCriterion("country_id not like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<String> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<String> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(String value1, String value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(String value1, String value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeIsNull() {
            addCriterion("international_code is null");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeIsNotNull() {
            addCriterion("international_code is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeEqualTo(String value) {
            addCriterion("international_code =", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeNotEqualTo(String value) {
            addCriterion("international_code <>", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeGreaterThan(String value) {
            addCriterion("international_code >", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("international_code >=", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeLessThan(String value) {
            addCriterion("international_code <", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeLessThanOrEqualTo(String value) {
            addCriterion("international_code <=", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeLike(String value) {
            addCriterion("international_code like", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeNotLike(String value) {
            addCriterion("international_code not like", value, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeIn(List<String> values) {
            addCriterion("international_code in", values, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeNotIn(List<String> values) {
            addCriterion("international_code not in", values, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeBetween(String value1, String value2) {
            addCriterion("international_code between", value1, value2, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andInternationalCodeNotBetween(String value1, String value2) {
            addCriterion("international_code not between", value1, value2, "internationalCode");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(String value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(String value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(String value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(String value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(String value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(String value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLike(String value) {
            addCriterion("region_id like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotLike(String value) {
            addCriterion("region_id not like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<String> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<String> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(String value1, String value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(String value1, String value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
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