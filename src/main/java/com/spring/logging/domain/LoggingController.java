package com.spring.logging.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class LoggingController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/logging")
	public String loggingTest() {
		String name = "Spring Log4j";

		for (int i = 0; i < 10000000; i++) {
			log.trace("TRACE log={}",name);
			log.debug("DEBUG log={}",name);
			log.info("INFO log={}",name);
			log.warn("WARN log={}",name);
			log.error("ERROR log={}",name);
		}

		return "Good Logging";

	}

}
