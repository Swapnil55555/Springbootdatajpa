package com.cjc.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.User;

@Repository
public interface HomeRepository extends CrudRepository<User, Integer> 
{
	public User findAllByUnameAndPass(String uname, String pass);
	
	public User findByUid(int uid);
}


