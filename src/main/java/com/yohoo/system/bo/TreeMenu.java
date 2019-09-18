package com.yohoo.system.bo;

import java.util.List;

/**
 * 菜单树 构建体
 * Created by LinXi on 2017/4/29/029.
 */
public class TreeMenu {
    private Integer id;

    private String parentMenuId;

    private String menuName;

    private String menuCode;

    private String uri;

    private Integer sorts;

    private Integer menuLevel;

    private String icon;

    private String checkState;

    List<TreeMenu> children;

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
        this.parentMenuId = parentMenuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
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
        this.icon = icon;
    }

    public List<TreeMenu> getChildren() {
        return children;
    }

    public void setChildren(List<TreeMenu> children) {
        this.children = children;
    }
}
