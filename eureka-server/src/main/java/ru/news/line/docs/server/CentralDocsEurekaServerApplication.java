package ru.news.line.docs.server;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CentralDocsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralDocsEurekaServerApplication.class, args);
		System.out.println("Test");
		System.out.println("test2");
		System.out.println("test3");
		System.out.println("test4");
	}
}
