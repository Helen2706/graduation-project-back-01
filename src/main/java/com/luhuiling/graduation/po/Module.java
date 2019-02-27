package com.luhuiling.graduation.po;

import com.luhuiling.graduation.po.utils.Field;

import java.util.List;

/**
 * 存储数据库相关信息
 */
public class Module {
    private String moduleName;      //模块名/数据库名
    private String moduleEName;     //模块/数据库英文名
    private List<Field> fields;     //数据库中字段列表

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleEName() {
        return moduleEName;
    }

    public void setModuleEName(String moduleEName) {
        this.moduleEName = moduleEName;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
