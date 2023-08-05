package com.kimcheese.kimchicloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KimchiCloudApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(KimchiCloudApigatewayApplication.class, args);
	}

}
