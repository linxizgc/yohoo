package com.yohoo.product.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.product.bo.FtxBigAttrBo;
import com.yohoo.product.dao.FtxBigAttrMapper;
import com.yohoo.product.service.FtxBigAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaikentule on 2019/3/27.
 */
@Service
public class FtxBigAttrServiceImpl extends BaseService implements FtxBigAttrService {

    @Autowired
    FtxBigAttrMapper mapper;

    @Override
    public PageInfo<FtxBigAttrBo> getList(FtxBigAttrBo bo) {
        try {
            return queryForPage(FtxBigAttrMapper.class, "selectRows", bo);
        } catch (Exception e) {
            throw new BusinessException("查询大属性列表失败");
        }
    }

    @Override
    public List<FtxBigAttrBo> getAllList(FtxBigAttrBo bo) {
        return mapper.selectRows(bo);
    }

    @Override
    public void saveOrUpdate(FtxBigAttrBo bo) throws Exception {
        if (UtilPub.isNotEmpty(bo.getBigAttrId())) {
            mapper.updateByPrimaryKey(bo);
        } else {
            bo.setBigAttrId(getUUID());
            mapper.insert(bo);
        }
    }

    @Override
    public FtxBigAttrBo getById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        mapper.deleteByPrimaryKey(id);
    }
}
