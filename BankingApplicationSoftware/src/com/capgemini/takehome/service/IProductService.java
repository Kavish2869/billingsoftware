package com.capgemini.takehome.service;

import com.capgemini.takehoam.bean.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;

public interface IProductService {
Product calculateLineTotal(int productId,int quantity) throws InvalidProductCodeException ;




}
