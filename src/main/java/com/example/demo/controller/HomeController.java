package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.User;
import com.cjc.main.service.HomeService;

public class HomeController {
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preregister()
	{
		return "register";
	}
	@RequestMapping("/reg")
	public String registerdata(@ModelAttribute("user") User u)
	{
		
		hs.savedata(u);
		return "login";
	}
	
	@RequestMapping("/login")
	public String logincheck(@RequestParam("uname") String uname,@RequestParam("password") String pass, ModelMap m)
	{
		
		System.out.println("Username is"+ uname);
		System.out.println("Password is"+ pass);
		
		User u=hs.logincheck(uname,pass);
		
		if(u!=null)
		{
			     Iterable<Employee> list= hs.getAllData();
			     m.addAttribute("data",list);
			     return "success";
			     
		}
		
		
		return "login";
		
	}
	

	
	@RequestMapping("/delete")
	public String deletedata(@ModelAttribute("employee") Employee e,Model m)
	{
		
		
		hs.deletedata(e);
		Iterable<Employee> list= hs.getAllData();
	     m.addAttribute("data",list);
		return "success";
	}
	
	
	@RequestMapping("/edit")
	public String editpage(@RequestParam("empid") int empid,Model m)
	{
		User u=hs.editdata(empid);
		m.addAttribute("data", e);
		
		return "edit";
	}

	@RequestMapping("/update")
	public String updatedata(@ModelAttribute("user") Employee e,Model m)
	{
		hs.savedata(e);
		Iterable<Employee> list= hs.getAllData();
	     m.addAttribute("data",list);
		return "success";
		
		
	}
}
