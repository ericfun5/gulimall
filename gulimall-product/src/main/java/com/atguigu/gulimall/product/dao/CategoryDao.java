package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 
 * @email 
 * @date 2022-01-10 23:43:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
