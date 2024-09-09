package com.agcsvalsoft.nplus.npluscommon.exceptions;

import org.springframework.http.HttpStatus;

public abstract class NPlusException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private HttpStatus httpStatus;
	private String codeError;
	
	public NPlusException(HttpStatus httpStatus, String codeError, String message) {
		super(message);
		this.httpStatus = httpStatus;
		this.codeError= codeError;
		
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getCodeError() {
		return codeError;
	}
	
	
}