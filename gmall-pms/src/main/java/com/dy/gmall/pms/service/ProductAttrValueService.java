package com.dy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.pms.entity.ProductAttrValueEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-18 16:46:28
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

