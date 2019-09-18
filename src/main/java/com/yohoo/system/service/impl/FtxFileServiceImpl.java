package com.yohoo.system.service.impl;

import com.yohoo.core.service.BaseService;
import com.yohoo.system.bo.FtxFileBo;
import com.yohoo.system.dao.FtxFileMapper;
import com.yohoo.system.service.FtxFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaikentule on 2019/3/27.
 */
@Service
public class FtxFileServiceImpl extends BaseService implements FtxFileService {

    @Autowired
    FtxFileMapper fileMapper;

    @Override
    public void save(FtxFileBo bo){
        fileMapper.insert(bo);
    }

    @Override
    public FtxFileBo getById(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
