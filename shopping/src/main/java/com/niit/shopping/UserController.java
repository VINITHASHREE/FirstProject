package com.niit.shopping;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.modal.Role;
import com.niit.modal.User;
import com.niit.service.RoleDAO;
import com.niit.service.UserDAO;

@Controller

public class UserController {

	@Autowired
	private User user;

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private Role role;

	@Autowired
	private RoleDAO roleDAO;

	@RequestMapping("getlogin")
	public String getlogin(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		System.out.println("inside get login");
		if (error != null) {
			model.addAttribute("error", "Invalid credentials");
		}

		if (logout != null) {
			model.addAttribute("logout", "Logged out successfully");

		}
		return "login";
	}

	@RequestMapping("getRegister")
	public ModelAndView getregister() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@RequestMapping("newUser")
	public ModelAndView newUser(@ModelAttribute("user") User user, @RequestParam("password") String password,
			@RequestParam("un") String un) {
		role.setRole("ROLE_USER");
		role.setUn(un);
		role.setEnabled(true);
		// role.setRoleid(1);
		role.setPassword(password);
		role.setUser(user);

		user.setEnabled(true);
		String message = null;

		System.out.println(user.getUn());
		System.out.println(user.getMm());
		System.out.println(user.getEm());
		System.out.println(user.getAddress());
		userDAO.insertUser(user);
		roleDAO.insertRole(role);
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("Registered successfully", message);
		return mv;

	}

	@RequestMapping(value = "/afterlogin")
	public String login(Principal p) {
		String message = null;
		Role role = roleDAO.getRole(p.getName());
		System.out.println(role.getRole());
		if (role.getRole().equals("ROLE_USER")) {
			message = "redirect:/user";
		} else {
			message = "redirect:/admin";
		}

		System.out.println("inside security");
		return message;

	}

}
