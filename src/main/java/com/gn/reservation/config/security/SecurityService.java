package com.gn.reservation.config.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gn.reservation.mybatis.mapper.AccountMapper;
import com.gn.reservation.mybatis.vo.Account;

@Service
public class SecurityService implements UserDetailsService{
	
	private final AccountMapper accountMapper;
	
	@Autowired
	public SecurityService(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		Account account = accountMapper.selectByAccountId(username);
		
		if(account != null) {
			String type = account.getTeam_type();
			
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("M".equals(type) ? "ADMIN" : "USER"));
			
			account.setAuthorities(authorities);
			
			return new SecurityUser(account);
		} else {
			throw new UsernameNotFoundException("오류!!");
		}
		
	}
	


}
