package com.yohoo.taobao.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.taobao.bo.TbGoodsBo;
import com.yohoo.taobao.bo.TbTypeBo;
import com.yohoo.taobao.po.TbGoods;
import com.yohoo.taobao.po.TbGoodsExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbGoodsMapper extends BaseDao<TbGoods, TbGoodsBo, TbGoodsExample, String> {

    TbTypeBo getTbType(String typeName);

    List<TbGoodsBo> selectRows_i(TbGoodsBo bo);
}