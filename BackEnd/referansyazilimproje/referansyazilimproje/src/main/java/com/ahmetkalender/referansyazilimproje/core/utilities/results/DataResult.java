package com.ahmetkalender.referansyazilimproje.core.utilities.results;

public class DataResult<T> {

	private String message;
	private Boolean success;
	private T data;
	
	public DataResult(String message, Boolean success, T data) {
		super();
		this.message = message;
		this.success = success;
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
