package com.avianca.lifemiles.interceptors;

import org.apache.cxf.message.Message;

/**
 * 
 * @author Daniel Perdomo
 *
 */
public interface ExecuteInterceptorLogic {
    
    /**
     * 
     * @param message
     */
    public void execute(Message message);
    
}
