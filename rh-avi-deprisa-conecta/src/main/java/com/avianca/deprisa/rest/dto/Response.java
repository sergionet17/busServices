package com.avianca.deprisa.rest.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect
@JsonSerialize
public class Response implements Serializable {


	@JsonProperty(value = "AviancaAccrualFile")
    private List<ResponseDTO> aviancaAccrualFile;

	public List<ResponseDTO> getAviancaAccrualFile() {
		return aviancaAccrualFile;
	}

	public void setAviancaAccrualFile(List<ResponseDTO> aviancaAccrualFile) {
		this.aviancaAccrualFile = aviancaAccrualFile;
	}

	
    
    
}
