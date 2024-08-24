package com.architech.product_catalog_service.v1.controller;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ProductCatalogController {
    
    private final DiscoveryClient discoveryClient;
    private final RestClient restClient;

    public ProductCatalogController(DiscoveryClient discoveryClient, RestClient.Builder restClientBuilder) {
        this.discoveryClient = discoveryClient;
        restClient = restClientBuilder.build();
    }

    @GetMapping("helloEureka")
    public String helloWorld() {
        ServiceInstance serviceInstance = discoveryClient.getInstances("user").get(0);
        return restClient.get()
          .uri(serviceInstance.getUri() + "/helloWorld").retrieve().body(String.class);
    }
}
