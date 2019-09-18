package com.yohoo.system.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.system.service.AdminMenuService;
import com.yohoo.system.bo.AdminMenuBo;
import com.yohoo.system.bo.TreeMenu;
import com.yohoo.system.dao.AdminMenuDao;
import com.yohoo.system.po.AdminMenu;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LinXi on 2017/4/27/027.
 */
@Service
public class AdminMenuServiceImpl extends BaseService implements AdminMenuService {


    @Autowired
    private AdminMenuDao adminMenuDao;

    @Override
    public List<TreeMenu> getTreeList(AdminMenuBo menuBo) {
        List<TreeMenu> list = adminMenuDao.selectTreeList(menuBo);

        List<TreeMenu> menus = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            TreeMenu menu = list.get(i);
            if (UtilPub.isEmpty(menu.getParentMenuId())) {
                List<TreeMenu> children = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    TreeMenu bo = list.get(j);
                    if (String.valueOf(menu.getId()).equals(bo.getParentMenuId())) {
                        children.add(bo);
                    }
                }
                menu.setChildren(children);
                menus.add(menu);
            }
        }
        return menus;
    }

    @Override
    public List<TreeMenu> getMenusByUserId(Integer userId) {
        List<TreeMenu> treeMenus = adminMenuDao.selectMenusByUserId(userId);
        List<TreeMenu> f = new ArrayList<>();
        for (int i = 0; i < treeMenus.size(); i++) {
            if(1 == treeMenus.get(i).getMenuLevel()){
                f.add(treeMenus.get(i));
            }
        }
        for (int i = 0; i < f.size(); i++) {
            List<TreeMenu> z = new ArrayList<>();
            for (int j = 0; j < treeMenus.size(); j++) {
                if (String.valueOf(f.get(i).getId()).equals(treeMenus.get(j).getParentMenuId())) {
                    z.add(treeMenus.get(j));
                }
            }
            f.get(i).setChildren(z);
        }
        return f;
    }

    @Override
    public PageInfo<AdminMenuBo> getMenuList(AdminMenuBo menuBo) {
        try {
            return queryForPage(AdminMenuDao.class, "selectRows", menuBo);
        } catch (Exception e) {
            throw new BusinessException("查询系统用户列表失败！");
        }
    }

    @Override
    public void saveOrUpdate(AdminMenuBo menuBo) throws Exception {
        AdminMenu po = new AdminMenu();
        BeanUtils.copyProperties(po, menuBo);
        if (!StringUtils.isEmpty(po.getId())) {
            adminMenuDao.updateByPrimaryKeySelective(po);
        } else {
            adminMenuDao.insert(po);
        }
    }

    @Override
    public AdminMenuBo getById(Integer id) {
        return adminMenuDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(Integer id) {
        adminMenuDao.deleteByPrimaryKey(id);
    }
}
