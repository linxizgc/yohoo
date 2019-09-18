package com.yohoo.product.po;

import com.yohoo.core.bo.BasePo;

public class FtxSmallAttr extends BasePo {
    private String smallAttrId;

    private String smallAttrName;

    private String parentAttrId;

    private Integer sorts;

    private String content;

    private String addPrice;

    private String logo;

    public String getSmallAttrId() {
        return smallAttrId;
    }

    public void setSmallAttrId(String smallAttrId) {
        this.smallAttrId = smallAttrId == null ? null : smallAttrId.trim();
    }

    public String getSmallAttrName() {
        return smallAttrName;
    }

    public void setSmallAttrName(String smallAttrName) {
        this.smallAttrName = smallAttrName == null ? null : smallAttrName.trim();
    }

    public String getParentAttrId() {
        return parentAttrId;
    }

    public void setParentAttrId(String parentAttrId) {
        this.parentAttrId = parentAttrId == null ? null : parentAttrId.trim();
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(String addPrice) {
        this.addPrice = addPrice == null ? null : addPrice.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}