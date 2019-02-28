package com.luhuiling.graduation.service;

import org.springframework.stereotype.Service;

@Service
public interface ModuleService {
    /*根据表名生成代码*/
    byte[] generatorCode(String tableName);
}
