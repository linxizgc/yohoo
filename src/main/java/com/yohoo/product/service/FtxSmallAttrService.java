package com.yohoo.product.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.product.bo.FtxSmallAttrBo;

/**
 * 产品小属性
 */
public interface FtxSmallAttrService {

    PageInfo<FtxSmallAttrBo> getList(FtxSmallAttrBo bo);

    void saveOrUpdate(FtxSmallAttrBo bo) throws Exception;

    FtxSmallAttrBo getById(String id);

    void delete(String id);
}