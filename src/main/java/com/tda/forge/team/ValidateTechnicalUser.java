package com.tda.forge.team;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ValidateTechnicalUser implements Processor {
	private Logger logger = LoggerFactory.getLogger(ValidateTechnicalUser.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		ProjectDAO user = exchange.getIn().getBody(ProjectDAO.class);
		user.setId(exchange.getIn().getHeader("id", String.class));
		user.setFirstName(user.getId());
		user.setLastName("ForgeTechnicalUser");
	}

}