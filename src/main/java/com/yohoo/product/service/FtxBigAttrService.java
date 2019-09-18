package com.yohoo.product.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.product.bo.FtxBigAttrBo;

import java.util.List;

/**
 * 产品大属性
 */
public interface FtxBigAttrService {

    PageInfo<FtxBigAttrBo> getList(FtxBigAttrBo bo);

    List<FtxBigAttrBo> getAllList(FtxBigAttrBo bo);

    void saveOrUpdate(FtxBigAttrBo bo) throws Exception;

    FtxBigAttrBo getById(String id);

    void delete(String id);
}