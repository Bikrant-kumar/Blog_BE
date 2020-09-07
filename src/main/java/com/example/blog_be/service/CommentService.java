package com.example.blog_be.service;

import com.example.blog_be.dao.CommentDao;
import com.example.blog_be.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;

    public Comment saveComment(Comment comment){
        return commentDao.save(comment);
    }
    public List<Comment> getComment() {
        return (List<Comment>) commentDao.findAll();
    }

    public List<Comment> getCommentByBlogId(){
        return (List<Comment>) commentDao.findCommentByBlogId();
    }
}
