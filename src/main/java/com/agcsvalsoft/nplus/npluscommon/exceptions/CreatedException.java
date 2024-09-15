package com.agcsvalsoft.nplus.npluscommon.exceptions;

import org.springframework.http.HttpStatus;

import com.agcsvalsoft.nplus.npluscommon.enums.ErrorsEnum;

public class CreatedException  extends NPlusException {

	private static final long serialVersionUID = 1L;

	public CreatedException(ErrorsEnum errorsEnum) {
		super(HttpStatus.CREATED, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish());
		
	}
	@SuppressWarnings("static-access")
	public CreatedException(ErrorsEnum errorsEnum, String optionalId) {
		super(HttpStatus.CREATED, errorsEnum.getCodeError(), errorsEnum.getMessageErrorEnglish().format(optionalId));
		
	}
}
