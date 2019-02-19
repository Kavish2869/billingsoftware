package com.capgemini.takehome.dao;

import java.util.List;

import com.capgemini.takehoam.bean.Product;

public interface IProductDAO {
	Product getProductDetails(int productCode);
	Product save(Product product);
	boolean update(Product product);
	Product findOne(int productId);
	List<Product > findAll();
}

