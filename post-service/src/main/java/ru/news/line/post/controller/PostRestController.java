package ru.news.line.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.news.line.post.exception.PostNotFoundException;
import ru.news.line.post.model.Post;
import ru.news.line.post.repository.PostDAO;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/post")
public class PostRestController {

    @Autowired
    PostDAO postDAO;

    final static String ERROR_GET_POST = "No such post with id = ";


    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Integer id){
        return postDAO.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new PostNotFoundException(ERROR_GET_POST + String.valueOf(id)));
    }

    @PostMapping
    public ResponseEntity<Integer> savePost(@Valid @RequestBody Post post){
        return ResponseEntity.ok().body(postDAO.save(post).getId());
    }

    @PutMapping
    public ResponseEntity<Post> updatePost(@RequestBody @Valid Post post){
        final Post updatePost = postDAO.save(post);
        return ResponseEntity.ok(updatePost);
    }
}
