package br.com.oracle.one.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataService implements IDataService {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> dataClass) {
        try {
            return mapper.readValue(json, dataClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}