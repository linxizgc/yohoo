package com.yohoo.taobao.service;


import com.github.pagehelper.PageInfo;
import com.yohoo.taobao.bo.TbBannerBo;

/**
 * 产品类型
 */
public interface TbBannerService {

    PageInfo<TbBannerBo> getList(TbBannerBo bo);

    void saveOrUpdate(TbBannerBo bo) throws Exception;

    TbBannerBo getById(String id);

    void delete(String id);
}