package com.luhuiling.graduation.po.utils;

/**
 * 数据库字段有关信息
 */
public class Field {
    private String name;            //字段名
    private String comment;         //注释
    private int type;               //类型
    private int length ;            //长度
    private boolean required;       //是否必填

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}
