package com.home.course.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
@ExceptionHandler(CourseNotFoundException.class)
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public @ResponseBody ExceptionResponse handlecoursenotfoundexceptionfunc(final CourseNotFoundException courseNotFoundException, final HttpServletRequest httpServletRequest) {
	
	ExceptionResponse exceptionResponse = new ExceptionResponse();
	exceptionResponse.setMessage(courseNotFoundException.getMessage());
//	exceptionResponse.setMessageDescription("Record is not available or empty in database");
	exceptionResponse.setRequesturi(httpServletRequest.getRequestURI());
	return exceptionResponse;
	
}
}
