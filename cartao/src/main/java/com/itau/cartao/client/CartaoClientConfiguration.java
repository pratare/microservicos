package com.itau.cartao.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartaoClientConfiguration {

    @Bean
    public CartaoClientConfiguration erroDecoder(){
        return new CartaoClientConfiguration();
    }

}
