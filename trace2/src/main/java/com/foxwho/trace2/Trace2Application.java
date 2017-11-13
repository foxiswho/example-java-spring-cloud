package com.foxwho.trace2;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {

	private final Logger logger = Logger.getLogger(getClass());

	@RequestMapping(value = "/trace-2", method = RequestMethod.GET)
	public String trace() {
		logger.info("===<call trace-2, TraceId={}, SpanId={}>===");
		return "Trace";
	}

//	public String trace(HttpServletRequest request) {
//		logger.info("===<call trace-2, TraceId={}, SpanId={}>===",
//				request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
//		return "Trace";
//	}

	public static void main(String[] args) {
		SpringApplication.run(Trace2Application.class, args);
	}
}
