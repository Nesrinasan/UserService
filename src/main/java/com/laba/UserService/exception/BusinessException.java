package com.laba.UserService.exception;

public class BusinessException extends RuntimeException{

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}


}
