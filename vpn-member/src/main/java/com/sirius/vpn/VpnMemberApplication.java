package com.sirius.vpn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class VpnMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(VpnMemberApplication.class, args);
	}

}
