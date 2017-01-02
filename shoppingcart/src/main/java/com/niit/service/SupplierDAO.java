package com.niit.service;

import java.util.List;

import com.niit.modal.Supplier;



public interface SupplierDAO {

	 public List<Supplier> getAllSupplier();
	   public Supplier getSupplier(int supplierid);
	   public void insertSupplier(Supplier supplier);
	   public void updateSupplier(Supplier supplier);
	   public void deleteSupplier(int id);
	   public void deleteAllSupplier(Supplier supplier);

}
