package com.dy.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.gmall.ums.entity.MemberEntity;
import com.dy.core.bean.PageVo;
import com.dy.core.bean.QueryCondition;


/**
 * 会员
 *
 * @author liuzhiwei
 * @email 791306132@qq.com
 * @date 2020-02-19 11:32:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageVo queryPage(QueryCondition params);
}

