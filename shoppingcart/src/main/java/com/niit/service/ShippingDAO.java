package com.niit.service;

import java.util.List;

import com.niit.modal.Shipping;

public interface ShippingDAO {
	public List<Shipping> getAllShipping();

	public Shipping getShipping(int shippingid);

	public void updateShipping(Shipping shipping);

	public void deleteShipping(int id);

	public void deleteAllShipping(Shipping shipping);

	public void insertShipping(Shipping shipping);

}
