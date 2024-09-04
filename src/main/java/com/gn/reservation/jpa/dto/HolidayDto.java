package com.gn.reservation.jpa.dto;

import java.time.LocalDateTime;

import com.gn.reservation.jpa.domain.Holiday;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class HolidayDto {
	
	private Long holiday_no;
	private String holiday_name;
	private String holiday_start;
	private String holiday_end;
	private LocalDateTime reg_date;
	private LocalDateTime mod_date;
	
	public Holiday toEntity() {
		return Holiday.builder()
				.holidayNo(holiday_no)
				.holidayName(holiday_name)
				.holidayStart(holiday_start)
				.holidayEnd(holiday_end)
				.regDate(reg_date)
				.modDate(mod_date)
				.build();
	}
	
	public HolidayDto toDto(Holiday holiday) {
		return HolidayDto.builder()
				.holiday_no(holiday.getHolidayNo())
				.holiday_name(holiday.getHolidayName())
				.holiday_start(holiday.getHolidayStart())
				.holiday_end(holiday.getHolidayEnd())
				.reg_date(holiday.getRegDate())
				.mod_date(holiday.getModDate())
				.build();
	}
}
