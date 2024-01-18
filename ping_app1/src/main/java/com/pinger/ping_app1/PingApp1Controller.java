package com.pinger.ping_app1;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class PingApp1Controller {
    public static final String BACKEND_SERVICE_ID = "backend";
    private final RestTemplate restTemplate;
//    private final LoadBalancerClient loadBalancer;
    private final DiscoveryClient discoveryClient;

    @Autowired
    public PingApp1Controller(RestTemplate restTemplate, DiscoveryClient discoveryClient, LoadBalancerClient loadBalancer) {
        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
//        this.loadBalancer = loadBalancer;
    }

    @GetMapping("/ping-app1")
    public String pingApp1() {
        ServiceInstance backendInstance = discoveryClient.getInstances("backend").get(0);
        URI pingUri = backendInstance.getUri().resolve("/ping");
        return restTemplate.getForObject(pingUri, String.class);

//        return loadBalancer.execute(BACKEND_SERVICE_ID, backendInstance -> {
//            URI pingUri = backendInstance.getUri().resolve("/ping");
//            return restTemplate.getForObject(pingUri, String.class) + " " + backendInstance.getInstanceId();
//        });

    }
}
