package com.thienpcpc00879_MiniProject.service;

import java.util.List;

import com.thienpcpc00879_MiniProject.Entity.Product;



public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	

}
