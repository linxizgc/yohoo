package com.yohoo.system.bo;

import com.yohoo.system.po.AdminRole;

public class AdminRoleBo extends AdminRole {

    private String menuIds;

    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }
}