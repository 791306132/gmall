package com.dy.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.sms.entity.HomeSubjectEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:02:23
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

