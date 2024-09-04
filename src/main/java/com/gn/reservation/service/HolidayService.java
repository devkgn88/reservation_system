package com.gn.reservation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gn.reservation.jpa.domain.Holiday;
import com.gn.reservation.jpa.dto.HolidayDto;
import com.gn.reservation.jpa.repository.HolidayRepository;

@Service
public class HolidayService {
	
	private HolidayRepository  holidayRepository;
	
	@Autowired
	public HolidayService(HolidayRepository holidayRepository) {
		this.holidayRepository = holidayRepository;
	}
	
	public List<HolidayDto> selectHolidayList(){
		List<Holiday> holidayList = holidayRepository.findAll();
		List<HolidayDto> holidayDtoList = new ArrayList<HolidayDto>();
		for(Holiday h : holidayList) {
			HolidayDto dto = new HolidayDto().toDto(h);
			holidayDtoList.add(dto);
		}
		return holidayDtoList;
	}
	
}
