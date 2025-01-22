package br.com.oracle.one.literalura.repository;

import br.com.oracle.one.literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book, Long> {
    List<Book> findByLanguage(String language);
}
