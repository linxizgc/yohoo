package com.yohoo.system.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.system.bo.AdminUserBo;
import com.yohoo.system.bo.AdminUserRoleBo;

import java.util.List;

/**
 * 系统用户
 */
public interface AdminUserService {
    PageInfo<AdminUserBo> getUserList(AdminUserBo userBo);

    void saveOrUpdate(AdminUserBo userBo) throws Exception;

    AdminUserBo getById(Integer id);

    AdminUserBo getAdminUser(AdminUserBo bo);

    void delete(Integer id);

    void saveRelation(AdminUserBo userBo) throws Exception;

    List<AdminUserRoleBo> getRolesByUserId(Integer userId);

    void changeStauts(Integer id, Integer status);


}