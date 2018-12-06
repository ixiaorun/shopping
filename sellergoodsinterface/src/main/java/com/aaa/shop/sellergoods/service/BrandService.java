package com.aaa.shop.sellergoods.service;


import com.aaa.shop.entity.TbBrand;

import java.util.List;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	List<TbBrand> findAll();
	
}
