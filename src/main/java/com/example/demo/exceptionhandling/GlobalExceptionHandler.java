package com.example.demo.exceptionhandling;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler
public String handleNoRecordFoundException(NoRecordFoundExcepton e,Model model) {
	boolean e;
	if(e==true) {
	return "error";

}
	else {
		return "success";
	}
}
}
