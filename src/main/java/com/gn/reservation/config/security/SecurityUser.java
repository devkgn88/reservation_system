package com.gn.reservation.config.security;

import org.springframework.security.core.userdetails.User;

import com.gn.reservation.mybatis.vo.Account;

public class SecurityUser extends User{

	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private Account account;

	public SecurityUser(Account account) {
		super(account.getAccount_id(), account.getAccount_pw(), account.getAuthorities());
		this.account = account;
	}

}
