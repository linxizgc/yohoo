package com.yohoo.taobao.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.taobao.bo.TbTypeBo;
import com.yohoo.taobao.po.TbType;
import com.yohoo.taobao.po.TbTypeExample;
import org.springframework.stereotype.Repository;

@Repository
public interface TbTypeMapper extends BaseDao<TbType, TbTypeBo, TbTypeExample, String> {
}