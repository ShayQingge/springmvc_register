package com.athena.mapper;

import org.apache.ibatis.annotations.Insert;

import com.athena.pojo.Users;

public interface UsersMapper {
	@Insert("insert into users values (default,#{username},#{password},#{photo})")
	int insUsers(Users users);
}
