package com.maddy8381.CarRepairMaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
public class BackendCarRepairMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCarRepairMasterApplication.class, args);
	}

}
