package com.yosef.aplikasicuaca.model;

import java.util.List;

public class Forecast {
    private City City;
    private List<ListForecast> list;

    public com.yosef.aplikasicuaca.model.City getCity() {
        return City;
    }

    public List<ListForecast> getList() {
        return list;
    }
}
