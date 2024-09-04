package com.gn.reservation.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gn.reservation.jpa.domain.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday,Long>{
	
	Holiday findByholidayNo(Long holidayNo);

}
