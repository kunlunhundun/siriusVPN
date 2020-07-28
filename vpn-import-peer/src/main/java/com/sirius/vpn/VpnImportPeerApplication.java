package com.sirius.vpn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sirius.vpn")
public class VpnImportPeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VpnImportPeerApplication.class, args);
	}

}
