package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 
 * @email 
 * @date 2022-01-11 20:39:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
