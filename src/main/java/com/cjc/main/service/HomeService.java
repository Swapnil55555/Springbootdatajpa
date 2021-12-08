package com.cjc.main.service;

import com.cjc.main.model.User;

public interface HomeService 
{

	public void savedata(User u);
	public User logincheck(String uname,String pass);
	public Iterable<User> getAllData();
	public void deletedata(User u);
	public User editdata(int uid);
}
