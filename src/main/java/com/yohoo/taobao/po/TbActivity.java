package com.yohoo.taobao.po;

import com.yohoo.core.bo.BasePo;

import java.util.Date;

public class TbActivity extends BasePo {
    private String actId;

    private String actName;

    private String linkUrl;

    private String linkImg;

    private Date startTime;

    private Date endTime;

    private Integer sorts;

    private String status;

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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