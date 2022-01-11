package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author 
 * @email 
 * @date 2022-01-11 20:39:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
