package com.agcsvalsoft.nplus.npluscommon.dtos;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LegalRepresentativeDTO  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private String id;
    private String rut;
    private String name;
    private String address;
    private String idCommune;
    private String idRegion;
    private String email;
    private String phone;
    private String celPhone;
    private boolean status;
    private Date createdOn;
    private Date lastModification;
}
