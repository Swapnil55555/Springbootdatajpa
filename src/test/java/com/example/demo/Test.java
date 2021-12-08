package com.example.demo;

public class Test
{
	import static org.junit.Assert.assertEquals;
	import static org.mockito.Mockito.times;
	import static org.mockito.Mockito.verify;
	 
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.junit.MockitoJUnitRunner;
	 
	import com.cjc.main.repository.HomeRepository;
	import com.cjc.main.service.HomeService;
	 
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
	        boolean saved = hr.save(Employee e));
	        assertEquals(true, saved);
	   }
	}
}
