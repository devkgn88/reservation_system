package com.gn.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	
	@GetMapping("/login")
	public String loginAccount() {
		return "account/login";
	}
	

}
