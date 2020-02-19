package com.dy.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.Query;
import com.dy.core.bean.QueryCondition;

import com.dy.gmall.sms.dao.CategoryBoundsDao;
import com.dy.gmall.sms.entity.CategoryBoundsEntity;
import com.dy.gmall.sms.service.CategoryBoundsService;


@Service("categoryBoundsService")
public class CategoryBoundsServiceImpl extends ServiceImpl<CategoryBoundsDao, CategoryBoundsEntity> implements CategoryBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CategoryBoundsEntity> page = this.page(
                new Query<CategoryBoundsEntity>().getPage(params),
                new QueryWrapper<CategoryBoundsEntity>()
        );

        return new PageVo(page);
    }

}