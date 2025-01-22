package br.com.oracle.one.literalura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchDto {
    private List<BookDto> results;

    public List<BookDto> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "SearchDto{" +
                "results=" + results +
                '}';
    }
}
