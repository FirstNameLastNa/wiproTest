package com.wipro.startapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EntityScan(basePackages= {"com.wipro.model"})
@EnableJpaRepositories(basePackages="com.wipro.repository")
@ComponentScan(basePackages = { "com.wipro.employeecontroller","com.wipro.service","com.wipro.serviceimpl"} )


public class StartApplicationTest {

	public static void main(String[] args) {

		SpringApplication.run(StartApplicationTest.class, args);
	}

}
