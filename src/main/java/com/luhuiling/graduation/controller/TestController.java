package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.Article;
import com.luhuiling.graduation.po.NavbarMenu;
import com.luhuiling.graduation.po.Person;
import com.luhuiling.graduation.service.ArticleService;
import com.luhuiling.graduation.service.NavbarMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    ArticleService articleService;
    @Autowired
    NavbarMenuService navbarMenuService;

    @RequestMapping("/test")
    @ResponseBody
    public Person getPerson(){
        Person person = new Person("路慧玲",25);
        return person;
    }

    @RequestMapping("/article")
    @ResponseBody
    public Article getArticle(){
        Article article = articleService.getArticleById(5);
        return article;
    }

    @RequestMapping("/all/article")
    @ResponseBody
    public List<Article> getAllArticle(){
        List<Article> articles = articleService.getAllArticle();
        return articles;
    }

    @RequestMapping("/navbar")
    @ResponseBody
    public NavbarMenu getavbarMenu(){
        return navbarMenuService.get(1);
    }
}
