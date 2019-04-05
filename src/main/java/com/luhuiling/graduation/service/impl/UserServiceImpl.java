package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.po.UserDO;
import com.luhuiling.graduation.dao.UserDao;
import com.luhuiling.graduation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public UserDO get(Long userId){
        return userDao.get(userId);
    }

    @Override
    public UserDO getByName(String username) {
        return userDao.getByName(username);
    }

    @Override
    public List<UserDO> list(Map<String, Object> map){
        return userDao.list(map);
    }

    @Override
    public int count(Map<String,Object> map){
        return userDao.count(map);
    }

    @Override
    public int save(UserDO user){
        return userDao.save(user);
    }

    @Override
    public int update(UserDO user){
        return userDao.update(user);
    }

    @Override
    public int remove(Long userId){
        return userDao.remove(userId);
    }

    @Override
    public int batchRemove(Long[] userIds){
        return userDao.batchRemove(userIds);
    }

}