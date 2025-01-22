package br.com.oracle.one.forumhub.service;

import br.com.oracle.one.forumhub.exceptions.ValidationException;
import br.com.oracle.one.forumhub.model.DataPost;
import br.com.oracle.one.forumhub.model.User;
import br.com.oracle.one.forumhub.repository.IPostRepository;
import br.com.oracle.one.forumhub.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TitleValidator implements IPostValidator {
    @Autowired
    private IPostRepository postRepository;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void validator(DataPost dataPost) {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            throw new AuthenticationCredentialsNotFoundException("Usuário não autenticado");
        }

        Object principal = authentication.getPrincipal();
        if (principal instanceof Optional) {
            Optional<?> optionalPrincipal = (Optional<?>) principal;
            principal = optionalPrincipal.orElseThrow(() -> new ValidationException("Principal não contém um usuário válido: " + optionalPrincipal));
        }

        User user;

        if (principal instanceof User) {
            user = (User) principal;
        } else if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            user = userRepository.findByLogin(username)
                    .orElseThrow(() -> new ValidationException("Usuário não encontrado"));
        } else {
            throw new IllegalStateException("Não foi possível determinar o nome de usuário a partir do principal: " + principal);
        }

        if (!isValid(dataPost, user.getId())) {
            throw new ValidationException("Não é permitida a criação de tópicos repetidos");
        }
    }

    public Boolean isValid(DataPost dataPost, Long idUser) {
        return !postRepository.existsByTituloAndMensagemAndAutorId(dataPost.title(), dataPost.message(), idUser);
    }
}
