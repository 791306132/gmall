package com.dy.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.Query;
import com.dy.core.bean.QueryCondition;

import com.dy.gmall.sms.dao.HomeAdvDao;
import com.dy.gmall.sms.entity.HomeAdvEntity;
import com.dy.gmall.sms.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeAdvEntity> page = this.page(
                new Query<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageVo(page);
    }

}