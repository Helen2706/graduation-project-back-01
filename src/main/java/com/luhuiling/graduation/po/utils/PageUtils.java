package com.luhuiling.graduation.po.utils;

import java.io.Serializable;
import java.util.List;

public class PageUtils implements Serializable{
    private static final long serialVersionUID = 1L;
    //总数
    private int total;
    //每项
    private List<?> rows;

    public PageUtils(int total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
