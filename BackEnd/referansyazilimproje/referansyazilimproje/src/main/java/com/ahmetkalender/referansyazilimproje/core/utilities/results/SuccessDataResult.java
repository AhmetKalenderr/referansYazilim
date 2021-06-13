package com.ahmetkalender.referansyazilimproje.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(String message, T data) {
		super(message, true, data);
		// TODO Auto-generated constructor stub
	}

}
