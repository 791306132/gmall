package com.dy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.sms.entity.CouponEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:02:23
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

