package com.example.blog_be.dao;

import com.example.blog_be.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends CrudRepository<Comment,Integer> {

    @Query(value = "select comment.comment_desc, comment.comment_id  from comment where comment.blog_id =1", nativeQuery = true)
    List<Comment> findCommentByBlogId();
}
