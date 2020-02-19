package com.dy.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.ums.entity.MemberReceiveAddressEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 会员收货地址
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:32:50
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageVo queryPage(QueryCondition params);
}

