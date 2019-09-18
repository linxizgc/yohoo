package com.yohoo.system.dao;


import com.yohoo.core.dao.BaseDao;
import com.yohoo.system.bo.AdminUserRoleBo;
import com.yohoo.system.po.AdminUserRole;
import com.yohoo.system.po.AdminUserRoleExample;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRoleDao extends BaseDao<AdminUserRole, AdminUserRoleBo, AdminUserRoleExample, Integer> {
}