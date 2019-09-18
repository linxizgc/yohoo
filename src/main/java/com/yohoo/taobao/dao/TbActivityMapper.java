package com.yohoo.taobao.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.taobao.bo.TbActivityBo;
import com.yohoo.taobao.po.TbActivity;
import com.yohoo.taobao.po.TbActivityExample;
import org.springframework.stereotype.Repository;

@Repository
public interface TbActivityMapper extends BaseDao<TbActivity, TbActivityBo, TbActivityExample, String> {
}