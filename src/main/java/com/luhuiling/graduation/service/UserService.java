package com.luhuiling.graduation.service;

import com.luhuiling.graduation.po.UserDO;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-04-04 14:08:58
 */

public interface UserService {

    UserDO get(Long userId);

    UserDO getByName(String username);

    List<UserDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(UserDO user);

    int update(UserDO user);

    int remove(Long userId);

    int batchRemove(Long[] userIds);

}