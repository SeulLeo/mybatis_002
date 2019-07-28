package com.zk.dao;

import org.apache.ibatis.annotations.Select;

import com.zk.models.user;

public interface IUser {
	@Select("select * from user where id=#{id}")
	public user getUserById(int id);
}
