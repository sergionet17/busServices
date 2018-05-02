package com.avianca.deprisa.rest.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Assert Solutions S.A.S <info@assertsolutions.com>
 * <br/>
 * Date: 10/04/2018 9:04:30 a.m.
 *
 */
@JsonAutoDetect
@JsonSerialize
public class RequestDTO implements Serializable {

    private static final long serialVersionUID = 6872117570224011584L;

    @JsonProperty
    private String idUsuario;
    @JsonProperty
    private int filterType;
    @JsonProperty
    private int origen;

    public RequestDTO() {
    }

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getFilterType() {
		return filterType;
	}

	public void setFilterType(int filterType) {
		this.filterType = filterType;
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
