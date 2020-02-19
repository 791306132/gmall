package com.dy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.pms.entity.BrandEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-18 16:46:28
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

