package br.com.oracle.one.forumhub.dto;

import br.com.oracle.one.forumhub.model.Post;

import java.time.LocalDateTime;

public record DataPostDto(String title,
                          String message,
                          Long idUser,
                          String course,
                          LocalDateTime date,
                          Boolean isLogged) {
    public DataPostDto(Post post){
        this(post.getTitle(), post.getMessage(), post.getUser().getId(), post.getCourse(), post.getDate() ,post.getIsLogged());
    }
}
