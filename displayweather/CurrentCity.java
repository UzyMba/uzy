package com.example.displayweather;

import java.io.Serializable;
import java.math.BigDecimal;



public class CurrentCity implements Serializable {
    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;


    public CurrentCity(String clear, BigDecimal one, BigDecimal zero, BigDecimal ten) {
        this.description = clear;
        this.temperature = one;
        this.feelsLike = zero;
        this.windSpeed = ten;


    }
    public void getDescription (String clear){
        this.description = clear;
    }
    public void getTemperature (BigDecimal one){
        this.temperature = one;
    }
    public void getFeelsLike (BigDecimal zero){
        this.feelsLike = zero;
    }
    public void getWindSpeed (BigDecimal ten){
        this.windSpeed = ten;
    }
}