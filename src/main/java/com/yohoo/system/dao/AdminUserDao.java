package com.yohoo.system.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.system.bo.AdminUserBo;
import com.yohoo.system.bo.AdminUserRoleBo;
import com.yohoo.system.po.AdminUser;
import com.yohoo.system.po.AdminUserExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminUserDao extends BaseDao<AdminUser, AdminUserBo, AdminUserExample, Integer> {

    int deleteJoinRoleByUserId(Integer userId);

    void insertJoinRoleByBatch(List<AdminUser> list);

    List<AdminUserRoleBo> selectRolesByUserId(Integer userId);
}