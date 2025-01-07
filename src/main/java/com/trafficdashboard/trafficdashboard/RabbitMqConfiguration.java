package com.trafficdashboard.trafficdashboard;



import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {


    public static final String GPS_DATA_EXCHANGE = "gps-data-exchange";
    public static final String GPS_QUEUE = "gps-queue";
    public static final String ROUTING_KEY_GPS = "gps";

    @Bean
    public Queue queue() {
        return new Queue(GPS_QUEUE);
    }
}
