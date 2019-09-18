package com.yohoo.taobao.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.taobao.bo.TbGoodsBo;
import com.yohoo.taobao.bo.TbTypeBo;

import java.util.List;

/**
 * 产品类型
 */
public interface TbGoodsService {

    PageInfo<TbGoodsBo> getList(TbGoodsBo bo);

    TbTypeBo getTbType(String typTitle);

    void saveOrUpdate(TbGoodsBo bo) throws Exception;

    List<TbGoodsBo> getByName(String gooName);

    TbGoodsBo getById(String id);

    void delete(String id);




    PageInfo<TbGoodsBo> getList_i(TbGoodsBo bo);
}