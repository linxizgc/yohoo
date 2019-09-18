package com.yohoo.taobao.po;

import java.util.ArrayList;
import java.util.List;

public class TbTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTypeExample() {
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

        public Criteria andTypIdIsNull() {
            addCriterion("typ_id is null");
            return (Criteria) this;
        }

        public Criteria andTypIdIsNotNull() {
            addCriterion("typ_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypIdEqualTo(String value) {
            addCriterion("typ_id =", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotEqualTo(String value) {
            addCriterion("typ_id <>", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdGreaterThan(String value) {
            addCriterion("typ_id >", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdGreaterThanOrEqualTo(String value) {
            addCriterion("typ_id >=", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdLessThan(String value) {
            addCriterion("typ_id <", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdLessThanOrEqualTo(String value) {
            addCriterion("typ_id <=", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdLike(String value) {
            addCriterion("typ_id like", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotLike(String value) {
            addCriterion("typ_id not like", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdIn(List<String> values) {
            addCriterion("typ_id in", values, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotIn(List<String> values) {
            addCriterion("typ_id not in", values, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdBetween(String value1, String value2) {
            addCriterion("typ_id between", value1, value2, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotBetween(String value1, String value2) {
            addCriterion("typ_id not between", value1, value2, "typId");
            return (Criteria) this;
        }

        public Criteria andTypTitleIsNull() {
            addCriterion("typ_title is null");
            return (Criteria) this;
        }

        public Criteria andTypTitleIsNotNull() {
            addCriterion("typ_title is not null");
            return (Criteria) this;
        }

        public Criteria andTypTitleEqualTo(String value) {
            addCriterion("typ_title =", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleNotEqualTo(String value) {
            addCriterion("typ_title <>", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleGreaterThan(String value) {
            addCriterion("typ_title >", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleGreaterThanOrEqualTo(String value) {
            addCriterion("typ_title >=", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleLessThan(String value) {
            addCriterion("typ_title <", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleLessThanOrEqualTo(String value) {
            addCriterion("typ_title <=", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleLike(String value) {
            addCriterion("typ_title like", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleNotLike(String value) {
            addCriterion("typ_title not like", value, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleIn(List<String> values) {
            addCriterion("typ_title in", values, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleNotIn(List<String> values) {
            addCriterion("typ_title not in", values, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleBetween(String value1, String value2) {
            addCriterion("typ_title between", value1, value2, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypTitleNotBetween(String value1, String value2) {
            addCriterion("typ_title not between", value1, value2, "typTitle");
            return (Criteria) this;
        }

        public Criteria andTypDescribeIsNull() {
            addCriterion("typ_describe is null");
            return (Criteria) this;
        }

        public Criteria andTypDescribeIsNotNull() {
            addCriterion("typ_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTypDescribeEqualTo(String value) {
            addCriterion("typ_describe =", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeNotEqualTo(String value) {
            addCriterion("typ_describe <>", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeGreaterThan(String value) {
            addCriterion("typ_describe >", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("typ_describe >=", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeLessThan(String value) {
            addCriterion("typ_describe <", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeLessThanOrEqualTo(String value) {
            addCriterion("typ_describe <=", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeLike(String value) {
            addCriterion("typ_describe like", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeNotLike(String value) {
            addCriterion("typ_describe not like", value, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeIn(List<String> values) {
            addCriterion("typ_describe in", values, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeNotIn(List<String> values) {
            addCriterion("typ_describe not in", values, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeBetween(String value1, String value2) {
            addCriterion("typ_describe between", value1, value2, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andTypDescribeNotBetween(String value1, String value2) {
            addCriterion("typ_describe not between", value1, value2, "typDescribe");
            return (Criteria) this;
        }

        public Criteria andSortsIsNull() {
            addCriterion("sorts is null");
            return (Criteria) this;
        }

        public Criteria andSortsIsNotNull() {
            addCriterion("sorts is not null");
            return (Criteria) this;
        }

        public Criteria andSortsEqualTo(Integer value) {
            addCriterion("sorts =", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotEqualTo(Integer value) {
            addCriterion("sorts <>", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThan(Integer value) {
            addCriterion("sorts >", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorts >=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThan(Integer value) {
            addCriterion("sorts <", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThanOrEqualTo(Integer value) {
            addCriterion("sorts <=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsIn(List<Integer> values) {
            addCriterion("sorts in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotIn(List<Integer> values) {
            addCriterion("sorts not in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsBetween(Integer value1, Integer value2) {
            addCriterion("sorts between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotBetween(Integer value1, Integer value2) {
            addCriterion("sorts not between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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