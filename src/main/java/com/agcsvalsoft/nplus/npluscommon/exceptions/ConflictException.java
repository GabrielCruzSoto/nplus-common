package com.agcsvalsoft.nplus.npluscommon.exceptions;

import org.springframework.http.HttpStatus;

import com.agcsvalsoft.nplus.npluscommon.enums.ErrorsEnum;

public class ConflictException  extends NPlusException {

	private static final long serialVersionUID = 1L;

	public ConflictException(ErrorsEnum errorsEnum) {
		super(HttpStatus.CONFLICT, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish());
		
	}
	@SuppressWarnings("static-access")
	public ConflictException(ErrorsEnum errorsEnum, String optionalId) {
		super(HttpStatus.CONFLICT, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish().format(optionalId));
		
	}
}
