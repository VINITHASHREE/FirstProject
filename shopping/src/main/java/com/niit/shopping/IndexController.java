
package com.niit.shopping;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.modal.Product;
import com.niit.service.ProductDAO;

@Controller
public class IndexController {

	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	
	@RequestMapping("/")
	public ModelAndView gethomepage(Principal p){
		//String name = p.getName();
		ModelAndView mv = new ModelAndView("index");
		List <Product> listProduct = productDAO.getAllProduct();
		//mv.addObject("name", name);
		mv.addObject("listProduct", listProduct);
		System.out.println(listProduct);
		
		return mv;
	}
	@RequestMapping("/home")
	public String gethome(Principal p){
		/*//String name = p.getName();
		ModelAndView mv = new ModelAndView("index");
		List <Product> listProduct = productDAO.getAllProduct();
		//mv.addObject("name", name);
		mv.addObject("listProduct", listProduct);
		System.out.println(listProduct);
		
		return mv;*/
		return "redirect:/";
		
	}
	
	
}
