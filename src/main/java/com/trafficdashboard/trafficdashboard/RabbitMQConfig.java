package com.trafficdashboard.trafficdashboard;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RabbitListener(queues = "gps-queue")
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "gps-queue";
    public static final String GPS_DATA_EXCHANGE = "gps-data-exchange";



    @RabbitHandler
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
