package com.dh.eurekaserveraula01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// a @ serve para informar ao spring que estamos utilizando o eureka
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerAula01Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAula01Application.class, args);
	}

}
