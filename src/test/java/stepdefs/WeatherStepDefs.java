package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.weather.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.HashMap;
import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city ID is {long}")
    public void set_city_id(long citiId) {
        this.cityId = citiId;
    }

    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("latitude is  {double}")
    public void latitude_check(double latitude) {
        Assertions.assertEquals(latitude, response.getLat(), "Incorrect latitude!");
    }

    @Then("longitude is {double}")
    public void longitude_check(double longitude) {
        Assertions.assertEquals(longitude, response.getLon(), "Incorrect longitude!");
    }

    @Then("timezone is {string}")
    public void timezone_check(String timezone) {
        Assertions.assertEquals(timezone, response.getTimezone(), "Incorrect timezone!");
    }

    @Then("timezone offset is {long}")
    public void timezone_offset_check(long timezoneOffset) {
        Assertions.assertEquals(timezoneOffset, response.getTimezoneOffset(), "Incorrect offset!");
    }

    @Then("current weather data is")
    public void current_weather_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")), response.getCurrent().getDt(), "Incorrect Dt!");
        Assertions.assertEquals(Long.parseLong(params.get("sunrise")), response.getCurrent().getS(), "Incorrect Sunrise!");
        Assertions.assertEquals(Long.parseLong(params.get("sunset")), response.getCurrent().getSunset(), "Incorrect Sunset!");
        Assertions.assertEquals(Double.parseDouble(params.get("temp")), response.getCurrent().getTemp(), "Incorrect Temp!");

    }
}
