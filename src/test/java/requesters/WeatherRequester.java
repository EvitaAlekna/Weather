package requesters;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import model.weather.WeatherResponse;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicReference;

public class WeatherRequester {
    private final String URL = "http://qaguru.lv:8089/tickets/getWeather.php?id=";

    public WeatherResponse requestWeather(long id) throws JsonProcessingException {
        String url = URL + id;

        //sending request to server
        RestTemplate restTemplate = new RestTemplate();
        String jsonToParse = restTemplate.getForEntity(url, String.class).getBody();

        //Mapping JSON to Objects (Passing data from JSON to Objects)
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonToParse, WeatherResponse.class);

    }
}
