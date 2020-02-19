package com.dy.gmall.oms.dao;

import com.dy.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:19:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
