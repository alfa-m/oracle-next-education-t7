package br.com.oracle.one.forumhub.service;

import br.com.oracle.one.forumhub.dto.DataPostDto;
import br.com.oracle.one.forumhub.exceptions.ValidationException;
import br.com.oracle.one.forumhub.model.DataPost;
import br.com.oracle.one.forumhub.model.ExpandedDataPost;
import br.com.oracle.one.forumhub.model.Post;
import br.com.oracle.one.forumhub.model.User;
import br.com.oracle.one.forumhub.repository.IPostRepository;
import br.com.oracle.one.forumhub.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private IPostRepository postRepository;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private List<IPostValidator> validator;

    @Autowired
    private AuthenticationLogin authenticationLogin;


    public ExpandedDataPost post(DataPost dataPost) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            throw new AuthenticationCredentialsNotFoundException("Usuário não autenticado");
        }

        Object principal = authentication.getPrincipal();
        if (principal instanceof Optional) {
            Optional<?> optionalPrincipal = (Optional<?>) principal;
            System.out.println("Conteúdo do Optional principal: " + optionalPrincipal);
        }

        User user;

        if (principal instanceof Optional) {
            Optional<?> optionalPrincipal = (Optional<?>) principal;
            if (optionalPrincipal.isPresent() && optionalPrincipal.get() instanceof User) {
                user = (User) optionalPrincipal.get();
            } else {
                throw new IllegalStateException("Principal não contém um usuário válido: " + optionalPrincipal);
            }
        } else if (principal instanceof User) {
            user = (User) principal;
        } else if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            user = userRepository.findByLogin(username)
                    .orElseThrow(() -> new ValidationException("Usuário não encontrado"));
        } else {
            throw new IllegalStateException("Não foi possível determinar o nome de usuário a partir do principal: " + principal);
        }

        validator.forEach(v -> v.validator(dataPost));
        var post = new Post(dataPost, user);
        postRepository.save(post);

        return new ExpandedDataPost(post);
    }

    public List<Post> searchPostByCourseAndYear(String course, int year){
        return postRepository.findByCourseAndYear(course, year);
    }

    public DataPostDto searchById(Long id) {
        var postId = postRepository.getReferenceById(id);

        if (postId == null){
            throw new ValidationException("Essa postagem não existe");
        }
        return new DataPostDto(postId);
    }

    public DataPost updateTopic(DataPost dataPost) {
        var post = postRepository.getReferenceById(dataPost.id());
        if (post == null){
            throw new ValidationException("Essa postagem não existe");
        }

        validator.forEach(v -> v.validator(dataPost));
        post.updateInfo(dataPost);

        return new DataPost(post);
    }

    public void deleteTopic(Long id) {
        var result = postRepository.findById(id);
        if (!result.isPresent()){
            throw new ValidationException("Id não encontrada");
        }

        postRepository.deleteById(id);
    }
}
