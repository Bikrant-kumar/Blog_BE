package com.example.blog_be.controller;

import com.example.blog_be.model.Blog;
import com.example.blog_be.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping("/addBlog")
    public Blog addBlog( @RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }

    @GetMapping("/blog")
    public List<Blog> findAllBlog(){
        return blogService.getBlog();
    }

    @GetMapping("/blog/{id}")
    public Blog findBlogById(@PathVariable String id){
        return  blogService.getBlogById(id);
   }
//    @PatchMapping("/blog/{id}")
//    public Blog findBlogById(@PathVariable String id){
//        blogService.getBlogById(id);
//        return
//    }
}

