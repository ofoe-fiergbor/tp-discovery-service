package com.group19.tpdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TpDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpDiscoveryServiceApplication.class, args);
	}

}
