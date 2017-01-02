package com.niit.shopping;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.modal.Product;
import com.niit.modal.User;
import com.niit.service.ProductDAO;
import com.niit.service.UserDAO;

@Controller
@RequestMapping("/user")
public class HomeController {

	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	
	@RequestMapping
	public ModelAndView getuserhome(Principal p){
		String name=p.getName();
		List<Product> listProduct = productDAO.getAllProduct();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listProduct", listProduct);
		mv.addObject("name", name);
		return mv;
	}
	
	
	
}
