package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.modal.Card;
import com.niit.modal.Cart;
import com.niit.modal.Category;
import com.niit.modal.Product;
import com.niit.modal.Role;
import com.niit.modal.Shipping;
import com.niit.modal.Supplier;
import com.niit.modal.User;
import com.niit.service.CardDAO;
import com.niit.service.CartDAO;
import com.niit.service.CategoryDAO;
import com.niit.service.ProductDAO;
import com.niit.service.RoleDAO;
import com.niit.service.ShippingDAO;
import com.niit.service.SupplierDAO;
import com.niit.service.UserDAO;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("system.....");
		
	    UserDAO userDAO=(UserDAO) context.getBean("UserDAO");
		User user=(User) context.getBean("user");
		
		
		user.setUn("vinitha");
		user.setEm("vinithashreeprabhakaran@gmail.com");
		user.setPassword("shree");
		user.setMm(9585);
		user.setAddress("Thennampalayam");
 
		userDAO.insertUser(user);

		
		 ProductDAO productDAO=(ProductDAO) context.getBean("ProductDAO");
		 Product product=(Product) context.getBean("product");
			
		 
		 product.setPn("kurtis") ; 
		 product.setDescription("cotton,synthetic kurtis");
		 product.setQuantity(10);
		 product.setPrice(700); 
		 product.setCn("clothing");
		 product.setSn("maruthi");
		 product.setSize(38); 	
		 
		 productDAO.insertProduct(product);

	
	
		/* CategoryDAO categoryDAO=(CategoryDAO) context.getBean("CategoryDAO");
		 Category category=(Category) context.getBean("category");
		 
		 category.setCategoryName("clothing");
		 category.setCategoryDesc("all types of clothes");
		 
		 categoryDAO.insertCategory(category);
		 
	
	
		 SupplierDAO supplierDAO=(SupplierDAO) context.getBean("SupplierDAO");
		 Supplier supplier=(Supplier) context.getBean("supplier");
		 
		 
		 supplier.setSN("Supriga");
		 supplier.setEM("suprigavivek03@gmail.com");
		 supplier.setAddr("Peelamedu");
		 supplier.setMn(956642);
		 
		 supplierDAO.insertSupplier(supplier);
		 
		 
		 CartDAO cartDAO=(CartDAO) context.getBean("CartDAO");
		 Cart cart=(Cart) context.getBean("cart");

		 cart.setUserId(1);
		 cart.setProductId(1);
		 cart.setQuantity(1);
		 cart.setPrice(300) ; 
			
		 cartDAO.insertCart(cart);*/
		 
		
		 ShippingDAO shippingDAO=(ShippingDAO) context.getBean("ShippingDAO");
		 Shipping shipping=(Shipping) context.getBean("shipping");
		 
		 
		  shipping.setUsername("vini") ;
		  shipping.setAddress("Thennampalayam");
		  shipping.setPrice(300) ; 
		  shipping.setEmailid("vini@gmail.com");
		  shipping.setCity("Cbe");
		  shipping.setMobilenumber(958538);
		  shipping.setZipcode(641407);
		  
		  
		
		  shippingDAO.insertShipping(shipping);
		  
		  
		  
		 
		RoleDAO roleDAO=(RoleDAO) context.getBean("RoleDAO");
		Role role=(Role) context.getBean("role");
		  
	
		role.setRole("user");
		role.setUn("vinitha");
		role.setEnabled(true);
		role.setPassword("shree");
		
		 

		  role.setUser(user);
		
	/*User user1 = userDAO.getUser("shree");*/
	/*System.out.println(user1.getUn());
	*/
		  
		  
		  
		  
//		  roleDAO.insertRole(role);
			
		  
		 /* CardDAO cardDAO=(CardDAO) context.getBean("CardDAO");
		  Card card=(Card) context.getBean("card");
		  
		  
		  card.setCardHolderName("vinithashree");
		  card.setCardNumber(1);
		  card.setcvvnumber(1);
		  card.setCardType("credit") ; 
		  
		  
		  cardDAO.insertCard(card);*/	 
		 
		 
		
}
}
