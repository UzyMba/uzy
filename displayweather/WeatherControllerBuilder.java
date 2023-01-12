package com.example.displayweather;

import Service.LiveWeatherService;

public class WeatherControllerBuilder {
    private LiveWeatherService liveWeatherService;

    public WeatherControllerBuilder setLiveWeatherService(LiveWeatherService liveWeatherService) {
        this.liveWeatherService = liveWeatherService;
        return this;
    }

    public WeatherController createWeatherController() {
        return new WeatherController(liveWeatherService);
    }
}