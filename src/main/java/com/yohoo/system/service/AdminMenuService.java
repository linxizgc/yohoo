package com.yohoo.system.service;



import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.JsonObjResult;
import com.yohoo.system.bo.AdminMenuBo;
import com.yohoo.system.bo.TreeMenu;

import java.util.List;

/**
 * 系统菜单
 */
public interface AdminMenuService {
    List<TreeMenu> getTreeList(AdminMenuBo menuBo);

    List<TreeMenu> getMenusByUserId(Integer userId);

    PageInfo<AdminMenuBo> getMenuList(AdminMenuBo menuBo);

    void saveOrUpdate(AdminMenuBo menuBo) throws Exception;

    AdminMenuBo getById(Integer id);

    void delete(Integer id);
}