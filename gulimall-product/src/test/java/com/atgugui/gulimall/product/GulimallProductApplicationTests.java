package com.atgugui.gulimall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;

@SpringBootTest(classes=GulimallProductApplication.class)
//@Context("classpath:application.yml")
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		
		BrandEntity entity = new BrandEntity();
		entity.setBrandId(1L);
		entity.setName("HTC");
		entity.setDescript("");
		brandService.save(entity);
		System.out.println("Success");
	}

}
