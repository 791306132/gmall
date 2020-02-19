package com.dy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.pms.entity.SkuImagesEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-18 16:46:28
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

