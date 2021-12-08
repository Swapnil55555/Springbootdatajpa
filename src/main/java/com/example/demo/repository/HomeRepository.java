package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model1.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer> 
{
	public Employee findAllByEmpid(String uname, String pass);
	
	public Employee findByEmpid(int Empid);
}
