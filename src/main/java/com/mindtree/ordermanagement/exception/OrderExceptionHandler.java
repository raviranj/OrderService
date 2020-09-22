package com.mindtree.ordermanagement.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OrderExceptionHandler {

	@ExceptionHandler
	public String handleOrderException(RuntimeException ex) {
		return ex.getMessage();
	}
}
