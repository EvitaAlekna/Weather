package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    public double lat;
    public double lon;
    public String timezone;

    @JsonProperty("timezone_offset")
    public int timezoneOffset;
    public Current current;
    private List<Minutely> minutelyList;
    private List<Hourly> hourlyList;
    private List<Daily> dailyList;
    private List<Alert> alertList;

}
