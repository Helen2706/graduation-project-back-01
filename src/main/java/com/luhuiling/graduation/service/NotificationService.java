package com.luhuiling.graduation.service;

import com.luhuiling.graduation.po.NotificationDO;
import java.util.List;
import java.util.Map;

/**
 * 通知
 * @author luhuiling
 * @email 15652612973@163.com
 * @date 2019-02-27 19:28:26
 */

public interface NotificationService {

    NotificationDO get(Long id);

    List<NotificationDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(NotificationDO notification);

    int update(NotificationDO notification);

    int remove(Long id);

    int batchRemove(Long[] ids);

}