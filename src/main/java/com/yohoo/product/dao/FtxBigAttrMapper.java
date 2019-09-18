package com.yohoo.product.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.product.bo.FtxBigAttrBo;
import com.yohoo.product.po.FtxBigAttr;
import com.yohoo.product.po.FtxBigAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FtxBigAttrMapper extends BaseDao<FtxBigAttr, FtxBigAttrBo, FtxBigAttrExample, String> {

}