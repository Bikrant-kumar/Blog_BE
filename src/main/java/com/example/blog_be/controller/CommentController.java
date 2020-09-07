package com.example.blog_be.controller;

import com.example.blog_be.model.Comment;
import com.example.blog_be.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/addComment")
    public Comment addComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/comment")
    public List<Comment> findAllComment(){
        return commentService.getComment();
    }

    @GetMapping("/comment/")
    public List<Comment> findAllCommentByBlogId(){
        return commentService.getCommentByBlogId();
    }


}
