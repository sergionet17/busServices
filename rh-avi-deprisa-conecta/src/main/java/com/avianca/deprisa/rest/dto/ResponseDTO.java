package com.avianca.deprisa.rest.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect
@JsonSerialize
public class ResponseDTO implements Serializable {

    private static final long serialVersionUID = -928421079621243775L;
    @JsonProperty
    private String primerNombre;
    @JsonProperty
    private String primerApellido;
    @JsonProperty
    private String codEmpleado;
    @JsonProperty
    private String numDocIdentidad;
    @JsonProperty
    private String fechaNacimiento;
    @JsonProperty
    private String fechaIngresoCompania;
    @JsonProperty
    private String correoCorporativo;
    @JsonProperty
    private String pais;
    @JsonProperty
    private String empresa;
    @JsonProperty
    private String tipoTrabajo;
    @JsonProperty
    private String categoriaTrabajo;
    @JsonProperty
    private String tipoPersona;
    @JsonProperty
    private String subtipoPersona;
    @JsonProperty
    private String genero;
    @JsonProperty
    private String estacion;
    @JsonProperty
    private String region;
    @JsonProperty
    private String centroTrabajo;
    @JsonProperty
    private String nacionalidad;
    @JsonProperty
    private String codvicepresidencia;
    @JsonProperty
    private String vicepresidencia;
    @JsonProperty
    private String direccion;
    @JsonProperty
    private String gerencia;
    @JsonProperty
    private String nombrePosicion;
    @JsonProperty
    private String tipoContrato;
    @JsonProperty
    private String tipoJornada;
    @JsonProperty
    private String nombreSindicato;
    @JsonProperty
    private String usuarioRed;    
    

    public ResponseDTO() {
    }


	public String getPrimerNombre() {
		return primerNombre;
	}


	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}


	public String getCodEmpleado() {
		return codEmpleado;
	}


	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}


	public String getNumDocIdentidad() {
		return numDocIdentidad;
	}


	public void setNumDocIdentidad(String numDocIdentidad) {
		this.numDocIdentidad = numDocIdentidad;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getFechaIngresoCompania() {
		return fechaIngresoCompania;
	}


	public void setFechaIngresoCompania(String fechaIngresoCompania) {
		this.fechaIngresoCompania = fechaIngresoCompania;
	}


	public String getCorreoCorporativo() {
		return correoCorporativo;
	}


	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getTipoTrabajo() {
		return tipoTrabajo;
	}


	public void setTipoTrabajo(String tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}


	public String getCategoriaTrabajo() {
		return categoriaTrabajo;
	}


	public void setCategoriaTrabajo(String categoriaTrabajo) {
		this.categoriaTrabajo = categoriaTrabajo;
	}


	public String getTipoPersona() {
		return tipoPersona;
	}


	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}


	public String getSubtipoPersona() {
		return subtipoPersona;
	}


	public void setSubtipoPersona(String subtipoPersona) {
		this.subtipoPersona = subtipoPersona;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEstacion() {
		return estacion;
	}


	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getCentroTrabajo() {
		return centroTrabajo;
	}


	public void setCentroTrabajo(String centroTrabajo) {
		this.centroTrabajo = centroTrabajo;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getCodvicepresidencia() {
		return codvicepresidencia;
	}


	public void setCodvicepresidencia(String codvicepresidencia) {
		this.codvicepresidencia = codvicepresidencia;
	}


	public String getVicepresidencia() {
		return vicepresidencia;
	}


	public void setVicepresidencia(String vicepresidencia) {
		this.vicepresidencia = vicepresidencia;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getGerencia() {
		return gerencia;
	}


	public void setGerencia(String gerencia) {
		this.gerencia = gerencia;
	}


	public String getNombrePosicion() {
		return nombrePosicion;
	}


	public void setNombrePosicion(String nombrePosicion) {
		this.nombrePosicion = nombrePosicion;
	}


	public String getTipoContrato() {
		return tipoContrato;
	}


	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}


	public String getTipoJornada() {
		return tipoJornada;
	}


	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}


	public String getNombreSindicato() {
		return nombreSindicato;
	}


	public void setNombreSindicato(String nombreSindicato) {
		this.nombreSindicato = nombreSindicato;
	}


	public String getUsuarioRed() {
		return usuarioRed;
	}


	public void setUsuarioRed(String usuarioRed) {
		this.usuarioRed = usuarioRed;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
