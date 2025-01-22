package br.com.oracle.one.forumhub.controller;

import br.com.oracle.one.forumhub.dto.DataPostDto;
import br.com.oracle.one.forumhub.model.DataPost;
import br.com.oracle.one.forumhub.model.ExpandedDataPost;
import br.com.oracle.one.forumhub.repository.IPostRepository;
import br.com.oracle.one.forumhub.service.PostService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/topics")
@RestController
@SecurityRequirement(name = "bearer-key")
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private IPostRepository postRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<ExpandedDataPost> createTopic(@RequestBody @Valid DataPost dataPost) {
        ExpandedDataPost expandedDataPost = postService.post(dataPost);
        return ResponseEntity.ok(expandedDataPost);
    }

    @GetMapping
    public ResponseEntity<Page<DataPostDto>> listPosts(@PageableDefault(size = 10, sort = "data") Pageable pageable){
        var result = postRepository.findAll(pageable)
                .map(DataPostDto::new);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/top10")
    public ResponseEntity<List<DataPostDto>> top10Topic(){
        var result = postRepository.findTop10ByOrderByDataAsc()
                .stream().map(DataPostDto::new)
                .toList();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/buscar-ano-data")
    public ResponseEntity<List<DataPostDto>> searchTopicByCriteria(@RequestParam String course, @RequestParam int year){
        List<DataPostDto> postagens = postService.searchPostByCourseAndYear(course, year)
                .stream()
                .map(DataPostDto::new)
                .toList();

        return ResponseEntity.ok(postagens);
    }


    @GetMapping("/{id}")
    public ResponseEntity specificTopic(@PathVariable Long id){
        var result = postService.searchById(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateTopic(@RequestBody @Valid DataPost dataPost){
        var result = postService.updateTopic(dataPost);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){
        postService.deleteTopic(id);
        return ResponseEntity.noContent().build();
    }

}
