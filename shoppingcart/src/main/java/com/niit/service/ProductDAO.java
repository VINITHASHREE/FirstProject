package com.niit.service;

import java.util.List;

import com.niit.modal.Product;

public interface ProductDAO {
	
	 public List<Product> getAllProduct();
	   public Product getProduct(int id);
	   public void insertProduct(Product product);
	   public void updateProduct(Product product);
	   public void deleteProduct(int id);
	   public void deleteAllProduct(Product product);

}
