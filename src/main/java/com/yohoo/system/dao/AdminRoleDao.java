package com.yohoo.system.dao;


import com.yohoo.core.dao.BaseDao;
import com.yohoo.system.bo.AdminRoleBo;
import com.yohoo.system.bo.AdminRoleMenuBo;
import com.yohoo.system.po.AdminRole;
import com.yohoo.system.po.AdminRoleExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRoleDao extends BaseDao<AdminRole, AdminRoleBo, AdminRoleExample, Integer> {
    int deleteJoinMenuByRoleId(Integer roleId);

    void insertJoinMenuByBatch(List<AdminRole> list);

    List<AdminRoleMenuBo> selectMenusByRoleId(Integer roleId);
}