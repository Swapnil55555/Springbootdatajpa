package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.User;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void savedata(User u) {

       hr.save(u);
       
 
	}

	@Override
	public User logincheck(String uname, String pass) {
		return hr.findAllByUnameAndPass(uname, pass);
		 
	}

	@Override
	public Iterable<User> getAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deletedata(User u) {
		
		hr.delete(u);
		
	}

	@Override
	public User editdata(int uid) {
		
		//hr.findById(uid).get();
		
		return hr.findByUid(uid);
	}

}
