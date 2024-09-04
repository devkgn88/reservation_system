package com.gn.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@PostMapping("/setting/holiday")
	public String createHoliday(Model model, HolidayDto dto) {
		String page = "error/400";
		if(holidayService.createHoliday(dto) > 0) {
			List<HolidayDto> resultList = holidayService.selectHolidayList();
			model.addAttribute("resultList",resultList);
			page="setting/holiday/list";
		}
		return page;
	}
	
	@ResponseBody
	@GetMapping("/setting/holiday/{holiday_no}")
	public HolidayDto selectHolidayOne(Model model, @PathVariable("holiday_no") Long holiday_no) {
		HolidayDto dto = holidayService.selectHolidayOne(holiday_no);
		return dto;
	}
}
