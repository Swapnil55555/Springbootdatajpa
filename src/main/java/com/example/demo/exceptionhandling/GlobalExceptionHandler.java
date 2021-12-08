package com.example.demo.exceptionhandling;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler
public String handleNoRecordFoundException(Exception e,Model model) {
//	boolean e;
//	if(e==true) {
//	return "error";
//
//}
//	else {
//		return "success";
//	}
	return "";
}
}
