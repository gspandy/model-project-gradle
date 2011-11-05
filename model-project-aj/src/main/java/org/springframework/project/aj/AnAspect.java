package org.springframework.project.aj;

import org.apache.log4j.Logger;
import org.springframework.project.core.Core;

// TODO: convert to an actual .aj aspect
public class AnAspect {

	private static final Logger logger = Logger.getLogger(AnAspect.class);

	private final Core core;

	public AnAspect(Core mu) {
		this.core = mu;
		if (logger.isTraceEnabled()) {
			logger.trace("Create " + this);
		}
	}

	public Core getCore() {
		return this.core;
	}
}
