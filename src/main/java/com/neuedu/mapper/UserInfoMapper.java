package com.neuedu.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.model.po.Userinfo;

public interface UserInfoMapper {
	
	public List<Userinfo> getAllUsers();
	
	public Userinfo getUserById(int id);
	
	public List<Userinfo> getUsersByName(String name);
	
	public List<Userinfo> getUsersByCondition(Userinfo u);
	
	public List<Userinfo> getUsersByCondition2(Map m);
	
	public void addUser(Userinfo u);
	
	public void updateUser(Userinfo u);
	
	public void deleteUser(int id);
	
	public List<Userinfo> getUsers(Userinfo u);
	
	public List<Userinfo> getUsersByIds(List<Integer> userids);
	
	public List<Userinfo> getUsersByIdsTwo(int[] userids);
	
	//ids name
	public void deleteUsers(Map m);
	
	

}
