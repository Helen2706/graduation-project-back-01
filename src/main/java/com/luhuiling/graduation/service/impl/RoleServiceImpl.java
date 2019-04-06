package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.po.RoleDO;
import com.luhuiling.graduation.dao.RoleDao;
import com.luhuiling.graduation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;

    @Override
    public RoleDO get(Long id){
        return roleDao.get(id);
    }

    @Override
    public List<RoleDO> list(Map<String, Object> map){
        return roleDao.list(map);
    }

    @Override
    public int count(Map<String,Object> map){
        return roleDao.count(map);
    }

    @Override
    public int save(RoleDO role){
        return roleDao.save(role);
    }

    @Override
    public int update(RoleDO role){
        return roleDao.update(role);
    }

    @Override
    public int remove(Long id){
        return roleDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids){
        return roleDao.batchRemove(ids);
    }

}