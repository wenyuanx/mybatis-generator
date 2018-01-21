package com.huawei.idp.gtms.entity;

import java.util.ArrayList;
import java.util.List;

public class FsBoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FsBoxExample() {
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

        public Criteria andBoxidIsNull() {
            addCriterion("BoxID is null");
            return (Criteria) this;
        }

        public Criteria andBoxidIsNotNull() {
            addCriterion("BoxID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxidEqualTo(Integer value) {
            addCriterion("BoxID =", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotEqualTo(Integer value) {
            addCriterion("BoxID <>", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidGreaterThan(Integer value) {
            addCriterion("BoxID >", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BoxID >=", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidLessThan(Integer value) {
            addCriterion("BoxID <", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidLessThanOrEqualTo(Integer value) {
            addCriterion("BoxID <=", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidIn(List<Integer> values) {
            addCriterion("BoxID in", values, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotIn(List<Integer> values) {
            addCriterion("BoxID not in", values, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidBetween(Integer value1, Integer value2) {
            addCriterion("BoxID between", value1, value2, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotBetween(Integer value1, Integer value2) {
            addCriterion("BoxID not between", value1, value2, "boxid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("OrgID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("OrgID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("OrgID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("OrgID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("OrgID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrgID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("OrgID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("OrgID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("OrgID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("OrgID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("OrgID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrgID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangIsNull() {
            addCriterion("IsQingTuiXiang is null");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangIsNotNull() {
            addCriterion("IsQingTuiXiang is not null");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangEqualTo(Integer value) {
            addCriterion("IsQingTuiXiang =", value, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangNotEqualTo(Integer value) {
            addCriterion("IsQingTuiXiang <>", value, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangGreaterThan(Integer value) {
            addCriterion("IsQingTuiXiang >", value, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsQingTuiXiang >=", value, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangLessThan(Integer value) {
            addCriterion("IsQingTuiXiang <", value, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangLessThanOrEqualTo(Integer value) {
            addCriterion("IsQingTuiXiang <=", value, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangIn(List<Integer> values) {
            addCriterion("IsQingTuiXiang in", values, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangNotIn(List<Integer> values) {
            addCriterion("IsQingTuiXiang not in", values, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangBetween(Integer value1, Integer value2) {
            addCriterion("IsQingTuiXiang between", value1, value2, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andIsqingtuixiangNotBetween(Integer value1, Integer value2) {
            addCriterion("IsQingTuiXiang not between", value1, value2, "isqingtuixiang");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidIsNull() {
            addCriterion("BoxGroupID is null");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidIsNotNull() {
            addCriterion("BoxGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidEqualTo(Integer value) {
            addCriterion("BoxGroupID =", value, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidNotEqualTo(Integer value) {
            addCriterion("BoxGroupID <>", value, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidGreaterThan(Integer value) {
            addCriterion("BoxGroupID >", value, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BoxGroupID >=", value, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidLessThan(Integer value) {
            addCriterion("BoxGroupID <", value, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("BoxGroupID <=", value, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidIn(List<Integer> values) {
            addCriterion("BoxGroupID in", values, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidNotIn(List<Integer> values) {
            addCriterion("BoxGroupID not in", values, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidBetween(Integer value1, Integer value2) {
            addCriterion("BoxGroupID between", value1, value2, "boxgroupid");
            return (Criteria) this;
        }

        public Criteria andBoxgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("BoxGroupID not between", value1, value2, "boxgroupid");
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