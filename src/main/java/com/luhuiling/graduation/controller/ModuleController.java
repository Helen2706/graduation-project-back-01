package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.dao.ModuleDao;
import com.luhuiling.graduation.po.Module;
import com.luhuiling.graduation.po.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 处理有关模块/数据库表增删改查的有关请求
 */
@RestController
@RequestMapping("/module")
public class ModuleController {
    @Autowired
    ModuleDao moduleDao;

    @RequestMapping("/add")
    public R add(@RequestBody Module module){
        moduleDao.createTable(module);
        return R.ok();
    }

    @RequestMapping("/list")
    public List<Map> list(){
        List<Map> lists = moduleDao.listTables();
        return lists;
    }

    /**
     * 批量删除
     */
    @RequestMapping("/batchRemove")
    @ResponseBody
    public R remove(@RequestParam("tables[]") String[] tables){
        for (String table:tables){
            moduleDao.deleteTable(table);
        }
        return R.ok();
    }
}
