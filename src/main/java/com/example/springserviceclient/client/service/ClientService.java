package com.example.springserviceclient.client.service;

import com.example.springserviceclient.service.ProductService;
import com.example.springserviceclient.service.ProductServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Bean
    public ProductService productService(){
        ProductServiceService productServiceService = new ProductServiceService();
        return  productServiceService.getProductServicePort();
    }
}
