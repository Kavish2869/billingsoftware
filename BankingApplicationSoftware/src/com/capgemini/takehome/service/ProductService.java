package com.capgemini.takehome.service;

import com.capgemini.takehoam.bean.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductService implements IProductService {

	@Override
	public Product calculateLineTotal(int productId,int quantity) throws InvalidProductCodeException {
		if(productId>999 && productId<10000){
			Product product=CollectionUtil.products.get(productId);
			if(product!=null){
				int lineTotal=quantity*(product.getProductPrice());
			product.setLineTotal(lineTotal);
			return product;
			}
			else
				throw new InvalidProductCodeException("Product ID Not Found!!!");
		}
		else
			throw new InvalidProductCodeException("Invalid Product ID Range!!!");
	}

	

}
