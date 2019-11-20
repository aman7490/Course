package com.home.course.exception;

public class CourseNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException() {
		super();
	}
	
	public CourseNotFoundException(final String message) {
		super(message);
	}
	
}
