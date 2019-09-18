package com.yohoo.system.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.system.bo.AdminRoleBo;
import com.yohoo.system.bo.AdminRoleMenuBo;
import com.yohoo.system.dao.AdminRoleDao;
import com.yohoo.system.po.AdminRole;
import com.yohoo.system.service.AdminRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by LinXi on 2017/4/27/027.
 */
@Service
public class AdminRoleServiceImpl extends BaseService implements AdminRoleService {


    @Autowired
    AdminRoleDao adminRoleDao;

    @Override
    public PageInfo<AdminRoleBo> getUserList(AdminRoleBo roleBo) {
        try {
            return queryForPage(AdminRoleDao.class, "selectRows", roleBo);
        } catch (Exception e) {
            throw new BusinessException("查询系统角色列表失败！");
        }
    }

    @Override
    public void saveOrUpdate(AdminRoleBo roleBo) throws Exception {
        AdminRole po = new AdminRole();
        BeanUtils.copyProperties(po, roleBo);
        if (!StringUtils.isEmpty(po.getId())) {
            po.setModifyDate(new Date());
            adminRoleDao.updateByPrimaryKeySelective(po);
        } else {
            po.setCreateDate(new Date());
            adminRoleDao.insert(po);
        }
    }

    @Override
    public AdminRoleBo getById(Integer id) {
        return adminRoleDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(Integer id) {
        adminRoleDao.deleteByPrimaryKey(id);
    }

    @Override
    public void saveRelation(AdminRoleBo roleBo) throws Exception {
        List<AdminRole> iList = new ArrayList<>();
        String[] ids = roleBo.getMenuIds().split(",");
        adminRoleDao.deleteJoinMenuByRoleId(roleBo.getId());
        for (int i = 0; i < ids.length; i++) {
            AdminRole al = new AdminRole();
            al.setId(roleBo.getId());
            al.setMenuId(Integer.parseInt(ids[i]));
            iList.add(al);
        }
        adminRoleDao.insertJoinMenuByBatch(iList);
    }

    @Override
    public List<AdminRoleMenuBo> getMenusByRoleId(Integer roleId) {
        return adminRoleDao.selectMenusByRoleId(roleId);
    }
}
