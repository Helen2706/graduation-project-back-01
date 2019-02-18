package com.luhuiling.graduation.dao;

import com.luhuiling.graduation.po.NavbarMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NavbarMenuDao {
    NavbarMenu get(long id);

    List<NavbarMenu> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(NavbarMenu navbarMenu);

    int update(NavbarMenu navbarMenu);

    int remove(long menu_id);//menuId

    int batchRemove(long[] menuIds);
}
