package com.ahmetkalender.referansyazilimproje.core.utilities.results;

public class Result {

	private String message;
	private Boolean success;
	
	
	public Result(String message, Boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	
    public boolean isSuccess() {
 	   return this.success;
    }
    
    public String getMessage() {
 	   return this.message;
    }
}
