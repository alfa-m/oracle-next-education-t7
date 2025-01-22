package br.com.oracle.one.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDto {
    private String title;
    private List<AuthorDto> authors;
    private List<String> languages;
    @JsonAlias("download_count")
    private Integer numberDownloads;

    public String getTitle() {
        return title;
    }

    public List<AuthorDto> getAuthors() {
        return authors;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public Integer getNumberDownloads() {
        return numberDownloads;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", languages=" + languages +
                ", numberDownloads=" + numberDownloads +
                '}';
    }
}