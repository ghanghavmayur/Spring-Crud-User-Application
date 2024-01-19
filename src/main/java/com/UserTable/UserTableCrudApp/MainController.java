package com.UserTable.UserTableCrudApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("")
	public String Homepage() {
		return "index";
	}
	
}