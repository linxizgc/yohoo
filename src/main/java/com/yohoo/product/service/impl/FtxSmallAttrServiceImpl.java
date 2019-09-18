package com.yohoo.product.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.product.bo.FtxSmallAttrBo;
import com.yohoo.product.dao.FtxSmallAttrMapper;
import com.yohoo.product.service.FtxSmallAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaikentule on 2019/3/27.
 */
@Service
public class FtxSmallAttrServiceImpl extends BaseService implements FtxSmallAttrService {

    @Autowired
    FtxSmallAttrMapper mapper;

    @Override
    public PageInfo<FtxSmallAttrBo> getList(FtxSmallAttrBo bo) {
        try {
            return queryForPage(FtxSmallAttrMapper.class, "selectRows", bo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException("查询小属性列表失败");
        }
    }

    @Override
    public void saveOrUpdate(FtxSmallAttrBo bo) throws Exception {
        if (UtilPub.isNotEmpty(bo.getSmallAttrId())) {
            mapper.updateByPrimaryKey(bo);
        } else {
            bo.setSmallAttrId(getUUID());
            mapper.insert(bo);
        }
    }

    @Override
    public FtxSmallAttrBo getById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        mapper.deleteByPrimaryKey(id);
    }
}
