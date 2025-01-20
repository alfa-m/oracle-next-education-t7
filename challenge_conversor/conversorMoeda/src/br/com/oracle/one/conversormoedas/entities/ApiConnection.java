package br.com.oracle.one.conversormoedas.entities;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConnection {
    private Dotenv dotenv = Dotenv.load();
    private String apiKey = dotenv.get("EXCHANGE_RATE_API_KEY");

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;
    HttpResponse<String> response;

    public double makeRequest(String originalCurrencyCode, String convertedCurrencyCode) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + originalCurrencyCode;
        request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String conversionRates = response.body();
        Currency currency = gson.fromJson(conversionRates, Currency.class);
        return currency.conversionRates().get(convertedCurrencyCode);
    }

}
