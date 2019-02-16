package com.luhuiling.graduation.service;

import com.luhuiling.graduation.dao.ArticleDao;
import com.luhuiling.graduation.po.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleService {
    @Autowired
    ArticleDao articleDao;

    public Article getArticleById(int id){
        return articleDao.getArticleById(id);
    }
}
