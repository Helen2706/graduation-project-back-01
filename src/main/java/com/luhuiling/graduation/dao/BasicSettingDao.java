package com.luhuiling.graduation.dao;

import com.luhuiling.graduation.po.BasicSetting;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BasicSettingDao {
        BasicSetting getTheOnlyOne();

        int save(BasicSetting basicSetting);

        int update(BasicSetting basicSetting);


}
