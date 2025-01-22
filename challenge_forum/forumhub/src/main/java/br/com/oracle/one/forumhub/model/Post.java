package br.com.oracle.one.forumhub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name = "Post")
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String message;

    @CreationTimestamp
    private LocalDateTime date;

    private Boolean isLogged = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @NotBlank
    private String course;

    public Post(DataPost dataPost, User user) {
        this.title = dataPost.title();
        this.message = dataPost.message();
        this.course = dataPost.course();
        this.isLogged = true;
        this.user = user;
    }

    public void updateInfo(DataPost dataPost) {
        if (dataPost.title() != null){
            this.title = dataPost.title();
        }
        if (dataPost.message() != null){
            this.message = dataPost.message();
        }
        if (dataPost.course() != null){
            this.course = dataPost.course();
        }
    }
}
