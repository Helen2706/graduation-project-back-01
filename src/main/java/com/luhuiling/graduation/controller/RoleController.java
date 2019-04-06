package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.luhuiling.graduation.po.utils.Query;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.po.RoleDO;
import com.luhuiling.graduation.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController{
    @Autowired
    private RoleService roleService;

    @RequestMapping("/get")
    public RoleDO get(Long id){
        return roleService.get(id);
    }

    @RequestMapping("/list")
    public List<RoleDO> list(@RequestParam Map<String,Object> params){
        Query query = new Query(params);
        return roleService.list(query);
    }

    @RequestMapping("/save")
    public R save(@RequestBody RoleDO role){
        if(roleService.save(role)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody RoleDO role){
        if(roleService.update(role)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/remove")
    public R remove(Long id){
        if(roleService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    public R batchRemove(@RequestParam("ids[]") Long[] ids){           roleService.batchRemove(ids);
        return R.ok();
    }
}