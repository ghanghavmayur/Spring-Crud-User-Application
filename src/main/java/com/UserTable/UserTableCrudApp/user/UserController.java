package com.UserTable.UserTableCrudApp.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UserController {
	@Autowired private UserService service;
	
	@GetMapping("/users")
	public String showUserList(Model model) {
		List<User> listUsers = service.listAll();
		model.addAttribute("listUsers",listUsers);
		
		return "users";
	}
	
	@GetMapping("/users/new")
	public String showNewForm(Model model) {
		model.addAttribute("User",new User());
		model.addAttribute("pageTitle","Add New User");
		System.err.println("new Form");
		return "adduser_form";
	}
	
//	@PostMapping("/users/save")
//	public String  saveUser( User user,RedirectAttributes ra) {
//		service.save(user);
//		ra.addFlashAttribute("message","The suer has been saved successfully");
//		System.err.println("saved");
//		return "redirect:/users"; 
//	}
	
	@PostMapping("/users/save")
	public String saveUser(@ModelAttribute("user") User user) {
	    // No need to handle the checkbox value manually, Spring will bind it to the boolean field
	    service.save(user);
	    System.err.println("saved");
	    return "redirect:/users";
	}

	
	@GetMapping("/users/edit/{id}")
	public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra){
		try {
			User user = service.get(id);
			model.addAttribute("user", user);
			model.addAttribute("pageTitle","Edit User(ID:" + id + ")");
			System.err.println("updating form");
			return "updating_form";
		}catch (UserNotFoundException e) {
			ra.addFlashAttribute("message","The user has been saved successfully");
			return "redirect:/users"; 
		}
	
	}
	
	@GetMapping("/users/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ra){
		try {
			
			service.delete(id);
		
		}catch (UserNotFoundException e) {
			
			ra.addFlashAttribute("message", e.getMessage());
			
		}
		return "redirect:/users"; 
	
	}
}
