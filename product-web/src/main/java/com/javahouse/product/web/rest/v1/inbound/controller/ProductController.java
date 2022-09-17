package com.javahouse.product.web.rest.v1.inbound.controller;

import com.javahouse.product.business.services.ProductService;
import com.javahouse.product.core.annotations.V1Api;
import com.javahouse.product.core.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@V1Api
public class ProductController
{
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> productList()
    {
      return service.productList();
    }

    @PostMapping("/add/product")
    public Product addProduct(@RequestBody Product product)
    {
        return service.addNewProduct(product);
    }
}
