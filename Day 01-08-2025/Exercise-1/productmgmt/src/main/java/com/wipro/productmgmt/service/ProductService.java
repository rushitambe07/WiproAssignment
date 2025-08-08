package com.wipro.productmgmt.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.wipro.productmgmt.entity.Product;

public interface ProductService {
	
	void save(Product product);
	List<Product> findAll();
	Product findById(int id);
	void deleteById(int id);
	
    List<Product> findByProductMake(String productMake);

    List<Product> findByProductNameAndProductMakeSorted(String productName, String productMake);

    Page<Product> getAllProducts(Pageable pageable);
}
