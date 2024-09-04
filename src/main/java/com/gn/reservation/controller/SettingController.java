package com.gn.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gn.reservation.jpa.dto.HolidayDto;
import com.gn.reservation.service.HolidayService;

@Controller
public class SettingController {
	
	private final HolidayService holidayService;
	
	@Autowired
	public SettingController(HolidayService holidayService) {
		this.holidayService = holidayService;
	}
	
	@GetMapping("/setting/holiday")
	public String selectHolidayList(Model model) {
		List<HolidayDto> resultList = holidayService.selectHolidayList();
		model.addAttribute("resultList",resultList);
		return "setting/holiday/list";
	}
}
