package com.yohoo.system.dao;


import com.yohoo.core.dao.BaseDao;
import com.yohoo.system.bo.AdminRoleMenuBo;
import com.yohoo.system.po.AdminRoleMenu;
import com.yohoo.system.po.AdminRoleMenuExample;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRoleMenuDao extends BaseDao<AdminRoleMenu, AdminRoleMenuBo, AdminRoleMenuExample, Integer> {
}