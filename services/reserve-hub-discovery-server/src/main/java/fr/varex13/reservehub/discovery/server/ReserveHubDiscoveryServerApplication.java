package fr.varex13.reservehub.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReserveHubDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReserveHubDiscoveryServerApplication.class, args);
	}

}
