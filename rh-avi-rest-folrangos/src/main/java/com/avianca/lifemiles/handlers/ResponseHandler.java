package com.avianca.lifemiles.handlers;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.springframework.stereotype.Component;

import com.avianca.lifemiles.model.response.FolRangoRow;
import java.util.Map;

/**
 * 
 * @author Assert Solutions S.A.S
 *
 */
@Component
public class ResponseHandler implements Processor {
    
    @Override
    public void process(Exchange exchange) throws Exception {
	// GetRangosResponse response = new GetRangosResponse();
	List<FolRangoRow> floRangosRows = null;
	String operacionExitosa = (String) exchange.getProperty("bOperacionExitosa");
	String sMensajeRtaUsuario = (String) exchange.getProperty("sMensajeRtaUsuario");
	String sMensajeRtaTecnico = (String) exchange.getProperty("sMensajeRtaTecnico");
	String sCodigoRespuesta = (String) exchange.getProperty("sCodigoRespuesta");
        
	List<Map<String, Object>> accrual = (List<Map<String, Object>>) exchange.getIn().getBody();
        floRangosRows = new ArrayList<FolRangoRow>();
        if (accrual != null && !accrual.isEmpty()) {
            for (Map<String, Object> map : accrual) {
                String inicioRango = (map.get("inicio_rango")).toString();
                String finalRango = (map.get("final_rango")).toString();
                Long inicioRangoL = Long.parseLong(inicioRango);
                Long finalRangoL = Long.parseLong(finalRango);
                FolRangoRow folRangoRow = new FolRangoRow();
                folRangoRow.setValidoDesde(("" + (map.get("valido_desde") != null ? map.get("valido_desde") : "")).trim());
                folRangoRow.setValidoHasta(("" + (map.get("valido_hasta") != null ? map.get("valido_hasta") : "")).trim());
                folRangoRow.setInicioRango(inicioRangoL);
                folRangoRow.setFinalRango(finalRangoL);
                folRangoRow.setCarrierMkt(("" + (map.get("carrier_mkt") != null ? map.get("carrier_mkt") : "")).trim());
                folRangoRow.setCarrierOpr(("" + (map.get("carrier_opr") != null ? map.get("carrier_opr") : "")).trim());
                floRangosRows.add(folRangoRow);                
            }
        }		
	exchange.getOut().setHeader("SCodigo", sCodigoRespuesta);
	exchange.getOut().setHeader("BOperacionExitosa", operacionExitosa);
	exchange.getOut().setHeader("SMensaje", sMensajeRtaUsuario);
	exchange.getOut().setHeader("SMensajeTecnico", sMensajeRtaTecnico);
	
	exchange.getOut().setHeader(Exchange.ACCEPT_CONTENT_TYPE, "application/json; charset=UTF-8");
	exchange.getOut().setHeader(Exchange.CONTENT_TYPE, "application/json; charset=UTF-8");
	exchange.getOut().setHeader(CxfConstants.CAMEL_CXF_RS_RESPONSE_CLASS, List.class);
	exchange.getOut().setBody(floRangosRows, List.class);
    }
}
