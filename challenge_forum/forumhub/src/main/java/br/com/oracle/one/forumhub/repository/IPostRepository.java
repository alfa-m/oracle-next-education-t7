package br.com.oracle.one.forumhub.repository;

import br.com.oracle.one.forumhub.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Post p WHERE p.user.id = :userId AND p.title = :title AND p.message = :message")
    boolean existsByTitleAndMessageAndUser(@Param("title") String title, @Param("message") String message, @Param("userId") Long userId);

    List<Post> findTop10ByOrderByDataAsc();

    @Query("SELECT p FROM Post p WHERE p.course = :course AND EXTRACT(YEAR FROM p.date) = :year")
    List<Post> findByCourseAndYear(@Param("course") String course, @Param("year") int year);
}
