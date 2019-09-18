package com.yohoo.system.service;


import com.yohoo.system.bo.FtxFileBo;


public interface FtxFileService {

    void save(FtxFileBo bo);

    FtxFileBo getById(String id);

    void delete(String id);
}