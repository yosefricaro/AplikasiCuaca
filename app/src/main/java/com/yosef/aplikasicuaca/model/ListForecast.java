package com.yosef.aplikasicuaca.model;

import java.util.List;

public class ListForecast {
    private Temp temp;
    private String pressure;
    private String humidity;
    private List<Weather> weather;

    public Temp getTemp() {
        return temp;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public List<Weather> getWeather() {
        return weather;
    }
}
