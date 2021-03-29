package com.gt.hrpayroll.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfing {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    //assim criamos um simgleton do restTemplate
}
