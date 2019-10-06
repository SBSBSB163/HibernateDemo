package com.dao;

import java.util.List;

import com.model.UserInfo;

public interface UserInfoDao {
	public int register(UserInfo userinfo);
	public void delete(int id);
	public UserInfo updateUser(UserInfo u);
	public UserInfo listUserById(int id);
	public List<UserInfo> listAllUsers();
	

}
