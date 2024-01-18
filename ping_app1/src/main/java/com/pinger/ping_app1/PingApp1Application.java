package com.pinger.ping_app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PingApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(PingApp1Application.class, args);
    }

}
