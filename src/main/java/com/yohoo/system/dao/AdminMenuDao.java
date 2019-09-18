package com.yohoo.system.dao;


import com.yohoo.core.dao.BaseDao;
import com.yohoo.system.bo.AdminMenuBo;
import com.yohoo.system.bo.TreeMenu;
import com.yohoo.system.po.AdminMenu;
import com.yohoo.system.po.AdminMenuExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMenuDao extends BaseDao<AdminMenu, AdminMenuBo, AdminMenuExample, Integer> {

    List<TreeMenu> selectTreeList(AdminMenuBo menuBo);

    List<TreeMenu> selectMenusByUserId(Integer userId);
}