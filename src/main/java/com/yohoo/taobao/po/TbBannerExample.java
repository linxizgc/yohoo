package com.yohoo.taobao.po;

import java.util.ArrayList;
import java.util.List;

public class TbBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBannerExample() {
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

        public Criteria andBanIdIsNull() {
            addCriterion("ban_id is null");
            return (Criteria) this;
        }

        public Criteria andBanIdIsNotNull() {
            addCriterion("ban_id is not null");
            return (Criteria) this;
        }

        public Criteria andBanIdEqualTo(String value) {
            addCriterion("ban_id =", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdNotEqualTo(String value) {
            addCriterion("ban_id <>", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdGreaterThan(String value) {
            addCriterion("ban_id >", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdGreaterThanOrEqualTo(String value) {
            addCriterion("ban_id >=", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdLessThan(String value) {
            addCriterion("ban_id <", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdLessThanOrEqualTo(String value) {
            addCriterion("ban_id <=", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdLike(String value) {
            addCriterion("ban_id like", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdNotLike(String value) {
            addCriterion("ban_id not like", value, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdIn(List<String> values) {
            addCriterion("ban_id in", values, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdNotIn(List<String> values) {
            addCriterion("ban_id not in", values, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdBetween(String value1, String value2) {
            addCriterion("ban_id between", value1, value2, "banId");
            return (Criteria) this;
        }

        public Criteria andBanIdNotBetween(String value1, String value2) {
            addCriterion("ban_id not between", value1, value2, "banId");
            return (Criteria) this;
        }

        public Criteria andBanTitleIsNull() {
            addCriterion("ban_title is null");
            return (Criteria) this;
        }

        public Criteria andBanTitleIsNotNull() {
            addCriterion("ban_title is not null");
            return (Criteria) this;
        }

        public Criteria andBanTitleEqualTo(String value) {
            addCriterion("ban_title =", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleNotEqualTo(String value) {
            addCriterion("ban_title <>", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleGreaterThan(String value) {
            addCriterion("ban_title >", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ban_title >=", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleLessThan(String value) {
            addCriterion("ban_title <", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleLessThanOrEqualTo(String value) {
            addCriterion("ban_title <=", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleLike(String value) {
            addCriterion("ban_title like", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleNotLike(String value) {
            addCriterion("ban_title not like", value, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleIn(List<String> values) {
            addCriterion("ban_title in", values, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleNotIn(List<String> values) {
            addCriterion("ban_title not in", values, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleBetween(String value1, String value2) {
            addCriterion("ban_title between", value1, value2, "banTitle");
            return (Criteria) this;
        }

        public Criteria andBanTitleNotBetween(String value1, String value2) {
            addCriterion("ban_title not between", value1, value2, "banTitle");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkImgIsNull() {
            addCriterion("link_img is null");
            return (Criteria) this;
        }

        public Criteria andLinkImgIsNotNull() {
            addCriterion("link_img is not null");
            return (Criteria) this;
        }

        public Criteria andLinkImgEqualTo(String value) {
            addCriterion("link_img =", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotEqualTo(String value) {
            addCriterion("link_img <>", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgGreaterThan(String value) {
            addCriterion("link_img >", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgGreaterThanOrEqualTo(String value) {
            addCriterion("link_img >=", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgLessThan(String value) {
            addCriterion("link_img <", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgLessThanOrEqualTo(String value) {
            addCriterion("link_img <=", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgLike(String value) {
            addCriterion("link_img like", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotLike(String value) {
            addCriterion("link_img not like", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgIn(List<String> values) {
            addCriterion("link_img in", values, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotIn(List<String> values) {
            addCriterion("link_img not in", values, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgBetween(String value1, String value2) {
            addCriterion("link_img between", value1, value2, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotBetween(String value1, String value2) {
            addCriterion("link_img not between", value1, value2, "linkImg");
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