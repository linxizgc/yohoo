package com.yohoo.product.po;

import com.yohoo.core.bo.BasePo;

public class FtxType extends BasePo{
    private String typeId;

    private String typeName;

    private Integer sorts;

    private String logo;

    private String title;

    private String content;

    private Integer onTop;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getOnTop() {
        return onTop;
    }

    public void setOnTop(Integer onTop) {
        this.onTop = onTop;
    }
}