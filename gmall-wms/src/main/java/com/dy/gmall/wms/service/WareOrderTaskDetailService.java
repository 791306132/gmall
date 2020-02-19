package com.dy.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.wms.entity.WareOrderTaskDetailEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:42:27
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

