package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.dao.NewsDao;
import com.luhuiling.graduation.po.News;
import com.luhuiling.graduation.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public News get(int id) {
        return newsDao.get(id);
    }

    @Override
    public List<News> list(Map<String, Object> map) {
        return newsDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return newsDao.count(map);
    }

    @Override
    public int save(News news) {
        return newsDao.save(news);
    }

    @Override
    public int update(News news) {
        return newsDao.update(news);
    }

    @Override
    public int remove(int id) {
        return newsDao.remove(id);
    }

    @Override
    public int batchRemove(int[] ids) {
        return newsDao.batchRemove(ids);
    }
}
