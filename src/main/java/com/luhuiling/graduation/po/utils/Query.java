package com.luhuiling.graduation.po.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 查询参数封装的实体
 */
public class Query extends LinkedHashMap<String,Object> {
    private static final long serialVersionUID = 1L;

    //偏移
    private int offset;
    //每页条数
    private int limit;

    public Query(Map<String,Object> params){
        this.putAll(params);
        //分页参数
        if(params.size() != 0){
            this.offset = Integer.parseInt(params.get("offset").toString());
            this.limit = Integer.parseInt(params.get("limit").toString());
            this.put("offset",offset);
            this.put("page",offset/limit+1);
            this.put("limit",limit);
        }else {
            this.put("offset",0);
            this.put("page",1);
            this.put("limit",100);
        }

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
