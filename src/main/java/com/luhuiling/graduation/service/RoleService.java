package com.luhuiling.graduation.service;

import com.luhuiling.graduation.po.RoleDO;
import java.util.List;
import java.util.Map;

/**
 * 角色
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-04-06 19:45:31
 */

public interface RoleService {

    RoleDO get(Long id);

    List<RoleDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(RoleDO role);

    int update(RoleDO role);

    int remove(Long id);

    int batchRemove(Long[] ids);

}