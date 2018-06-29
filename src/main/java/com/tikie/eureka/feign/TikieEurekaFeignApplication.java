package com.tikie.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class TikieEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(TikieEurekaFeignApplication.class, args);
	}
}
