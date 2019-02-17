package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.dao.NavbarMenuDao;
import com.luhuiling.graduation.po.NavbarMenu;
import com.luhuiling.graduation.service.NavbarMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavbarMenuServiceImpl implements NavbarMenuService {
    @Autowired
    NavbarMenuDao navbarMenuDao;

    @Override
    public NavbarMenu get(long id) {
        return navbarMenuDao.get(id);
    }
}
