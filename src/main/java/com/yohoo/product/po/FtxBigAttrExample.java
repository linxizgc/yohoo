package com.yohoo.product.po;

import java.util.ArrayList;
import java.util.List;

public class FtxBigAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FtxBigAttrExample() {
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

        public Criteria andBigAttrIdIsNull() {
            addCriterion("big_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdIsNotNull() {
            addCriterion("big_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdEqualTo(String value) {
            addCriterion("big_attr_id =", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdNotEqualTo(String value) {
            addCriterion("big_attr_id <>", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdGreaterThan(String value) {
            addCriterion("big_attr_id >", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("big_attr_id >=", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdLessThan(String value) {
            addCriterion("big_attr_id <", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdLessThanOrEqualTo(String value) {
            addCriterion("big_attr_id <=", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdLike(String value) {
            addCriterion("big_attr_id like", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdNotLike(String value) {
            addCriterion("big_attr_id not like", value, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdIn(List<String> values) {
            addCriterion("big_attr_id in", values, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdNotIn(List<String> values) {
            addCriterion("big_attr_id not in", values, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdBetween(String value1, String value2) {
            addCriterion("big_attr_id between", value1, value2, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrIdNotBetween(String value1, String value2) {
            addCriterion("big_attr_id not between", value1, value2, "bigAttrId");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameIsNull() {
            addCriterion("big_attr_name is null");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameIsNotNull() {
            addCriterion("big_attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameEqualTo(String value) {
            addCriterion("big_attr_name =", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameNotEqualTo(String value) {
            addCriterion("big_attr_name <>", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameGreaterThan(String value) {
            addCriterion("big_attr_name >", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("big_attr_name >=", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameLessThan(String value) {
            addCriterion("big_attr_name <", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameLessThanOrEqualTo(String value) {
            addCriterion("big_attr_name <=", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameLike(String value) {
            addCriterion("big_attr_name like", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameNotLike(String value) {
            addCriterion("big_attr_name not like", value, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameIn(List<String> values) {
            addCriterion("big_attr_name in", values, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameNotIn(List<String> values) {
            addCriterion("big_attr_name not in", values, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameBetween(String value1, String value2) {
            addCriterion("big_attr_name between", value1, value2, "bigAttrName");
            return (Criteria) this;
        }

        public Criteria andBigAttrNameNotBetween(String value1, String value2) {
            addCriterion("big_attr_name not between", value1, value2, "bigAttrName");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
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