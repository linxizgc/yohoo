package com.yohoo.taobao.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.taobao.bo.TbBannerBo;
import com.yohoo.taobao.po.TbBanner;
import com.yohoo.taobao.po.TbBannerExample;
import org.springframework.stereotype.Repository;

@Repository
public interface TbBannerMapper extends BaseDao<TbBanner, TbBannerBo, TbBannerExample, String> {
}