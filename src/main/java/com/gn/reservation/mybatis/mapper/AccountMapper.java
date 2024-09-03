package com.gn.reservation.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gn.reservation.mybatis.vo.Account;

@Mapper
public interface AccountMapper {
	// 메소드명과 mapper.xml 파일의 id 맞춰주기
	Account selectByAccountId(String account_id);
}
