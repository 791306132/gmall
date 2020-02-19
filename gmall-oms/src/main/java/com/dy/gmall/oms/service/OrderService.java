package com.dy.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.oms.entity.OrderEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:19:52
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

