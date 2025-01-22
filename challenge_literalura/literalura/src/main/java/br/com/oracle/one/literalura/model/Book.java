package br.com.oracle.one.literalura.model;

import br.com.oracle.one.literalura.dto.BookDto;
import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String title;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Author author;
    private String language;
    private Integer numberDownloads;

    public Book() {}

    public Book(BookDto bookDto) {
        this.title = bookDto.getTitle();
        this.author = new Author(bookDto.getAuthors().get(0));
        this.language = bookDto.getLanguages().get(0);
        this.numberDownloads = bookDto.getNumberDownloads();
    }

    public Book(String title, Author author, String language, Integer numberDownloads) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.numberDownloads = numberDownloads;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getNumberDownloads() {
        return numberDownloads;
    }

    public void setNumberDownloads(Integer numberDownloads) {
        this.numberDownloads = numberDownloads;
    }

    @Override
    public String toString() {
        return "Livro: " + title + " de " + author + " (" + language + ")";
    }
}