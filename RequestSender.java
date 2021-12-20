import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class RequestSender {

    private static OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final static String API_KEY = "MoNlRdze3LjiccieHA7GtlalKcBwQR4x";

    static public String sendCityIdRequest(String cityName) throws IOException {

        String citiId;

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", cityName)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String responseJson = response.body().string();

        JsonNode cityIdNode = objectMapper
                .readTree(responseJson)
                .at("/0/Key");

        citiId = cityIdNode.asText();

        return citiId;
    }

    static public String getTempRequest(String cityName) throws IOException {

        String cityId = sendCityIdRequest(cityName);

        HttpUrl httpUrl1 = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(cityId)
                .addQueryParameter("apikey", API_KEY)
                .build();

        Request request1 = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl1)
                .build();

        Response response = okHttpClient.newCall(request1).execute();

        String responseJson = response.body().string();

        JsonNode date = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/1/Date");

        JsonNode tempMin = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/1/Temperature/Minimum/Value");

        JsonNode tempMax = objectMapper
                .readTree(responseJson)
                .at("/DailyForecasts/1/Temperature/Maximum/Value");

        JsonNode text = objectMapper
                .readTree(responseJson)
                .at("/Headline/Text");

        return "Город " + cityName
                + " Дата: " + date
                + " Ожидается: " + text
                + " Минимальная температура: " + tempMin
                + " Максимальная температура: " + tempMax;
    }


}
