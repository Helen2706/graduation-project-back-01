package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.luhuiling.graduation.po.utils.Query;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.po.SystemMenuDO;
import com.luhuiling.graduation.service.SystemMenuService;

@RestController
@RequestMapping("/systemMenu")
public class SystemMenuController{
    @Autowired
    private SystemMenuService systemMenuService;

    @RequestMapping("/get")
    public SystemMenuDO get(Integer id){
        return systemMenuService.get(id);
    }

    @RequestMapping("/list")
    public List<SystemMenuDO> list(@RequestParam Map<String,Object> params){
        Query query = new Query(params);
        return systemMenuService.list(query);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SystemMenuDO systemMenu){
        if(systemMenuService.save(systemMenu)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SystemMenuDO systemMenu){
        if(systemMenuService.update(systemMenu)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/remove")
    public R remove(Integer id){
        if(systemMenuService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    public R batchRemove(@RequestParam("ids[]") Integer[] ids){           systemMenuService.batchRemove(ids);
        return R.ok();
    }
}