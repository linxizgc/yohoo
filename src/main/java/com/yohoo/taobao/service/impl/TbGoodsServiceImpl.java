package com.yohoo.taobao.service.impl;

import com.github.pagehelper.PageInfo;
import com.yohoo.core.exception.BusinessException;
import com.yohoo.core.service.BaseService;
import com.yohoo.core.utils.UtilPub;
import com.yohoo.taobao.bo.TbGoodsBo;
import com.yohoo.taobao.bo.TbTypeBo;
import com.yohoo.taobao.dao.TbGoodsMapper;
import com.yohoo.taobao.po.TbGoodsExample;
import com.yohoo.taobao.service.TbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaikentule on 2019/3/27.
 */
@Service
public class TbGoodsServiceImpl extends BaseService implements TbGoodsService {

    @Autowired
    TbGoodsMapper tbGoodsMapper;

    @Override
    public PageInfo<TbGoodsBo> getList(TbGoodsBo bo) {
        try {
            return queryForPage(TbGoodsMapper.class, "selectRows", bo);
        } catch (Exception e) {
            throw new BusinessException("查询商品列表失败");
        }
    }

    @Override
    public TbTypeBo getTbType(String typTitle) {
        return tbGoodsMapper.getTbType(typTitle);
    }

    @Override
    public void saveOrUpdate(TbGoodsBo bo) throws Exception {
        if (UtilPub.isNotEmpty(bo.getGooId())) {
            tbGoodsMapper.updateByPrimaryKey(bo);
        } else {
            bo.setGooId(getUUID());
            bo.setGooImg(bo.getGooImg() + "_280x380xz.jpg");
            tbGoodsMapper.insert(bo);
        }
    }

    @Override
    public List<TbGoodsBo> getByName(String gooName) {
        TbGoodsExample ex = new TbGoodsExample();
        ex.createCriteria().andGooNameEqualTo(gooName).andStatusEqualTo("1");
        return tbGoodsMapper.selectByExample(ex);
    }

    @Override
    public TbGoodsBo getById(String id) {
        return tbGoodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        tbGoodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<TbGoodsBo> getList_i(TbGoodsBo bo) {
        try {
            return queryForPage(TbGoodsMapper.class, "selectRows_i", bo);
        } catch (Exception e) {
            throw new BusinessException("查询商品列表失败");
        }
    }
}
