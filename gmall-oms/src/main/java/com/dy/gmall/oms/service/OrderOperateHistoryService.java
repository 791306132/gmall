package com.dy.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.oms.entity.OrderOperateHistoryEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 订单操作历史记录
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:19:52
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

