package br.com.oracle.one.forumhub.model;

import jakarta.validation.constraints.NotBlank;

public record DataPost(Long id,
                       @NotBlank() String title,
                       @NotBlank() String message,
                       @NotBlank() String course) {
    public DataPost(Post post){
        this(post.getId(), post.getTitle(), post.getMessage(), post.getCourse());
    }
}
