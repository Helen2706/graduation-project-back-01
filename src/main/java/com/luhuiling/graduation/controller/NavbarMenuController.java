package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.NavbarMenu;
import com.luhuiling.graduation.po.utils.PageUtils;
import com.luhuiling.graduation.po.utils.Query;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.service.NavbarMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/navbar")
public class NavbarMenuController {
    @Autowired
    private NavbarMenuService navbarMenuService;

    /**
     * 展示菜单列表
     */
    @ResponseBody
    @RequestMapping("/list")
    public List<NavbarMenu> list(@RequestParam Map<String,Object> params){
        Query query = new Query(params);
        List<NavbarMenu> navbarMenuList = navbarMenuService.list(query);
        int total = navbarMenuService.count(query);
        PageUtils pageUtils = new PageUtils(total,navbarMenuList);
        return navbarMenuList;
    }
    /**
     * 分级别展示菜单列表
     */
    @ResponseBody
    @RequestMapping("/listByLevel")
    public List<NavbarMenu> listByLevel(){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("type",1);
        params.put("offset",0);
        params.put("limit",100);
        Query query = new Query(params);
        List<NavbarMenu> navbarMenuList = navbarMenuService.list(query);
        for(NavbarMenu navbarMenu:navbarMenuList){
            params.put("type",2);
            params.put("parentId",navbarMenu.getMenuId());
            Query query2 = new Query(params);
            navbarMenu.setChildrens(navbarMenuService.list(query2));
        }
        return navbarMenuList;
    }

    /**
     * 保存
     */
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public R save(@RequestBody  NavbarMenu navbarMenu) {
        if(navbarMenuService.save(navbarMenu)>0){
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    public R update(@RequestBody NavbarMenu navbarMenu){
        navbarMenuService.update(navbarMenu);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/remove")
    @ResponseBody
    public R remove(long menuId){
        if(navbarMenuService.remove(menuId)>0){
            return R.ok();
        }
        return R.error();
    }

    /**
     * 批量删除
     */
    @RequestMapping("/batchRemove")
    @ResponseBody
    public R remove(@RequestParam("ids[]") long[] menuIds){
        navbarMenuService.batchRemove(menuIds);
        return R.ok();
    }
}
