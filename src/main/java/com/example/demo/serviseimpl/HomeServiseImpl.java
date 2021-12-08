package com.example.demo.serviseimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void savedata(Employee e) {

       hr.save(e);
       
 
	}

	@Override
	public Employee logincheck(String uname, String pass) {
		return hr.findAllByUnameAndPass(uname, pass);
		 
	}

	@Override
	public Iterable<Employee> getAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deletedata(Employee e) {
		
		hr.delete(e);
		
	}

	@Override
	public Employee editdata(int empid) {
		
		//hr.findById(uid).get();
		
		return hr.findByEmpid(empid);
	}
