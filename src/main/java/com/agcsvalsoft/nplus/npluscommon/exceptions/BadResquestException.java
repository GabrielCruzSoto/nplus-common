package com.agcsvalsoft.nplus.npluscommon.exceptions;

import org.springframework.http.HttpStatus;

import com.agcsvalsoft.nplus.npluscommon.enums.ErrorsEnum;

public class BadResquestException extends NPlusException {

	private static final long serialVersionUID = 1L;

	public BadResquestException(ErrorsEnum errorsEnum) {
		super(HttpStatus.BAD_REQUEST, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish());
		
	}
	@SuppressWarnings("static-access")
	public BadResquestException(ErrorsEnum errorsEnum, String optionalId) {
		super(HttpStatus.BAD_REQUEST, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish().format(optionalId));
		
	}
}
