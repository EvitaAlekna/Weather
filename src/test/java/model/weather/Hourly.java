package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Hourly extends Temp{

    private int dt;

    @JsonProperty("feels_like")
    private double feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty("dew_point")
    private double dewPoint;

    private double uvi;
    private int clouds;
    private int visibility;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_deg")
    private int windDeg;

    @JsonProperty("wind_gust")
    private double windGust;

    private List<Weather> weather;

    private double pop;

}
