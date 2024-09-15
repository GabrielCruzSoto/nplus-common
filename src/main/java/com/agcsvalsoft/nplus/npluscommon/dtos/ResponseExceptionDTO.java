package com.agcsvalsoft.nplus.npluscommon.dtos;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseExceptionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codeHttp;
    private String codeError;
    private String message;
}
