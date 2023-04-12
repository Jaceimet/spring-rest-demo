package com.luv2code.springdemo.rest;



public class StudentErrorResponse {

	private int Status;
	private String Message;
	private long timeStamp;
	
	public StudentErrorResponse() {
		
	}

	public StudentErrorResponse(int status, String message, long timeStamp) {
		Status = status;
		Message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}


	
}
