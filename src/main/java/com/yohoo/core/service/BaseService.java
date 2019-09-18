package com.yohoo.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yohoo.core.bo.BasePo;
import com.yohoo.core.config.Constant;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.system.bo.FtxFileBo;
import com.yohoo.system.dao.FtxFileMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public abstract class BaseService {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    protected FtxFileMapper fileMapper;


    protected String getUUID() {
        return UUID.randomUUID().toString();
    }


    protected <T> PageInfo<T> queryForPage(Class mapper, String method, BasePo bo) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            PageHelper.startPage(bo.getPageNumber(), bo.getPageSize());
            List list = session.selectList(mapper.getName() + "." + method, bo);
            return new PageInfo<>(list);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException("分页查询失败");
        } finally {
            session.close();
        }
    }

    protected void setImgesFullPath(BasePo obj, String logoId) {
        FtxFileBo ftxFileBo = fileMapper.selectByPrimaryKey(logoId);
        if(UtilPub.isNotEmpty(ftxFileBo)) {
            obj.setFullPath(Constant.DOMAIN_NAME + ftxFileBo.getFullPath());
        }
    }
}
