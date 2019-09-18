package com.yohoo.system.po;

import com.yohoo.core.bo.BasePo;

public class AdminMenu extends BasePo {
    private Integer id;

    private String parentMenuId;

    private String menuName;

    private String menuCode;

    private String uri;

    private Integer sorts;

    private Integer menuLevel;

    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId == null ? null : parentMenuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}