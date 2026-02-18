package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Product;
import com.ecommerce.request.ProductRequest;
import com.ecommerce.service.ProductService;
@RestController
@RequestMapping("/products")

public class ProductController {
	
	@Autowired
	ProductService productservice;

    // CREATE PRODUCT
    @PostMapping
    public Product createProduct(@RequestBody ProductRequest request) {
        return productservice.createproduct(request);
    }

    // SEARCH PRODUCT
    @GetMapping("/search")
    public Product searchProduct(@RequestParam("name") String name) {
        return productservice.searchProduct(name);
    }


}
