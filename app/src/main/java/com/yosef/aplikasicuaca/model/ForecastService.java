package com.yosef.aplikasicuaca.model;

import com.yosef.aplikasicuaca.BuildConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ForecastService {
    @GET("forecast/daily?appid=" + BuildConfig.API_KEY)
    Call<Forecast> getForecast(@Query("q") String query, @Query("units") String unit, @Query("cnt") String cnt);
}
