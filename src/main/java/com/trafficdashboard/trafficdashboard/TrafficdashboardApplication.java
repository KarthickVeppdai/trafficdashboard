package com.trafficdashboard.trafficdashboard;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class TrafficdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrafficdashboardApplication.class, args);
	}

}
