package com.dy.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:32:50
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

