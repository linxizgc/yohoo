package com.yohoo.product.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.product.bo.FtxTypeBo;
import com.yohoo.product.dao.FtxTypeMapper;
import com.yohoo.product.service.FtxTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaikentule on 2019/3/27.
 */
@Service
public class FtxTypeServiceImpl extends BaseService implements FtxTypeService {

    @Autowired
    FtxTypeMapper typeMapper;

    @Override
    public PageInfo<FtxTypeBo> getTypeList(FtxTypeBo bo) {
        try {
            return queryForPage(FtxTypeMapper.class, "selectRows", bo);
        } catch (Exception e) {
            throw new BusinessException("查询类型列表失败");
        }
    }

    @Override
    public void saveOrUpdate(FtxTypeBo bo) throws Exception {
        if (UtilPub.isNotEmpty(bo.getTypeId())) {
            typeMapper.updateByPrimaryKey(bo);
        } else {
            bo.setTypeId(getUUID());
            typeMapper.insert(bo);
        }
    }

    @Override
    public FtxTypeBo getById(String id) {
        FtxTypeBo ftxTypeBo = typeMapper.selectByPrimaryKey(id);
        if (UtilPub.isNotEmpty(ftxTypeBo)) {
            this.setImgesFullPath(ftxTypeBo, ftxTypeBo.getLogo());
        }
        return ftxTypeBo;
    }

    @Override
    public void delete(String id) {
        typeMapper.deleteByPrimaryKey(id);
    }
}
