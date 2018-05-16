package com.avianca.lifemiles.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RedeliveryProcessor implements Processor {
    
    private static final Logger LOG = LoggerFactory.getLogger(RedeliveryProcessor.class);
    
    @Override
    public void process(Exchange exchange) throws Exception {
	LOG.info("Exception: " + exchange.getProperty(Exchange.EXCEPTION_CAUGHT));
    }
    
}
