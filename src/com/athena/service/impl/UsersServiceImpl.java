package com.athena.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.athena.mapper.UsersMapper;
import com.athena.pojo.Users;
import com.athena.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	@Override
	public int insRegister(Users users) {
		return usersMapper.insUsers(users);
	}

}
