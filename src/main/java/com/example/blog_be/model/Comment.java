package com.example.blog_be.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Comment")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="comment_id")
    private int comment_id;

    @Column(name="comment_desc",length=225,nullable = false)
    private String comment_desc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="blog_id", referencedColumnName = "blog_id", nullable = false)
    private Blog blog;

    @Column(name="user_id",length = 45,nullable = false)
    private String user_id;
}
