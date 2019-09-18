package com.yohoo.system.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.system.bo.AdminUserBo;
import com.yohoo.system.bo.AdminUserRoleBo;
import com.yohoo.system.dao.AdminUserDao;
import com.yohoo.system.po.AdminUser;
import com.yohoo.system.po.AdminUserExample;
import com.yohoo.system.service.AdminUserService;
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
public class AdminUserServiceImpl extends BaseService implements AdminUserService {


    @Autowired
    AdminUserDao adminUserDao;

//    @Autowired
//    PasswordEncoder passwordEncoder;


    @Override
    public PageInfo<AdminUserBo> getUserList(AdminUserBo userBo) {
        try {
            return queryForPage(AdminUserDao.class, "selectRows",userBo);
        } catch (Exception e) {
            throw new BusinessException("查询系统用户列表失败！");
        }
    }

    @Override
    public void saveOrUpdate(AdminUserBo userBo) throws Exception {
        AdminUser po = new AdminUser();
        BeanUtils.copyProperties(po, userBo);
        if (!StringUtils.isEmpty(po.getId())) {
            po.setModifyDate(new Date());
            adminUserDao.updateByPrimaryKeySelective(po);
        } else {
            po.setCreateDate(new Date());
            po.setStatus(1);
//            po.setPassword(passwordEncoder.encode("123456"));
            adminUserDao.insert(po);
        }
    }

    @Override
    public AdminUserBo getById(Integer id) {
        return adminUserDao.selectByPrimaryKey(id);
    }

    @Override
    public AdminUserBo getAdminUser(AdminUserBo bo) {
        AdminUserExample ex = new AdminUserExample();
        ex.createCriteria().andLoginNameEqualTo(bo.getLoginName());
        List<AdminUserBo> users = adminUserDao.selectByExample(ex);
        if(users.size() > 0){
            return users.get(0);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        adminUserDao.deleteByPrimaryKey(id);
    }

    @Override
    public void saveRelation(AdminUserBo userBo) throws Exception {
        List<AdminUser> iList = new ArrayList<>();
        String[] ids = userBo.getRoleIds().split(",");
        adminUserDao.deleteJoinRoleByUserId(userBo.getId());
        for (int i = 0; i < ids.length; i++) {
            AdminUser al = new AdminUser();
            al.setId(userBo.getId());
            al.setRoleId(Integer.parseInt(ids[i]));
            iList.add(al);
        }
        adminUserDao.insertJoinRoleByBatch(iList);
    }

    @Override
    public List<AdminUserRoleBo> getRolesByUserId(Integer userId) {
        return adminUserDao.selectRolesByUserId(userId);
    }

    @Override
    public void changeStauts(Integer id, Integer status) {
        AdminUser po = new AdminUser();
        po.setId(id);
        po.setStatus(1 == status ? 0 : 1);
        adminUserDao.updateByPrimaryKeySelective(po);
    }
}
