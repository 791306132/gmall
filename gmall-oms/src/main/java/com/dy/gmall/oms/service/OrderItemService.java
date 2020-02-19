package com.dy.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.oms.entity.OrderItemEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 订单项信息
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:19:52
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageVo queryPage(QueryCondition params);
}

