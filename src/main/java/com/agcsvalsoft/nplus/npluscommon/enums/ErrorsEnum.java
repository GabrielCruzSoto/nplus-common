package com.agcsvalsoft.nplus.npluscommon.enums;



public enum ErrorsEnum{
	NOT_FOUND_REGION_BY_ID("E_404_01", "There is no Region with the id = %s", "No existe una Region con el id"),
	NOT_FOUND_COMMUNE_BY_ID("E_404_02", "There is no Commune with the id = %s", "No existe una Comuna con el id"),
	NOT_FOUND_COMMUNE_BY_ID_REGION("E_404_03", "No Communes were found with idRegion=%s", "La Region no tiene comunas");
	
	
	
	
	
	
	
	
	
	
	
	
	private ErrorsEnum(String codeError, String messageErrorEnglish, String messageErrorSpanish) {
		this.codeError = codeError;
		this.messageErrorEnglish = messageErrorEnglish;
		this.messageErrorSpanish= messageErrorSpanish;
	}
	private String codeError;
	private String messageErrorEnglish;
	private String messageErrorSpanish;
	
	public String getCodeError() {
		return codeError;
	}
	public String getMessageErrorEnglish() {
		return messageErrorEnglish;
	}
	public String getMessageErrorSpanish() {
		return messageErrorSpanish;
	}
	
	
}
