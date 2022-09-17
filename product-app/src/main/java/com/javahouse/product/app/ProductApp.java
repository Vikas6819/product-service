package com.javahouse.product.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.javahouse.product")
@EnableJpaRepositories(basePackages = "com.javahouse.product")
@EntityScan("com.javahouse.product.core.entities")
public class ProductApp
{
  public static void main(String[] args)
  {
    SpringApplication.run(ProductApp.class, args);
  }
}
