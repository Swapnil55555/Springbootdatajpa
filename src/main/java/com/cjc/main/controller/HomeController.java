package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.User;
import com.cjc.main.service.HomeService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
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
			     Iterable<User> list= hs.getAllData();
			     m.addAttribute("data",list);
			     return "success";
			     
		}
		
		
		return "login";
		
	}
	

	
	@RequestMapping("/delete")
	public String deletedata(@ModelAttribute("user") User u,Model m)
	{
		
		
		hs.deletedata(u);
		Iterable<User> list= hs.getAllData();
	     m.addAttribute("data",list);
		return "success";
	}
	
	
	@RequestMapping("/edit")
	public String editpage(@RequestParam("uid") int uid,Model m)
	{
		User u=hs.editdata(uid);
		m.addAttribute("data", u);
		
		return "edit";
	}

	@RequestMapping("/update")
	public String updatedata(@ModelAttribute("user") User u,Model m)
	{
		hs.savedata(u);
		Iterable<User> list= hs.getAllData();
	     m.addAttribute("data",list);
		return "success";
		
		
	}
	
	
}

