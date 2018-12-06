package com.aaa.shop.sellergoods.service.impl;
import java.util.List;
import com.aaa.shop.entity.TbBrand;
import com.aaa.shop.mapper.TbBrandMapper;
import com.aaa.shop.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAll() {

		return brandMapper.selectByExample(null);
	}

}
