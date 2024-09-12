package com.gn.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaceController {
	
	@GetMapping("/space")
	public String selectSpaceList() {
		return "space/list";
	}
	
}
