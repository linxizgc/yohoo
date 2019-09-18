package com.yohoo.system.bo;

import com.yohoo.system.po.AdminUser;

public class AdminUserBo extends AdminUser {

    private String roleIds;

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
}