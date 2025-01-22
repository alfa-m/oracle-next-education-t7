package br.com.oracle.one.forumhub.repository;

import br.com.oracle.one.forumhub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByLogin(String login);
}
