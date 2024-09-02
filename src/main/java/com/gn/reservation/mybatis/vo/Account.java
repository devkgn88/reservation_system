package com.gn.reservation.mybatis.vo;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
	private int account_no;
	private String account_id;
	private String account_pw;
	private String account_name;
	private String team_name;
	private String team_type;
	
	private List<GrantedAuthority> authorities;
}

