package br.com.jhonissonsa.testcodex.service;

import br.com.jhonissonsa.testcodex.entity.WorldClockEntity;
import org.springframework.web.client.RestTemplate;

/**
 * 5) Rest Client - World Clock
 * Esse serviço faz a busca na API Client para recuperar as informações de hora.
 *
 * */
public class ClockService {

    private final RestTemplate template;

    public ClockService(RestTemplate template) {
        this.template = template;
    }

    public WorldClockEntity getTime() {
        return template.getForObject(
                "http://worldclockapi.com/api/json/utc/now",
                WorldClockEntity.class
        );
    }
}
