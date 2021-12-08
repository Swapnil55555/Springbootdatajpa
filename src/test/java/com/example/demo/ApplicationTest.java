package com.example.demo;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.model1.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;
	 
	@RunWith(MockitoJUnitRunner.class)
	public class ApplicationTest 
	{
	    @InjectMocks
	    HomeService hs;
	     
	    @Mock
	    HomeRepository hr;
	     
	    
	     
	    @Test
	    public void saveTest()
	    {
	    	Employee emp=new Employee("swapnil","tambe");
	    	when(hs.savedata(emp)).thenReturn(emp);
	        Employee saved = hs.savedata(emp);
	        assertEquals(emp, saved);
	   }
	}

