package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.po.SystemMenuDO;
import com.luhuiling.graduation.dao.SystemMenuDao;
import com.luhuiling.graduation.service.SystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SystemMenuServiceImpl implements SystemMenuService {
    @Autowired
    SystemMenuDao systemMenuDao;

    @Override
    public SystemMenuDO get(Integer id){
        return systemMenuDao.get(id);
    }

    @Override
    public List<SystemMenuDO> list(Map<String, Object> map){
        return systemMenuDao.list(map);
    }

    @Override
    public int count(Map<String,Object> map){
        return systemMenuDao.count(map);
    }

    @Override
    public int save(SystemMenuDO systemMenu){
        return systemMenuDao.save(systemMenu);
    }

    @Override
    public int update(SystemMenuDO systemMenu){
        return systemMenuDao.update(systemMenu);
    }

    @Override
    public int remove(Integer id){
        return systemMenuDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids){
        return systemMenuDao.batchRemove(ids);
    }

}