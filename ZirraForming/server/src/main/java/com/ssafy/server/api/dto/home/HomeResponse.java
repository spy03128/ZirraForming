package com.ssafy.server.api.dto.home;

import lombok.Getter;

@Getter
public class HomeResponse {
    private Co2Dto co2;
    private SurfaceTemperatureDto temperature;

    public HomeResponse(Co2Dto co2, SurfaceTemperatureDto surfaceTemperatureDto) {
        this.co2 = co2;
        this.temperature = surfaceTemperatureDto;
    }
}