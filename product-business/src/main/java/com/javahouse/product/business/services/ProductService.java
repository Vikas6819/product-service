package com.javahouse.product.business.services;

import com.javahouse.product.core.entities.Product;

import java.util.List;

public interface ProductService
{
  List<Product> productList();
  Product addNewProduct(Product product);
}
