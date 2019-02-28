package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.po.NotificationDO;
import com.luhuiling.graduation.dao.NotificationDao;
import com.luhuiling.graduation.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    NotificationDao notificationDao;

    @Override
    public NotificationDO get(Long id){
        return notificationDao.get(id);
    }

    @Override
    public List<NotificationDO> list(Map<String, Object> map){
        return notificationDao.list(map);
    }

    @Override
    public int count(Map<String,Object> map){
        return notificationDao.count(map);
    }

    @Override
    public int save(NotificationDO notification){
        return notificationDao.save(notification);
    }

    @Override
    public int update(NotificationDO notification){
        return notificationDao.update(notification);
    }

    @Override
    public int remove(Long id){
        return notificationDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids){
        return notificationDao.batchRemove(ids);
    }

}