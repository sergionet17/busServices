
package com.avianca.lifemiles.model.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Assert Solutions S.A.S
 *
 */
@JsonAutoDetect
@JsonSerialize
@XmlType(name = "FolRangoRow")
@XmlAccessorType(XmlAccessType.FIELD)
public class FolRangoRow implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String validoDesde;
    private String validoHasta;
    private Long inicioRango;
    private Long finalRango;
    private String carrierOpr;
    private String carrierMkt;
    
    public FolRangoRow() {
    }
    
    public String getValidoDesde() {
	return validoDesde;
    }
    
    public void setValidoDesde(String validoDesde) {
	this.validoDesde = validoDesde;
    }
    
    public String getValidoHasta() {
	return validoHasta;
    }
    
    public void setValidoHasta(String validoHasta) {
	this.validoHasta = validoHasta;
    }
    
    public Long getInicioRango() {
	return inicioRango;
    }
    
    public void setInicioRango(Long inicioRango) {
	this.inicioRango = inicioRango;
    }
    
    public Long getFinalRango() {
	return finalRango;
    }
    
    public void setFinalRango(Long finalRango) {
	this.finalRango = finalRango;
    }
    
    public String getCarrierOpr() {
	return carrierOpr;
    }
    
    public void setCarrierOpr(String carrierOpr) {
	this.carrierOpr = carrierOpr;
    }
    
    public String getCarrierMkt() {
	return carrierMkt;
    }
    
    public void setCarrierMkt(String carrierMkt) {
	this.carrierMkt = carrierMkt;
    }
    
}
