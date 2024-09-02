package com.gn.reservation.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gn.reservation.mybatis.vo.Account;

@Mapper
public interface AccountMapper {
	Account selectByAccountId(String account_id);
}
