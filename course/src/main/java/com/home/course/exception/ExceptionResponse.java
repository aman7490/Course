package com.home.course.exception;

public class ExceptionResponse {

	private String message;
	private String requestURI;
	private String messageDescription;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRequesturi() {
		return requestURI;
	}
	public void setRequesturi(String requesturi) {
		this.requestURI = requesturi;
	}
	public String getMessageDescription() {
		return messageDescription;
	}
	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}
	
	
	
}
