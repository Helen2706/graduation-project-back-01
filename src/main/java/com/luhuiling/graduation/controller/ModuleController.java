package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.utils.Module;
import com.luhuiling.graduation.po.utils.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理有关模块/数据库表增删改查的有关请求
 */
@RestController
@RequestMapping("/module")
public class ModuleController {

    @RequestMapping("/add")
    public R add(@RequestBody Module module){
        System.out.println(module.getModuleName());
        return R.ok();
    }
}
