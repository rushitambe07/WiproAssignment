package com.wipro.productmgmt.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.service.ProductService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Product", description = "Product management APIs")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@Operation(summary = "Save a product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })
	@PostMapping
	void save(@RequestBody Product product) {
		productService.save(product);
	}

	@GetMapping
	List<Product> findAll() {
		return productService.findAll();
	}

	@GetMapping("/{id}")
	Product findById(@PathVariable int id) {
		return productService.findById(id);
	}


	@PutMapping 
	void update(@RequestBody Product product)
	{
		  productService.save(product);
		
	}


	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id) {
		productService.deleteById(id);
	}
	
	@GetMapping("/make/{productMake}")
    public List<Product> getByProductMake(@PathVariable String productMake) {
        return productService.findByProductMake(productMake);
    }
	
	@GetMapping("/search/{productName}/{productMake}")
	public List<Product> searchByNameAndMakeSorted(@RequestParam String productName,@RequestParam String productMake
	) {
	    return productService.findByProductNameAndProductMakeSorted(productName, productMake);
	}
	
	 // ✅ Pagination and Sort by productPrice
	@GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
	public Page<Product> findAllPage(
	        @PathVariable int pageNum,
	        @PathVariable int pageSize,
	        @PathVariable int sortOrder) {

	    Pageable pageable;

	    if (sortOrder == 0) {
	    	pageable = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").descending());
	    } else {
	    	pageable = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").ascending());
	    }
	    return productService.getAllProducts(pageable);


	}



}
