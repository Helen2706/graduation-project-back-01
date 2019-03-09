package com.luhuiling.graduation.service;

import com.luhuiling.graduation.po.SystemMenuDO;
import java.util.List;
import java.util.Map;

/**
 * 系统菜单
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-03-04 14:20:16
 */

public interface SystemMenuService {

    SystemMenuDO get(Integer id);

    List<SystemMenuDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(SystemMenuDO systemMenu);

    int update(SystemMenuDO systemMenu);

    int remove(Integer id);

    int batchRemove(Integer[] ids);

}