package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.utils.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.luhuiling.graduation.po.utils.Query;
import com.luhuiling.graduation.po.UserDO;
import com.luhuiling.graduation.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /*获取当前已登录用户*/
    @RequestMapping("/selectUser")
    public R selectUser() throws BDException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        UserDO userDO;
        try{
            Subject subject = ShiroUtils.getSubject();
            userDO = (UserDO) subject.getPrincipal();
        }catch (Exception e){
            throw new BDException("获取用户信息失败",100);
        }

        resultMap.put("userDO", userDO);

        return R.ok(resultMap);
    }

    /*退出系统*/
    @RequestMapping("/logout")
    public R logout() throws BDException{
        try{
            ShiroUtils.getSubject().logout();
        }catch (Exception e){
            throw new BDException("退出系统失败",100);
        }
        return R.ok("成功退出系统");
    }

    @RequestMapping("/get")
    public UserDO get(Long userId) {
        return userService.get(userId);
    }

    @RequestMapping("/list")
    public List<UserDO> list(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        return userService.list(query);
    }

    @RequestMapping("/save")
    public R save(@RequestBody UserDO user) {
        if (userService.save(user) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody UserDO user) {
        if (userService.update(user) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/remove")
    public R remove(Long userId) {
        if (userService.remove(userId) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    public R batchRemove(@RequestParam("ids[]") Long[] userIds) {
        userService.batchRemove(userIds);
        return R.ok();
    }
}