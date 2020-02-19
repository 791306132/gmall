package com.dy.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.Query;
import com.dy.core.bean.QueryCondition;

import com.dy.gmall.pms.dao.BrandDao;
import com.dy.gmall.pms.entity.BrandEntity;
import com.dy.gmall.pms.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageVo(page);
    }

}