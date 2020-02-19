package com.dy.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.oms.entity.OrderReturnReasonEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 退货原因
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:19:52
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageVo queryPage(QueryCondition params);
}

