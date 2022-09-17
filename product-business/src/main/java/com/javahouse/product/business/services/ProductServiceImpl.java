package com.javahouse.product.business.services;

import com.javahouse.product.core.entities.Product;
import com.javahouse.product.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
  @Autowired
  private ProductRepository repository;

  //@Autowired
  //private InMemoryDB db;

  @Override
  public List<Product> productList()
  {
    return repository.findAll();
  }

  @Override
  public Product addNewProduct(Product product)
  {
    return repository.save(product);
  }
}
