package com.dy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.sms.entity.HomeSubjectSpuEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 专题商品
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:02:23
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

