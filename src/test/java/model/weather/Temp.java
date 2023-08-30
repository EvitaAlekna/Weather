package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Temp extends WeatherDetails {
    private double temp;

    @JsonProperty("feels_like")
    private double feelLike;

    private long visibility;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelLike() {
        return feelLike;
    }

    public void setFeelLike(double feelLike) {
        this.feelLike = feelLike;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }
}
