package br.com.oracle.one.conversormoedas.entities;

import java.io.IOException;

public class Converter {
    private double originalValue;
    private double convertedValue;
    private double conversionRate;
    private ApiConnection apiConnection = new ApiConnection();

    public double convertValue(double value, String originalCurrency, String convertedCurrency) throws IOException, InterruptedException {
        originalValue = value;
        conversionRate = apiConnection.makeRequest(originalCurrency, convertedCurrency);
        convertedValue = value * conversionRate;
        return convertedValue;
    }

}
