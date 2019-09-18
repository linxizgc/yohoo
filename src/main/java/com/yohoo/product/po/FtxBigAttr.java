package com.yohoo.product.po;

import com.yohoo.core.bo.BasePo;

public class FtxBigAttr extends BasePo {
    private String bigAttrId;

    private String bigAttrName;

    private Integer sorts;

    private String content;

    private String logo;

    public String getBigAttrId() {
        return bigAttrId;
    }

    public void setBigAttrId(String bigAttrId) {
        this.bigAttrId = bigAttrId == null ? null : bigAttrId.trim();
    }

    public String getBigAttrName() {
        return bigAttrName;
    }

    public void setBigAttrName(String bigAttrName) {
        this.bigAttrName = bigAttrName == null ? null : bigAttrName.trim();
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}