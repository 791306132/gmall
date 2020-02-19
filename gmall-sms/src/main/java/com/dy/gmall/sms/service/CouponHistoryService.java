package com.dy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.sms.entity.CouponHistoryEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 优惠券领取历史记录
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:02:23
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

