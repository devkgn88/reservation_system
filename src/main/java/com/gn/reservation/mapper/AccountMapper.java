package com.gn.reservation.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gn.reservation.vo.Account;

@Mapper
public interface AccountMapper {
	Account selectByAccountId(String account_id);
}
