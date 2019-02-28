package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.luhuiling.graduation.po.utils.Query;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.po.NotificationDO;
import com.luhuiling.graduation.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController{
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/get")
    public NotificationDO get(Long id){
        return notificationService.get(id);
    }

    @RequestMapping("/list")
    public List<NotificationDO> list(@RequestParam Map<String,Object> params){
        Query query = new Query(params);
        return notificationService.list(query);
    }

    @RequestMapping("/save")
    public R save(@RequestBody NotificationDO notification){
        if(notificationService.save(notification)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody NotificationDO notification){
        if(notificationService.update(notification)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/remove")
    public R remove(Long id){
        if(notificationService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    public R batchRemove(@RequestParam("ids[]") Long[] ids){           notificationService.batchRemove(ids);
        return R.ok();
    }
}