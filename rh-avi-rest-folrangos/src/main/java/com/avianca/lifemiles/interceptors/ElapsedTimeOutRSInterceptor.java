package com.avianca.lifemiles.interceptors;

import org.apache.cxf.interceptor.AbstractOutDatabindingInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

/**
 * 
 * @author Daniel Perdomo
 *
 */
public class ElapsedTimeOutRSInterceptor extends AbstractOutDatabindingInterceptor {
    
    private ExecuteInterceptorLogic executionClass;
    
    public ElapsedTimeOutRSInterceptor() {
	super(Phase.MARSHAL);
    }
    
    @Override
    public void handleMessage(Message message) {
	executionClass.execute(message);
    }
    
    public ExecuteInterceptorLogic getExecutionClass() {
	return executionClass;
    }
    
    public void setExecutionClass(ExecuteInterceptorLogic executionClass) {
	this.executionClass = executionClass;
    }
}