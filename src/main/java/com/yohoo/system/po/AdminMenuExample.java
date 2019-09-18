package com.yohoo.system.po;

import java.util.ArrayList;
import java.util.List;

public class AdminMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminMenuExample() {
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

        public Criteria andParentMenuIdIsNull() {
            addCriterion("parent_menu_Id is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNotNull() {
            addCriterion("parent_menu_Id is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdEqualTo(String value) {
            addCriterion("parent_menu_Id =", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotEqualTo(String value) {
            addCriterion("parent_menu_Id <>", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThan(String value) {
            addCriterion("parent_menu_Id >", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_menu_Id >=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThan(String value) {
            addCriterion("parent_menu_Id <", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThanOrEqualTo(String value) {
            addCriterion("parent_menu_Id <=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLike(String value) {
            addCriterion("parent_menu_Id like", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotLike(String value) {
            addCriterion("parent_menu_Id not like", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIn(List<String> values) {
            addCriterion("parent_menu_Id in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotIn(List<String> values) {
            addCriterion("parent_menu_Id not in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdBetween(String value1, String value2) {
            addCriterion("parent_menu_Id between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotBetween(String value1, String value2) {
            addCriterion("parent_menu_Id not between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNull() {
            addCriterion("menu_code is null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNotNull() {
            addCriterion("menu_code is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeEqualTo(String value) {
            addCriterion("menu_code =", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotEqualTo(String value) {
            addCriterion("menu_code <>", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThan(String value) {
            addCriterion("menu_code >", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_code >=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThan(String value) {
            addCriterion("menu_code <", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThanOrEqualTo(String value) {
            addCriterion("menu_code <=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLike(String value) {
            addCriterion("menu_code like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotLike(String value) {
            addCriterion("menu_code not like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIn(List<String> values) {
            addCriterion("menu_code in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotIn(List<String> values) {
            addCriterion("menu_code not in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeBetween(String value1, String value2) {
            addCriterion("menu_code between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotBetween(String value1, String value2) {
            addCriterion("menu_code not between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
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

        public Criteria andMenuLevelIsNull() {
            addCriterion("menu_level is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("menu_level is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(Integer value) {
            addCriterion("menu_level =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(Integer value) {
            addCriterion("menu_level <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(Integer value) {
            addCriterion("menu_level >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_level >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(Integer value) {
            addCriterion("menu_level <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(Integer value) {
            addCriterion("menu_level <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<Integer> values) {
            addCriterion("menu_level in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<Integer> values) {
            addCriterion("menu_level not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(Integer value1, Integer value2) {
            addCriterion("menu_level between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_level not between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
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