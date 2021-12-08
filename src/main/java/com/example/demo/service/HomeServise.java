package com.example.demo.service;


public interface HomeService 
{

	public void savedata(Employee e);
	public User logincheck(String uname,String pass);
	public Iterable<Employee> getAllData();
	public void deletedata(Employee u);
	public Employee editdata(int empid);
}
