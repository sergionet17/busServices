package com.avianca.lifemiles.interceptors;

import java.util.Arrays;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * 
 * @author Daniel Perdomo
 *
 */
public class ElapsedTimeInInterceptor extends AbstractPhaseInterceptor<Message> {
    
    public ElapsedTimeInInterceptor() {
	super(Phase.RECEIVE);
    }
    
    @Override
    public void handleMessage(Message msg) throws Fault {
	long elapsedTime = (long) System.currentTimeMillis();
	msg.getExchange().getInMessage().put("elapsedTime", Arrays.asList(elapsedTime));
    }
}