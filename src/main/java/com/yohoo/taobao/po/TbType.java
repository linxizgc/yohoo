package com.yohoo.taobao.po;

import com.yohoo.core.bo.BasePo;

public class TbType extends BasePo {
    private String typId;

    private String typTitle;

    private String typDescribe;

    private Integer sorts;

    private String status;

    public String getTypId() {
        return typId;
    }

    public void setTypId(String typId) {
        this.typId = typId == null ? null : typId.trim();
    }

    public String getTypTitle() {
        return typTitle;
    }

    public void setTypTitle(String typTitle) {
        this.typTitle = typTitle == null ? null : typTitle.trim();
    }

    public String getTypDescribe() {
        return typDescribe;
    }

    public void setTypDescribe(String typDescribe) {
        this.typDescribe = typDescribe == null ? null : typDescribe.trim();
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