package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.request.ProductRequest;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;
	
	public Product createproduct(ProductRequest productrequest )
	{
		
		Product product =new Product();
		product.setName(productrequest.getName());
		product.setCategory(productrequest.getCategory());
		product.setPrice(productrequest.getPrice());
		product.setDescription(productrequest.getDescription());
		
		return productrepository.save(product);
		
		
	}
	
	public Product searchProduct(String name) {
        return productrepository.findByName(name);
    }
	
	

}
