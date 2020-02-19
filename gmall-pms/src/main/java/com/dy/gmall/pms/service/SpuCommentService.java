package com.dy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.pms.entity.SpuCommentEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-18 16:46:28
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

