package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.po.News;
import com.luhuiling.graduation.po.utils.Query;
import com.luhuiling.graduation.po.utils.R;
import com.luhuiling.graduation.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/get")
    public News get(int id){
        return newsService.get(id);
    }

    @RequestMapping("/list")
    public List<News> list(@RequestParam Map<String,Object> params){
        Query query = new Query(params);
        return newsService.list(query);
    }

    @RequestMapping("/save")
    public R save(@RequestBody News news){
        news.setCreateTime(new Date());
        if(newsService.save(news)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody News news){
        news.setModifiedTime(new Date());
        if(newsService.update(news)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/remove")
    public R remove(int id){
        if(newsService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    public R remove(@RequestParam("ids[]") int[] ids){
        newsService.batchRemove(ids);
        return R.ok();
    }
}
