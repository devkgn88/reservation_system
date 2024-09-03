package com.gn.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class SettingController {
	
	@GetMapping("/setting/holiday")
	public String settingHolidy() {
		return "setting/holiday/list";
	}
}
