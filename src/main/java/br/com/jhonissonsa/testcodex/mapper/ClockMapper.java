package br.com.jhonissonsa.testcodex.mapper;

import br.com.jhonissonsa.testcodex.entity.WorldClockEntity;
import br.com.jhonissonsa.testcodex.web.WorldClockResponse;

public class ClockMapper {

    public static WorldClockResponse toResponse(WorldClockEntity entity) {
        return new WorldClockResponse(entity.getCurrentDateTime());
    }
}
