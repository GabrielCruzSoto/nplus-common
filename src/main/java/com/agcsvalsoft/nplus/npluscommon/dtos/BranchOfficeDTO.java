package com.agcsvalsoft.nplus.npluscommon.dtos;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BranchOfficeDTO  implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String id;
	private Integer numberBO;
	private String name;
	private String address;
	private Long idCommune;
	private Long idRegion;
	private String phone;
	private boolean isHeadquarters;
    private boolean isActive;
    private Date createdOn;
    private Date lastModification;
}
