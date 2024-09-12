package br.com.jhonissonsa.testcodex.config;

import br.com.jhonissonsa.testcodex.service.ClockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WorldClockConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ClockService clockService() {
        return new ClockService(restTemplate());
    }
}
