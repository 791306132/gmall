package com.dy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.pms.entity.CommentReplayEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-18 16:46:28
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

