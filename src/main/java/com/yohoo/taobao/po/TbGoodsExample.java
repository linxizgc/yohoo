package com.yohoo.taobao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsExample() {
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

        public Criteria andGooIdIsNull() {
            addCriterion("goo_id is null");
            return (Criteria) this;
        }

        public Criteria andGooIdIsNotNull() {
            addCriterion("goo_id is not null");
            return (Criteria) this;
        }

        public Criteria andGooIdEqualTo(String value) {
            addCriterion("goo_id =", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdNotEqualTo(String value) {
            addCriterion("goo_id <>", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdGreaterThan(String value) {
            addCriterion("goo_id >", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdGreaterThanOrEqualTo(String value) {
            addCriterion("goo_id >=", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdLessThan(String value) {
            addCriterion("goo_id <", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdLessThanOrEqualTo(String value) {
            addCriterion("goo_id <=", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdLike(String value) {
            addCriterion("goo_id like", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdNotLike(String value) {
            addCriterion("goo_id not like", value, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdIn(List<String> values) {
            addCriterion("goo_id in", values, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdNotIn(List<String> values) {
            addCriterion("goo_id not in", values, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdBetween(String value1, String value2) {
            addCriterion("goo_id between", value1, value2, "gooId");
            return (Criteria) this;
        }

        public Criteria andGooIdNotBetween(String value1, String value2) {
            addCriterion("goo_id not between", value1, value2, "gooId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andGooNameIsNull() {
            addCriterion("goo_name is null");
            return (Criteria) this;
        }

        public Criteria andGooNameIsNotNull() {
            addCriterion("goo_name is not null");
            return (Criteria) this;
        }

        public Criteria andGooNameEqualTo(String value) {
            addCriterion("goo_name =", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameNotEqualTo(String value) {
            addCriterion("goo_name <>", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameGreaterThan(String value) {
            addCriterion("goo_name >", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameGreaterThanOrEqualTo(String value) {
            addCriterion("goo_name >=", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameLessThan(String value) {
            addCriterion("goo_name <", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameLessThanOrEqualTo(String value) {
            addCriterion("goo_name <=", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameLike(String value) {
            addCriterion("goo_name like", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameNotLike(String value) {
            addCriterion("goo_name not like", value, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameIn(List<String> values) {
            addCriterion("goo_name in", values, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameNotIn(List<String> values) {
            addCriterion("goo_name not in", values, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameBetween(String value1, String value2) {
            addCriterion("goo_name between", value1, value2, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooNameNotBetween(String value1, String value2) {
            addCriterion("goo_name not between", value1, value2, "gooName");
            return (Criteria) this;
        }

        public Criteria andGooImgIsNull() {
            addCriterion("goo_img is null");
            return (Criteria) this;
        }

        public Criteria andGooImgIsNotNull() {
            addCriterion("goo_img is not null");
            return (Criteria) this;
        }

        public Criteria andGooImgEqualTo(String value) {
            addCriterion("goo_img =", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgNotEqualTo(String value) {
            addCriterion("goo_img <>", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgGreaterThan(String value) {
            addCriterion("goo_img >", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgGreaterThanOrEqualTo(String value) {
            addCriterion("goo_img >=", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgLessThan(String value) {
            addCriterion("goo_img <", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgLessThanOrEqualTo(String value) {
            addCriterion("goo_img <=", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgLike(String value) {
            addCriterion("goo_img like", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgNotLike(String value) {
            addCriterion("goo_img not like", value, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgIn(List<String> values) {
            addCriterion("goo_img in", values, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgNotIn(List<String> values) {
            addCriterion("goo_img not in", values, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgBetween(String value1, String value2) {
            addCriterion("goo_img between", value1, value2, "gooImg");
            return (Criteria) this;
        }

        public Criteria andGooImgNotBetween(String value1, String value2) {
            addCriterion("goo_img not between", value1, value2, "gooImg");
            return (Criteria) this;
        }

        public Criteria andMonthSaleIsNull() {
            addCriterion("month_sale is null");
            return (Criteria) this;
        }

        public Criteria andMonthSaleIsNotNull() {
            addCriterion("month_sale is not null");
            return (Criteria) this;
        }

        public Criteria andMonthSaleEqualTo(Integer value) {
            addCriterion("month_sale =", value, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleNotEqualTo(Integer value) {
            addCriterion("month_sale <>", value, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleGreaterThan(Integer value) {
            addCriterion("month_sale >", value, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_sale >=", value, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleLessThan(Integer value) {
            addCriterion("month_sale <", value, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleLessThanOrEqualTo(Integer value) {
            addCriterion("month_sale <=", value, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleIn(List<Integer> values) {
            addCriterion("month_sale in", values, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleNotIn(List<Integer> values) {
            addCriterion("month_sale not in", values, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleBetween(Integer value1, Integer value2) {
            addCriterion("month_sale between", value1, value2, "monthSale");
            return (Criteria) this;
        }

        public Criteria andMonthSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("month_sale not between", value1, value2, "monthSale");
            return (Criteria) this;
        }

        public Criteria andGooPriceIsNull() {
            addCriterion("goo_price is null");
            return (Criteria) this;
        }

        public Criteria andGooPriceIsNotNull() {
            addCriterion("goo_price is not null");
            return (Criteria) this;
        }

        public Criteria andGooPriceEqualTo(Float value) {
            addCriterion("goo_price =", value, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceNotEqualTo(Float value) {
            addCriterion("goo_price <>", value, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceGreaterThan(Float value) {
            addCriterion("goo_price >", value, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goo_price >=", value, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceLessThan(Float value) {
            addCriterion("goo_price <", value, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceLessThanOrEqualTo(Float value) {
            addCriterion("goo_price <=", value, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceIn(List<Float> values) {
            addCriterion("goo_price in", values, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceNotIn(List<Float> values) {
            addCriterion("goo_price not in", values, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceBetween(Float value1, Float value2) {
            addCriterion("goo_price between", value1, value2, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andGooPriceNotBetween(Float value1, Float value2) {
            addCriterion("goo_price not between", value1, value2, "gooPrice");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioIsNull() {
            addCriterion("income_ratio is null");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioIsNotNull() {
            addCriterion("income_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioEqualTo(Float value) {
            addCriterion("income_ratio =", value, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioNotEqualTo(Float value) {
            addCriterion("income_ratio <>", value, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioGreaterThan(Float value) {
            addCriterion("income_ratio >", value, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("income_ratio >=", value, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioLessThan(Float value) {
            addCriterion("income_ratio <", value, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioLessThanOrEqualTo(Float value) {
            addCriterion("income_ratio <=", value, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioIn(List<Float> values) {
            addCriterion("income_ratio in", values, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioNotIn(List<Float> values) {
            addCriterion("income_ratio not in", values, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioBetween(Float value1, Float value2) {
            addCriterion("income_ratio between", value1, value2, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andIncomeRatioNotBetween(Float value1, Float value2) {
            addCriterion("income_ratio not between", value1, value2, "incomeRatio");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Float value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Float value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Float value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Float value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Float value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Float value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Float> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Float> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Float value1, Float value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Float value1, Float value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andTkUrlIsNull() {
            addCriterion("tk_url is null");
            return (Criteria) this;
        }

        public Criteria andTkUrlIsNotNull() {
            addCriterion("tk_url is not null");
            return (Criteria) this;
        }

        public Criteria andTkUrlEqualTo(String value) {
            addCriterion("tk_url =", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlNotEqualTo(String value) {
            addCriterion("tk_url <>", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlGreaterThan(String value) {
            addCriterion("tk_url >", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("tk_url >=", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlLessThan(String value) {
            addCriterion("tk_url <", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlLessThanOrEqualTo(String value) {
            addCriterion("tk_url <=", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlLike(String value) {
            addCriterion("tk_url like", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlNotLike(String value) {
            addCriterion("tk_url not like", value, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlIn(List<String> values) {
            addCriterion("tk_url in", values, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlNotIn(List<String> values) {
            addCriterion("tk_url not in", values, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlBetween(String value1, String value2) {
            addCriterion("tk_url between", value1, value2, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkUrlNotBetween(String value1, String value2) {
            addCriterion("tk_url not between", value1, value2, "tkUrl");
            return (Criteria) this;
        }

        public Criteria andTkPasswordIsNull() {
            addCriterion("tk_password is null");
            return (Criteria) this;
        }

        public Criteria andTkPasswordIsNotNull() {
            addCriterion("tk_password is not null");
            return (Criteria) this;
        }

        public Criteria andTkPasswordEqualTo(String value) {
            addCriterion("tk_password =", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordNotEqualTo(String value) {
            addCriterion("tk_password <>", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordGreaterThan(String value) {
            addCriterion("tk_password >", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tk_password >=", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordLessThan(String value) {
            addCriterion("tk_password <", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordLessThanOrEqualTo(String value) {
            addCriterion("tk_password <=", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordLike(String value) {
            addCriterion("tk_password like", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordNotLike(String value) {
            addCriterion("tk_password not like", value, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordIn(List<String> values) {
            addCriterion("tk_password in", values, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordNotIn(List<String> values) {
            addCriterion("tk_password not in", values, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordBetween(String value1, String value2) {
            addCriterion("tk_password between", value1, value2, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andTkPasswordNotBetween(String value1, String value2) {
            addCriterion("tk_password not between", value1, value2, "tkPassword");
            return (Criteria) this;
        }

        public Criteria andCouponTotalIsNull() {
            addCriterion("coupon_total is null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalIsNotNull() {
            addCriterion("coupon_total is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalEqualTo(String value) {
            addCriterion("coupon_total =", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalNotEqualTo(String value) {
            addCriterion("coupon_total <>", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalGreaterThan(String value) {
            addCriterion("coupon_total >", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_total >=", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalLessThan(String value) {
            addCriterion("coupon_total <", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalLessThanOrEqualTo(String value) {
            addCriterion("coupon_total <=", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalLike(String value) {
            addCriterion("coupon_total like", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalNotLike(String value) {
            addCriterion("coupon_total not like", value, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalIn(List<String> values) {
            addCriterion("coupon_total in", values, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalNotIn(List<String> values) {
            addCriterion("coupon_total not in", values, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalBetween(String value1, String value2) {
            addCriterion("coupon_total between", value1, value2, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponTotalNotBetween(String value1, String value2) {
            addCriterion("coupon_total not between", value1, value2, "couponTotal");
            return (Criteria) this;
        }

        public Criteria andCouponSurpIsNull() {
            addCriterion("coupon_surp is null");
            return (Criteria) this;
        }

        public Criteria andCouponSurpIsNotNull() {
            addCriterion("coupon_surp is not null");
            return (Criteria) this;
        }

        public Criteria andCouponSurpEqualTo(String value) {
            addCriterion("coupon_surp =", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpNotEqualTo(String value) {
            addCriterion("coupon_surp <>", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpGreaterThan(String value) {
            addCriterion("coupon_surp >", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_surp >=", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpLessThan(String value) {
            addCriterion("coupon_surp <", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpLessThanOrEqualTo(String value) {
            addCriterion("coupon_surp <=", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpLike(String value) {
            addCriterion("coupon_surp like", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpNotLike(String value) {
            addCriterion("coupon_surp not like", value, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpIn(List<String> values) {
            addCriterion("coupon_surp in", values, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpNotIn(List<String> values) {
            addCriterion("coupon_surp not in", values, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpBetween(String value1, String value2) {
            addCriterion("coupon_surp between", value1, value2, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponSurpNotBetween(String value1, String value2) {
            addCriterion("coupon_surp not between", value1, value2, "couponSurp");
            return (Criteria) this;
        }

        public Criteria andCouponValIsNull() {
            addCriterion("coupon_val is null");
            return (Criteria) this;
        }

        public Criteria andCouponValIsNotNull() {
            addCriterion("coupon_val is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValEqualTo(Integer value) {
            addCriterion("coupon_val =", value, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValNotEqualTo(Integer value) {
            addCriterion("coupon_val <>", value, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValGreaterThan(Integer value) {
            addCriterion("coupon_val >", value, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_val >=", value, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValLessThan(Integer value) {
            addCriterion("coupon_val <", value, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_val <=", value, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValIn(List<Integer> values) {
            addCriterion("coupon_val in", values, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValNotIn(List<Integer> values) {
            addCriterion("coupon_val not in", values, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValBetween(Integer value1, Integer value2) {
            addCriterion("coupon_val between", value1, value2, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponValNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_val not between", value1, value2, "couponVal");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNull() {
            addCriterion("coupon_url is null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNotNull() {
            addCriterion("coupon_url is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlEqualTo(String value) {
            addCriterion("coupon_url =", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotEqualTo(String value) {
            addCriterion("coupon_url <>", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThan(String value) {
            addCriterion("coupon_url >", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_url >=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThan(String value) {
            addCriterion("coupon_url <", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThanOrEqualTo(String value) {
            addCriterion("coupon_url <=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLike(String value) {
            addCriterion("coupon_url like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotLike(String value) {
            addCriterion("coupon_url not like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIn(List<String> values) {
            addCriterion("coupon_url in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotIn(List<String> values) {
            addCriterion("coupon_url not in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlBetween(String value1, String value2) {
            addCriterion("coupon_url between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotBetween(String value1, String value2) {
            addCriterion("coupon_url not between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordIsNull() {
            addCriterion("coupon_password is null");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordIsNotNull() {
            addCriterion("coupon_password is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordEqualTo(String value) {
            addCriterion("coupon_password =", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordNotEqualTo(String value) {
            addCriterion("coupon_password <>", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordGreaterThan(String value) {
            addCriterion("coupon_password >", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_password >=", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordLessThan(String value) {
            addCriterion("coupon_password <", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordLessThanOrEqualTo(String value) {
            addCriterion("coupon_password <=", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordLike(String value) {
            addCriterion("coupon_password like", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordNotLike(String value) {
            addCriterion("coupon_password not like", value, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordIn(List<String> values) {
            addCriterion("coupon_password in", values, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordNotIn(List<String> values) {
            addCriterion("coupon_password not in", values, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordBetween(String value1, String value2) {
            addCriterion("coupon_password between", value1, value2, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponPasswordNotBetween(String value1, String value2) {
            addCriterion("coupon_password not between", value1, value2, "couponPassword");
            return (Criteria) this;
        }

        public Criteria andCouponBeginIsNull() {
            addCriterion("coupon_begin is null");
            return (Criteria) this;
        }

        public Criteria andCouponBeginIsNotNull() {
            addCriterion("coupon_begin is not null");
            return (Criteria) this;
        }

        public Criteria andCouponBeginEqualTo(Date value) {
            addCriterion("coupon_begin =", value, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginNotEqualTo(Date value) {
            addCriterion("coupon_begin <>", value, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginGreaterThan(Date value) {
            addCriterion("coupon_begin >", value, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_begin >=", value, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginLessThan(Date value) {
            addCriterion("coupon_begin <", value, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginLessThanOrEqualTo(Date value) {
            addCriterion("coupon_begin <=", value, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginIn(List<Date> values) {
            addCriterion("coupon_begin in", values, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginNotIn(List<Date> values) {
            addCriterion("coupon_begin not in", values, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginBetween(Date value1, Date value2) {
            addCriterion("coupon_begin between", value1, value2, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponBeginNotBetween(Date value1, Date value2) {
            addCriterion("coupon_begin not between", value1, value2, "couponBegin");
            return (Criteria) this;
        }

        public Criteria andCouponEndIsNull() {
            addCriterion("coupon_end is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndIsNotNull() {
            addCriterion("coupon_end is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndEqualTo(Date value) {
            addCriterion("coupon_end =", value, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndNotEqualTo(Date value) {
            addCriterion("coupon_end <>", value, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndGreaterThan(Date value) {
            addCriterion("coupon_end >", value, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_end >=", value, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndLessThan(Date value) {
            addCriterion("coupon_end <", value, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndLessThanOrEqualTo(Date value) {
            addCriterion("coupon_end <=", value, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndIn(List<Date> values) {
            addCriterion("coupon_end in", values, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndNotIn(List<Date> values) {
            addCriterion("coupon_end not in", values, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndBetween(Date value1, Date value2) {
            addCriterion("coupon_end between", value1, value2, "couponEnd");
            return (Criteria) this;
        }

        public Criteria andCouponEndNotBetween(Date value1, Date value2) {
            addCriterion("coupon_end not between", value1, value2, "couponEnd");
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