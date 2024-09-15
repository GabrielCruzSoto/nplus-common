package com.agcsvalsoft.nplus.npluscommon.dtos;

import java.io.Serializable;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String rut;
	private String companyName;
	private String fantasyName;
	private String address;
	private CommuneDTO commune;
	private RegionDTO region;
	private String phone;
	private String cellPhone;
	private LegalRepresentativeDTO legalRepresentative;
	private Date createdOn;
	private Date lastModification;

} 
