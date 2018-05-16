package com.avianca.lifemiles.interceptors;

import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.camel.BeanInject;
import org.apache.cxf.message.Message;
import org.apache.cxf.message.MessageContentsList;
import org.slf4j.Logger;

/**
 * 
 * @author Assert Solutions S.A.S
 *
 */
public class InterceptorLogicImpl implements ExecuteInterceptorLogic {
    
    @BeanInject(value = "loggerRef")
    private static Logger LOG;
    
    @Override
    public void execute(Message message) {
	int seconds = 0;
	if (message.getExchange() != null && message.getExchange().getInMessage() != null) {
	    if (message.getExchange().getInMessage().get("elapsedTime") != null) {
		@SuppressWarnings("rawtypes")
		long elapsedTime = (long) ((List) message.getExchange().getInMessage().get("elapsedTime")).get(0);
		long executionTime = System.currentTimeMillis() - elapsedTime;
		LOG.debug("Execution time was ~" + executionTime + " ms");
		seconds = (int) ((executionTime / 1000) % 60);
	    }
	}
	
	MessageContentsList objs = MessageContentsList.getContentsList(message);
	if (objs == null || objs.size() == 0) {
	    return;
	}
	
	Object responseObj = objs.get(0);
	
	Response response = null;
	if (responseObj instanceof Response) {
	    response = (Response) responseObj;
	    // response for crear pago
	    // if (response.getEntity() instanceof GetRangosResponse) {
	    // GetRangosResponse responseDTO = (GetRangosResponse)
	    // response.getEntity();
	    // if (responseDTO != null &&
	    // responseDTO.getMensajeRespuestaDTO() != null) {
	    // TiempoRespuesta tr =
	    // responseDTO.getMensajeRespuestaDTO().getTiempoRespuesta();
	    // if (tr == null) {
	    // tr = new TiempoRespuesta();
	    // }
	    // tr.setTiempo(String.valueOf(seconds));
	    // tr.setUnidadMedida("s");
	    // responseDTO.getMensajeRespuestaDTO().setTiempoRespuesta(tr);
	    // }
	    // }
	}
    }
    
}
