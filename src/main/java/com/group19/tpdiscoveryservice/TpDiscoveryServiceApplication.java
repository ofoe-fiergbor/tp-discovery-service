package com.group19.tpdiscoveryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
public class TpDiscoveryServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TpDiscoveryServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("running.....");
	}
}
