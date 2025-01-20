package br.com.oracle.one.conversormoedas.entities;

import java.util.HashMap;

public record Currency(String baseCode, HashMap<String, Double> conversionRates) {
}
