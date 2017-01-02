package com.niit.shopping;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.modal.Category;
import com.niit.modal.Product;
import com.niit.modal.Supplier;
import com.niit.service.CategoryDAO;
import com.niit.service.ProductDAO;
import com.niit.service.SupplierDAO;
@Controller
public class ProductController {
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("getproduct")
	 public ModelAndView getItem()
	 {
		List<Category> categoryList = categoryDAO.getAllCategory();
		List<Supplier> supplierList = supplierDAO.getAllSupplier();
		
		ModelAndView mv=new ModelAndView("AddProduct");
		mv.addObject("categoryList", categoryList);
		mv.addObject("supplierList", supplierList);

		return mv;
	 }
	
	
	
/*@RequestMapping("getproduct")
 public String getproduct()
 {
	return "AddProduct";
 }*/
@RequestMapping("deleteproduct/{id}")
public String deleteProduct(@PathVariable ("id") int id) {
	productDAO.deleteProduct(id);
	return "redirect:/viewproduct";
}


@RequestMapping(value="newProduct" , method=RequestMethod.POST)
public ModelAndView newProduct(@ModelAttribute Product product,@RequestParam("file") MultipartFile file)
{
	
	productDAO.insertProduct(product);
	String path = "E://project/shopping/src/main/webapp/WEB-INF/resources/productImages/";
	FileUtil.upload(path, file, product.getId()+".jpg");

	ModelAndView mv = new ModelAndView("AddProduct");
	return mv;
}

@RequestMapping("viewproduct")
public ModelAndView viewproduct()
{
	ModelAndView mv = new ModelAndView("ViewProduct");
	
	return mv;
}
@RequestMapping("viewproductlist")
public @ResponseBody String viewproducts()
{
	List<Product> listProduct = productDAO.getAllProduct();
	Gson gs= new Gson();
	String result=gs.toJson(listProduct);
	System.out.print(result);
	return result;
}

@RequestMapping("getproductimg/{id}")
public ModelAndView getproductimg(@PathVariable ("id") int id){
	Product product = productDAO.getProduct(id);
	ModelAndView mv=new ModelAndView("productimg");
	mv.addObject("p", product);
	System.out.println("display image");
	return mv;
}
@RequestMapping(value="editproduct/{id}")
public ModelAndView editproduct(@PathVariable("id") int id, Model model){
	product = productDAO.getProduct(id);
	//model.
	model.addAttribute("product", product);
	return new ModelAndView("Editproduct");
}


@RequestMapping(value="UpdateProduct", method=RequestMethod.POST)
 public ModelAndView updateproduct(@ModelAttribute Product product)
 {
	
	productDAO.updateProduct(product);
	ModelAndView mv = new ModelAndView("ViewProduct");
	return mv;
	
 }

}

