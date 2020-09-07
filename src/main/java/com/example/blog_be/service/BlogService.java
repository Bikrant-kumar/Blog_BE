package com.example.blog_be.service;

import com.example.blog_be.dao.BlogDao;
import com.example.blog_be.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;

    public Blog saveBlog(Blog blog){
        return blogDao.save(blog);
    }
    public List<Blog> getBlog(){
        return (List<Blog>) blogDao.findAll();
    }
    public Blog getBlogById(String id){
        return blogDao.findById(Integer.valueOf(id)).orElse(null);
    }
}
