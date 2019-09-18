package com.yohoo.core.bo;

import java.io.Serializable;

/**
 * Created by kaikentule on 2018/10/21.
 * bootstrapTable queryParamsType的默认值为'limit',传给服务端的参数为：offset,limit,sort; 设置为''传给服务器的参数为：pageSize,pageNumber
 */
public class BasePo implements Serializable {
    private int pageNumber;
    private int pageSize = 20;

    private String sort;
    private int offset;
    private int limit;

    private String fullPath;

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
