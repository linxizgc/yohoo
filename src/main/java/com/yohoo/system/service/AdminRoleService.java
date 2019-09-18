package com.yohoo.system.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.system.bo.AdminRoleBo;
import com.yohoo.system.bo.AdminRoleMenuBo;

import java.util.List;

/**
 * 系统角色
 */
public interface AdminRoleService {
    PageInfo<AdminRoleBo> getUserList(AdminRoleBo roleBo);

    void saveOrUpdate(AdminRoleBo roleBo) throws Exception;

    AdminRoleBo getById(Integer id);

    void delete(Integer id);

    void saveRelation(AdminRoleBo roleBo) throws Exception;

    List<AdminRoleMenuBo> getMenusByRoleId(Integer roleId);
}