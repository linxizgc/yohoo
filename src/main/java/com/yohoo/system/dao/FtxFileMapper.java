package com.yohoo.system.dao;

import com.yohoo.core.dao.BaseDao;
import com.yohoo.system.bo.FtxFileBo;
import com.yohoo.system.po.FtxFile;
import com.yohoo.system.po.FtxFileExample;
import org.springframework.stereotype.Repository;

@Repository
public interface FtxFileMapper extends BaseDao<FtxFile, FtxFileBo, FtxFileExample, String> {

}