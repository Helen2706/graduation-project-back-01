package com.luhuiling.graduation.service;

import com.luhuiling.graduation.po.News;

import java.util.List;
import java.util.Map;

public interface NewsService {
    News get(int id);

    List<News> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(News news);

    int update(News news);

    int remove(int id);

    int batchRemove(int[] ids);
}
