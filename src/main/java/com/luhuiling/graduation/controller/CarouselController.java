package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.dao.CarouselDao;
import com.luhuiling.graduation.po.Carousel;
import com.luhuiling.graduation.po.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private CarouselDao carouselDao;

    /*展示轮播图列表*/
    @RequestMapping("/list")
    public List<Carousel> list(){
        List<Carousel> carouselList = carouselDao.list();
        return carouselList;
    }

    @RequestMapping("/save")
    public R save(@RequestBody Carousel carousel){
        if(carouselDao.save(carousel)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody Carousel carousel){
        if(carouselDao.update(carousel)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/remove")
    public R remove(int id){
        if(carouselDao.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/batchRemove")
    public R batchRemove(@RequestParam("ids[]") int[] ids){
        if(carouselDao.batchRemove(ids)>0){
            return R.ok();
        }
        return R.error();
    }
}
