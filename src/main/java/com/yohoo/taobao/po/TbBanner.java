package com.yohoo.taobao.po;

import com.yohoo.core.bo.BasePo;

public class TbBanner extends BasePo {
    private String banId;

    private String banTitle;

    private String linkUrl;

    private String linkImg;

    private Integer sorts;

    private String status;

    public String getBanId() {
        return banId;
    }

    public void setBanId(String banId) {
        this.banId = banId == null ? null : banId.trim();
    }

    public String getBanTitle() {
        return banTitle;
    }

    public void setBanTitle(String banTitle) {
        this.banTitle = banTitle == null ? null : banTitle.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg == null ? null : linkImg.trim();
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