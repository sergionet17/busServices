package com.avianca.deprisa.rest.handler;

import org.apache.camel.ExchangeProperty;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.avianca.deprisa.rest.dto.ResponseDTO;
import com.avianca.deprisa.rest.dto.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Assert Solutions S.A.S <info@assertsolutions.com>
 * <br/>
 * Date: 9/04/2018 8:11:28 a.m.
 *
 */
@Component
public class ResponseHandler {

    @Handler
    public void createResponse(Exchange exchange, @ExchangeProperty("bOperacionExitosa") Boolean bOperacionExitosa,
            @ExchangeProperty("sMensajeRtaUsuario") String sMensajeRtaUsuario,
            @ExchangeProperty("codigo") String codigo) {
        // Create Entity for Response
        ResponseDTO responseDTO = new ResponseDTO();
        Response resp = new Response();
        List<ResponseDTO> response = new ArrayList<ResponseDTO>();
        List<Map<String, Object>> accrual = (List<Map<String, Object>>) exchange.getIn().getBody();
        if (accrual != null && !accrual.isEmpty()) {
            for (Map<String, Object> map : accrual) {
                responseDTO.setCategoriaTrabajo(("" + (map.get("CATEGORIATRABAJO") != null ? map.get("CATEGORIATRABAJO") : "")).trim());
                responseDTO.setCentroTrabajo(("" + (map.get("CENTROTRABAJO") != null ? map.get("CENTROTRABAJO") : "")).trim());
                responseDTO.setCodEmpleado(("" + (map.get("CODEMPLEADO") != null ? map.get("CODEMPLEADO") : "")).trim());
                responseDTO.setCodvicepresidencia(("" + (map.get("CODVICEPRESIDENCIA") != null ? map.get("CODVICEPRESIDENCIA") : "")).trim());
                responseDTO.setCorreoCorporativo(("" + (map.get("CORREOCORPORATIVO") != null ? map.get("CORREOCORPORATIVO") : "")).trim());
                responseDTO.setDireccion(("" + (map.get("DIRECCION") != null ? map.get("DIRECCION") : "")).trim());
                responseDTO.setEmpresa(("" + (map.get("EMPRESA") != null ? map.get("EMPRESA") : "")).trim());
                responseDTO.setEstacion(("" + (map.get("ESTACION") != null ? map.get("ESTACION") : "")).trim());
                responseDTO.setFechaIngresoCompania(("" + (map.get("FECHAINGRESOCOMPANIA") != null ? map.get("FECHAINGRESOCOMPANIA") : "")).trim());
                responseDTO.setFechaNacimiento(("" + (map.get("FECHANACIMIENTO") != null ? map.get("FECHANACIMIENTO") : "")).trim());
                responseDTO.setGenero(("" + (map.get("GENERO") != null ? map.get("GENERO") : "")).trim());                
                responseDTO.setGerencia(("" + (map.get("GERENCIA") != null ? map.get("GERENCIA") : "")).trim());
                responseDTO.setNacionalidad(("" + (map.get("NACIONALIDAD") != null ? map.get("NACIONALIDAD") : "")).trim());
                responseDTO.setNombrePosicion(("" + (map.get("NOMBREPOSICION") != null ? map.get("NOMBREPOSICION") : "")).trim());
                responseDTO.setNombreSindicato(("" + (map.get("NOMBRESINDICATO") != null ? map.get("NOMBRESINDICATO") : "")).trim());                
                responseDTO.setNumDocIdentidad(("" + (map.get("NUMDOCIDENTIDAD") != null ? map.get("NUMDOCIDENTIDAD") : "")).trim());                
                responseDTO.setNombrePosicion(("" + (map.get("NOMBREPOSICION") != null ? map.get("NOMBREPOSICION") : "")).trim());
                responseDTO.setPais(("" + (map.get("PAIS") != null ? map.get("PAIS") : "")).trim());
                responseDTO.setPrimerApellido(("" + (map.get("PRIMERAPELLIDO") != null ? map.get("PRIMERAPELLIDO") : "")).trim());
                responseDTO.setPrimerNombre(("" + (map.get("PRIMERNOMBRE") != null ? map.get("PRIMERNOMBRE") : "")).trim());
                responseDTO.setRegion(("" + (map.get("REGION") != null ? map.get("REGION") : "")).trim());
                responseDTO.setSubtipoPersona(("" + (map.get("SUBTIPOPERSONA") != null ? map.get("SUBTIPOPERSONA") : "")).trim());
                responseDTO.setTipoContrato(("" + (map.get("TIPOCONTRATO") != null ? map.get("TIPOCONTRATO") : "")).trim());
                responseDTO.setTipoJornada(("" + (map.get("TIPOJORNADA") != null ? map.get("TIPOJORNADA") : "")).trim());
                responseDTO.setUsuarioRed(("" + (map.get("USUARIORED") != null ? map.get("USUARIORED") : "")).trim());
                responseDTO.setVicepresidencia(("" + (map.get("VICEPRESIDENCIA") != null ? map.get("VICEPRESIDENCIA") : "")).trim());
                responseDTO.setTipoTrabajo(("" + (map.get("TIPOTRABAJO") != null ? map.get("TIPOTRABAJO") : "")).trim());
                responseDTO.setTipoPersona(("" + (map.get("TIPOPERSONA") != null ? map.get("TIPOPERSONA") : "")).trim());
                response.add(responseDTO);
            }          
            resp.setAviancaAccrualFile(response);
            exchange.getOut().setHeader(Exchange.ACCEPT_CONTENT_TYPE, "application/json; charset=UTF-8");
            exchange.getOut().setHeader("SCodigo", codigo);
            exchange.getOut().setHeader("BOperacionExitosa", bOperacionExitosa);
            exchange.getOut().setHeader("SMensaje", "Operacion Exitosa");
            exchange.getOut().setHeader("SMensajeTecnico", "Operacion Exitosa");
            exchange.getOut().setBody(resp);
        }

    }
}
