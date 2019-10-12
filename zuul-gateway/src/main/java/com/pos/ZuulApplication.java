package com.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		System.out.println("salam");
		SpringApplication.run(ZuulApplication.class, args);
	}

}
