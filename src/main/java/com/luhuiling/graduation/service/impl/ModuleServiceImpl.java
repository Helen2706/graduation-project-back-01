package com.luhuiling.graduation.service.impl;

import com.luhuiling.graduation.dao.ModuleDao;
import com.luhuiling.graduation.po.utils.GenUtils;
import com.luhuiling.graduation.service.ModuleService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    ModuleDao moduleDao;

    @Override
    public byte[] generatorCode(String tableName) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);

        //查询表信息
        Map<String, String> table = moduleDao.get(tableName);
        //查询列信息
        List<Map<String, String>> columns = moduleDao.listColumns(tableName);
        //生成代码
        GenUtils.generatorCode(table, columns, zip);

        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }
}
