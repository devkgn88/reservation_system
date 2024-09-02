package com.gn.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	@GetMapping("/error/401")
	public String error401Page() {
		return "error/401";
	}
}
