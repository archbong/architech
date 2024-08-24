package com.architech.architech_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ArchitechCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchitechCloudApplication.class, args);
	}

}
