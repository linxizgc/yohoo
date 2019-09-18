package com.yohoo.taobao.po;

import com.yohoo.core.bo.BasePo;

import java.util.Date;

public class TbGoods extends BasePo {
    private String gooId;

    private String gooType;

    private String shopName;

    private String gooName;

    private String gooImg;

    private Integer monthSale;

    private Float gooPrice;

    private Float gooNowPrice;

    private Float incomeRatio;

    private Float commission;

    private String tkUrl;

    private String tkPassword;

    private String couponTotal;

    private String couponSurp;

    private Integer couponVal;

    private String couponUrl;

    private String couponPassword;

    private Date couponBegin;

    private Date couponEnd;

    private Integer sorts;

    private String status;

    public String getGooId() {
        return gooId;
    }

    public void setGooId(String gooId) {
        this.gooId = gooId == null ? null : gooId.trim();
    }

    public String getGooType() {
        return gooType;
    }

    public void setGooType(String gooType) {
        this.gooType = gooType;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getGooName() {
        return gooName;
    }

    public void setGooName(String gooName) {
        this.gooName = gooName == null ? null : gooName.trim();
    }

    public String getGooImg() {
        return gooImg;
    }

    public void setGooImg(String gooImg) {
        this.gooImg = gooImg == null ? null : gooImg.trim();
    }

    public Integer getMonthSale() {
        return monthSale;
    }

    public void setMonthSale(Integer monthSale) {
        this.monthSale = monthSale;
    }

    public Float getGooPrice() {
        return gooPrice;
    }

    public void setGooPrice(Float gooPrice) {
        this.gooPrice = gooPrice;
    }

    public Float getGooNowPrice() {
        return gooNowPrice;
    }

    public void setGooNowPrice(Float gooNowPrice) {
        this.gooNowPrice = gooNowPrice;
    }

    public Float getIncomeRatio() {
        return incomeRatio;
    }

    public void setIncomeRatio(Float incomeRatio) {
        this.incomeRatio = incomeRatio;
    }

    public Float getCommission() {
        return commission;
    }

    public void setCommission(Float commission) {
        this.commission = commission;
    }

    public String getTkUrl() {
        return tkUrl;
    }

    public void setTkUrl(String tkUrl) {
        this.tkUrl = tkUrl == null ? null : tkUrl.trim();
    }

    public String getTkPassword() {
        return tkPassword;
    }

    public void setTkPassword(String tkPassword) {
        this.tkPassword = tkPassword == null ? null : tkPassword.trim();
    }

    public String getCouponTotal() {
        return couponTotal;
    }

    public void setCouponTotal(String couponTotal) {
        this.couponTotal = couponTotal == null ? null : couponTotal.trim();
    }

    public String getCouponSurp() {
        return couponSurp;
    }

    public void setCouponSurp(String couponSurp) {
        this.couponSurp = couponSurp == null ? null : couponSurp.trim();
    }

    public Integer getCouponVal() {
        return couponVal;
    }

    public void setCouponVal(Integer couponVal) {
        this.couponVal = couponVal;
    }

    public String getCouponUrl() {
        return couponUrl;
    }

    public void setCouponUrl(String couponUrl) {
        this.couponUrl = couponUrl == null ? null : couponUrl.trim();
    }

    public String getCouponPassword() {
        return couponPassword;
    }

    public void setCouponPassword(String couponPassword) {
        this.couponPassword = couponPassword == null ? null : couponPassword.trim();
    }

    public Date getCouponBegin() {
        return couponBegin;
    }

    public void setCouponBegin(Date couponBegin) {
        this.couponBegin = couponBegin;
    }

    public Date getCouponEnd() {
        return couponEnd;
    }

    public void setCouponEnd(Date couponEnd) {
        this.couponEnd = couponEnd;
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}