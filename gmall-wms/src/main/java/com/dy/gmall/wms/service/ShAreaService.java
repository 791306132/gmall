package com.dy.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.wms.entity.ShAreaEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:42:27
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

