package com.gn.reservation.jpa.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="holiday")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
public class Holiday {
	
	@Id
	@Column(name="holiday_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long holidayNo;
	
	@Column(name="holiday_name")
	private String holidayName;
	
	@Column(name="holiday_start")
	private String holidayStart;
	
	@Column(name="holiday_end")
	private String holidayEnd;
	
	@Column(name="reg_date")
	@CreationTimestamp
	private LocalDateTime regDate;
	
	@Column(name="mod_date")
	@UpdateTimestamp
	private LocalDateTime modDate;


}
