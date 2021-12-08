package com.example.demo.service;


import com.example.demo.model1.Employee;


public interface HomeService 
{

	public Employee savedata(Employee e);
	public Employee logincheck(String uname,String pass);
	public Iterable<Employee> getAllData();
	public void deletedata(Employee u);
	public Employee editdata(int empid);
}
