package com.agcsvalsoft.nplus.npluscommon.exceptions;

import org.springframework.http.HttpStatus;

import com.agcsvalsoft.nplus.npluscommon.enums.ErrorsEnum;

public class NotFoundException extends NPlusException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(ErrorsEnum errorsEnum) {
		super(HttpStatus.NOT_FOUND, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish());
		
	}
	@SuppressWarnings("static-access")
	public NotFoundException(ErrorsEnum errorsEnum, String optionalId) {
		super(HttpStatus.NOT_FOUND, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish().format(optionalId));
		
	}
}
