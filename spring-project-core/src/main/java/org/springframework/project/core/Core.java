package org.springframework.project.core;

import org.apache.log4j.Logger;

public class Core {
	private static final Logger logger = Logger.getLogger(Core.class);

	public Core() {
		if (logger.isTraceEnabled()) {
			logger.trace("Create " + this);
		}
	}
}
