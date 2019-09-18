package com.yohoo.product.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.product.bo.FtxTypeBo;
import com.yohoo.product.po.FtxType;
import com.yohoo.product.po.FtxTypeExample;
import org.springframework.stereotype.Repository;

@Repository
public interface FtxTypeMapper extends BaseDao<FtxType, FtxTypeBo, FtxTypeExample, String> {

}