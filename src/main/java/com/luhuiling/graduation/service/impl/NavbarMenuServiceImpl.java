package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.dao.NavbarMenuDao;
import com.luhuiling.graduation.po.NavbarMenu;
import com.luhuiling.graduation.service.NavbarMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NavbarMenuServiceImpl implements NavbarMenuService {
    @Autowired
    NavbarMenuDao navbarMenuDao;

    @Override
    public NavbarMenu get(long id) {
        return navbarMenuDao.get(id);
    }

    @Override
    public List<NavbarMenu> list(Map<String, Object> map) {
        return navbarMenuDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return navbarMenuDao.count(map);
    }

    @Override
    public int save(NavbarMenu navbarMenu) {
        return navbarMenuDao.save(navbarMenu);
    }

    @Override
    public int update(NavbarMenu navbarMenu) {
        return navbarMenuDao.update(navbarMenu);
    }

    @Override
    public int remove(long menu_id) {
        return navbarMenuDao.remove(menu_id);
    }

    @Override
    public int batchRemove(long[] menuIds) {
        return navbarMenuDao.batchRemove(menuIds);
    }
}
