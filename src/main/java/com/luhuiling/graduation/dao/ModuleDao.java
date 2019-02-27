package com.luhuiling.graduation.dao;

import com.luhuiling.graduation.po.Module;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/*增加和删除数据库表*/
public interface ModuleDao {
    void deleteTable(@Param(value="tableName") String tableName);

    void createTable(Module module);

    List<Map> listTables();
}
