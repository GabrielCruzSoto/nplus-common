package com.agcsvalsoft.nplus.npluscommon.dtos;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegionDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private List<CommuneDTO> listCommunes;

}
