package br.com.jhonissonsa.testcodex.web;

import br.com.jhonissonsa.testcodex.mapper.ClockMapper;
import br.com.jhonissonsa.testcodex.service.ClockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 6) Rest Server - World Clock
 * Esse controller é a porta de entrada da API REST, servindo como servidor da aplicação..
 *
 * */
@RestController
@RequestMapping
public class WorldClockController {

    private final ClockService service;

    public WorldClockController(ClockService service) {
        this.service = service;
    }

    @GetMapping
    public WorldClockResponse getClock() {
        return ClockMapper.toResponse(service.getTime());
    }
}
