package br.com.oracle.one.literalura.service;

public interface IDataService {
    <T> T getData(String json, Class<T> dataClass);
}