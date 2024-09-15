package com.agcsvalsoft.nplus.npluscommon.dtos;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import com.agcsvalsoft.nplus.npluscommon.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LegalRepresentativeDTO  implements Serializable{
	
	@Serial
    private static final long serialVersionUID = 1L;
	
    private String id;
    private String rut;
    private String name;
    private String address;
    private CommuneDTO commune;
    private RegionDTO region;
    private String email;
    private String phone;
    private String celPhone;
    private StatusEnum status;
    private Date createdOn;
    private Date lastModification;
}
