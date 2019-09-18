package com.yohoo.product.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.product.bo.FtxTypeBo;

/**
 * 产品类型
 */
public interface FtxTypeService {

    PageInfo<FtxTypeBo> getTypeList(FtxTypeBo bo);

    void saveOrUpdate(FtxTypeBo bo) throws Exception;

    FtxTypeBo getById(String id);

    void delete(String id);
}