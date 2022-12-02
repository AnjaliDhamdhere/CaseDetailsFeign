package com.casedetails.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class FeignClientCaseDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientCaseDetailsApplication.class, args);
	}

}
