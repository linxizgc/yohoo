package com.yohoo.core.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linxi
 * @Description: 带对象/集合的 JSON数据返回对象
 * @date 2019年1月14日
 */
public class JsonObjResult<T> extends JsonResult {

    private T record;

    private List<T> rows = new ArrayList<T>();

    public T getRecord() {
        return record;
    }

    public void setRecord(T record) {
        this.record = record;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

