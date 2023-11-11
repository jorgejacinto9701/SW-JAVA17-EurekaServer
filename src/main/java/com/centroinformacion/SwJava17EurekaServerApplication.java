package com.centroinformacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwJava17EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwJava17EurekaServerApplication.class, args);
	}

}
