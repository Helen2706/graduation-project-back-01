package com.luhuiling.graduation.controller;

import com.luhuiling.graduation.dao.BasicSettingDao;
import com.luhuiling.graduation.po.BasicSetting;
import com.luhuiling.graduation.po.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic_setting")
public class BasicSettingController {
    @Autowired
    private BasicSettingDao basicSettingDao;

    @RequestMapping("/getOne")
    public BasicSetting getTheOnlyOne(){
        return basicSettingDao.getTheOnlyOne();
    }

    @RequestMapping("/save")
    public R save(@RequestBody BasicSetting basicSetting){
        if(basicSettingDao.save(basicSetting)>0){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody BasicSetting basicSetting){
        if(basicSettingDao.update(basicSetting)>0){
            return R.ok();
        }
        return R.error();
    }

}
