package com.javahouse.product.core.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class Product
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productId;
  private String productName;
  private String productAmount;

  public Long getProductId()
  {
    return productId;
  }

  public void setProductId(Long productId)
  {
    this.productId = productId;
  }

  public String getProductName()
  {
    return productName;
  }

  public void setProductName(String productName)
  {
    this.productName = productName;
  }

  public String getProductAmount()
  {
    return productAmount;
  }

  public void setProductAmount(String productAmount)
  {
    this.productAmount = productAmount;
  }

}
