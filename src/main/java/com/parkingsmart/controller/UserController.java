package com.parkingsmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/home")
	public String getAdminHome() {
		return "user/index";
	}

}
