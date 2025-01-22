package br.com.oracle.one.forumhub.model;

import java.time.LocalDateTime;

public record ExpandedDataPost(Long id, String title, String message, LocalDateTime date, Long idUser, String course) {
    public ExpandedDataPost(Post post){
        this(post.getId(), post.getTitle(), post.getMessage(),
                post.getDate(), post.getUser().getId(), post.getCourse());
    }
}
