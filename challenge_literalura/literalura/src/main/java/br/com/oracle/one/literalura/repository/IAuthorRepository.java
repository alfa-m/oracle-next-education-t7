package br.com.oracle.one.literalura.repository;

import br.com.oracle.one.literalura.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByBirthYearIsBefore(Integer year);
    @Query("SELECT a FROM Author a WHERE a.birthYear <= :year AND (a.deathYear IS NULL OR a.deathYear >= :year)")
    List<Author> findAllByAno(Integer year);
}
