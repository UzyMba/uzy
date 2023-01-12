package com.example.displayweather;

import Service.LiveWeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WeatherController
{
    public final LiveWeatherService liveWeatherService;
    public String city;

    public WeatherController() {
        this(null);
    }

    public WeatherController(LiveWeatherService liveWeatherService) {

        this.liveWeatherService = liveWeatherService;}
    @GetMapping("/city")
    public String getCurrentWeather(Model model) {
        Model name = model.addAttribute("currentCity", liveWeatherService.getCurrentWeather(city));
        return "city";
    }

    public String index(Model model)
    {
        model.addAttribute("country", new Country());
        return "index";
    }

}