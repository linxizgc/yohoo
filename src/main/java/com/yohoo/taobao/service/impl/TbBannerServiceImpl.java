package com.yohoo.taobao.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.taobao.bo.TbBannerBo;
import com.yohoo.taobao.dao.TbBannerMapper;
import com.yohoo.taobao.service.TbBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaikentule on 2019/3/27.
 */
@Service
public class TbBannerServiceImpl extends BaseService implements TbBannerService {

    @Autowired
    TbBannerMapper tbBannerMapper;

    @Override
    public PageInfo<TbBannerBo> getList(TbBannerBo bo) {
        try {
            return queryForPage(TbBannerMapper.class, "selectRows", bo);
        } catch (Exception e) {
            throw new BusinessException("查询Banner列表失败");
        }
    }

    @Override
    public void saveOrUpdate(TbBannerBo bo) throws Exception {
        if (UtilPub.isNotEmpty(bo.getBanId())) {
            tbBannerMapper.updateByPrimaryKey(bo);
        } else {
            bo.setBanId(getUUID());
            tbBannerMapper.insert(bo);
        }
    }

    @Override
    public TbBannerBo getById(String id) {
        return tbBannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        tbBannerMapper.deleteByPrimaryKey(id);
    }
}
