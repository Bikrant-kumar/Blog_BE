package com.example.blog_be.dao;

import com.example.blog_be.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao extends CrudRepository<Blog,Integer> {

}
