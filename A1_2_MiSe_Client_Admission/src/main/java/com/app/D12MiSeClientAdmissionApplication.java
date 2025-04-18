package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class D12MiSeClientAdmissionApplication {

	public static void main(String[] args) {
		System.out.println("This Admission DiscoveryCilent...............");
		SpringApplication.run(D12MiSeClientAdmissionApplication.class, args);
	}

}
