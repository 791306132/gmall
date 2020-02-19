package com.dy.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.wms.entity.FeightTemplateEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:42:27
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

