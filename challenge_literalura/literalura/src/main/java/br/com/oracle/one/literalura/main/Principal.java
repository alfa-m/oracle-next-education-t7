package br.com.oracle.one.literalura.main;

import br.com.oracle.one.literalura.dto.BookDto;
import br.com.oracle.one.literalura.dto.SearchDto;
import br.com.oracle.one.literalura.model.*;
import br.com.oracle.one.literalura.repository.IAuthorRepository;
import br.com.oracle.one.literalura.repository.IBookRepository;
import br.com.oracle.one.literalura.service.ApiService;
import br.com.oracle.one.literalura.service.DataService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private ApiService apiService = new ApiService();
    private DataService dataService = new DataService();
    private final String URL_STR = "https://gutendex.com/books/?search=";

    private IBookRepository bookRepository;
    private List<Book> bookList = new ArrayList<>();

    private IAuthorRepository authorRepository;
    private List<Author> authorList = new ArrayList<>();

    public Principal(IBookRepository bookRepository, IAuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public void showMenu() throws IOException, InterruptedException {
        System.out.println("Bem-vindo(a) ao LiterAlura!");
        String option = "-1";
        while (!option.equals("0")) {
            String menu = """
                    ********************************************************
                    1 - Buscar livro pelo título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado ano
                    5 - Listar livros em um determinado idioma
                    0 - Sair
                    ********************************************************
                    """;

            System.out.println(menu);
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    searchBookWeb();
                    break;
                case "2":
                    listBooks();
                    break;
                case "3":
                    listAuthors();
                    break;
                case "4":
                    listAuthorByYear();
                    break;
                case "5":
                    listBookByLanguage();
                    break;
                case "0":
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void searchBookWeb() throws IOException, InterruptedException {
        SearchDto searchDto = getBookGutendex();

        if (searchDto.getResults() != null && !searchDto.getResults().isEmpty()) {
            BookDto bookDto = searchDto.getResults().get(0);
            Book book = new Book(bookDto);
            bookRepository.save(book);
        } else {
            System.out.println("Nenhum livro com correspondência encontrado");
        }

    }

    private SearchDto getBookGutendex() throws IOException, InterruptedException {
        System.out.println("Qual livro que deseja buscar? ");
        String bookName = scanner.nextLine();
        String json = apiService.getApiData(URL_STR + bookName.replace(" ", "+"));
        SearchDto searchDto = dataService.getData(json, SearchDto.class);
        return searchDto;
    }

    private void listBooks() {
        bookList = bookRepository.findAll();

        if (bookList.isEmpty()) {
            System.out.println("Nenhum livro registrado até o momento");
        } else {
            bookList.forEach(System.out::println);
        }
    }

    private void listAuthors() {
        authorList = authorRepository.findAll();

        if (authorList.isEmpty()) {
            System.out.println("Nenhum autor registrado até o momento");
        } else {
            authorList.forEach(System.out::println);
        }
    }

    private void listAuthorByYear() {
        System.out.println("Qual ano você deseja pesquisar? ");
        int year = scanner.nextInt();
        authorList = authorRepository.findAllByAno(year);

        if (authorList.isEmpty()) {
            System.out.println("Nenhum autor com correspondência");
        } else {
            authorList.forEach(System.out::println);
        }    }

    private void listBookByLanguage() {
        System.out.println("""
                        Em qual idioma você deseja pesquisar?
                        pt - português
                        es - espanhol
                        fr - francês
                        en - inglês
                        """);
        String language = scanner.nextLine();
        bookList = bookRepository.findByLanguage(language);

        if (bookList.isEmpty()) {
            System.out.println("Nenhum livro encontrado com o idioma selecionado");
        } else {
            bookList.forEach(System.out::println);
        }
    }
}
