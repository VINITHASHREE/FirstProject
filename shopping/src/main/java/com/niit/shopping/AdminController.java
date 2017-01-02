package com.niit.shopping;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.modal.Product;
import com.niit.modal.Supplier;
import com.niit.service.ProductDAO;
import com.niit.service.SupplierDAO;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	SupplierDAO supplierDAO;

	@RequestMapping
	public ModelAndView getadmin(Principal p){
		String name=p.getName();
		ModelAndView mv = new ModelAndView("AdminHome");
		mv.addObject("name", name);
		return mv;
	}
	
}
