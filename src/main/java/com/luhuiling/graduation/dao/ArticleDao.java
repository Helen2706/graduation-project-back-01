package com.luhuiling.graduation.dao;

import com.luhuiling.graduation.po.Article;

import java.util.List;

public interface ArticleDao {
    public Article getArticleById(int id);
    public List<Article> getAllArticles();
}
