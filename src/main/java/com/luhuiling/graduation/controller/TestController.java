package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.dao.ArticleDao;
import com.luhuiling.graduation.po.Article;
import com.luhuiling.graduation.po.Person;
import com.luhuiling.graduation.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/test")
    @ResponseBody
    public Person getPerson(){
        Person person = new Person("路慧玲",25);
        return person;
    }

    @RequestMapping("/article")
    @ResponseBody
    public Article getArticle(){
        Article article = articleService.getArticleById(1);
        return article;
    }
}
