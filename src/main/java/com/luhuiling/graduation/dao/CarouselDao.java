package com.luhuiling.graduation.dao;

import com.luhuiling.graduation.po.Carousel;

import java.util.List;

public interface CarouselDao {

    Carousel get(int id);

    List<Carousel> list();

    int save(Carousel carousel);

    int update(Carousel carousel);

    int remove(int id);

    int batchRemove(int[] ids);
}
