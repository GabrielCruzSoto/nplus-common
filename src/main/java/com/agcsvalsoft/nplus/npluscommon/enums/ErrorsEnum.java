package com.agcsvalsoft.nplus.npluscommon.enums;



public enum ErrorsEnum {
	NOT_FOUND_REGION_BY_ID("E_404_01", "There is no Region with the id = %s", "No existe una Región con el id = %s"),
	NOT_FOUND_COMMUNE_BY_ID("E_404_02", "There is no Commune with the id = %s", "No existe una Comuna con el id = %s"),
	NOT_FOUND_COMMUNE_BY_ID_REGION("E_404_03", "No Communes were found with idRegion = %s", "La Región con id = %s no tiene comunas"),
	NOT_FOUND_BUSINESS_BY_RUT("E_404_04", "No Business found with RUT = %s", "No se encontró un Negocio con RUT = %s"),
	NOT_FOUND_BUSINESS_BY_ID("E_404_05", "No Business found with id = %s", "No se encontró un Negocio con id = %s"),
	NOT_FOUND_LEGAL_REPRESENTATIVE_BY_ID("E_404_06", "No Legal Representative found with id = %s", "No se encontró un Representante Legal con id = %s"),
	NOT_FOUND_LEGAL_REPRESENTATIVE_BY_RUT("E_404_07", "No Legal Representative found with RUT = %s", "No se encontró un Representante Legal con RUT = %s"),

	ALREADY_BUSINESS_BY_RUT("E_409_01", "A Business with RUT = %s already exists", "Ya existe un Negocio con RUT = %s"),
	ALREADY_BUSINESS_BY_COMPANY_NAME("E_409_02", "A Business with company name = %s already exists", "Ya existe un Negocio con nombre de empresa = %s"),
	ALREADY_BUSINESS_HAS_LEGAL_REPRESENTATIVE("E_409_03", "A Business already has a legal representative assigned", "Un Negocio ya tiene un representante legal asignado"),
	ALREADY_LEGAL_REPRESENTATIVE_EXISTS("E_409_04", "A Legal Representative with RUT = %s already exists", "Ya existe un Representante Legal con RUT = %s"),
	
	;

	private final String codeError;
	private final String messageErrorEnglish;
	private final String messageErrorSpanish;

	ErrorsEnum(String codeError, String messageErrorEnglish, String messageErrorSpanish) {
		this.codeError = codeError;
		this.messageErrorEnglish = messageErrorEnglish;
		this.messageErrorSpanish = messageErrorSpanish;
	}

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
