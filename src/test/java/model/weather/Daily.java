package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Daily {
    private long sunrise;
    private long sunset;
    private long moonrise;
    private long moonset;

    @JsonProperty("moon_phase")
    private double moonPhase;

    private Temp temp;
    private FeelsLike feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_deg")
    private int windDeg;

    @JsonProperty("wind_gust")
    private double windGust;

    private List<Weather> weather;

    private int clouds;
    private double pop;
    private double rain;
    private double uvi;


}
