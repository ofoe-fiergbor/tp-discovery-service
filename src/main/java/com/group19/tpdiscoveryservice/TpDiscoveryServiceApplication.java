package com.group19.tpdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class TpDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpDiscoveryServiceApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}

}
