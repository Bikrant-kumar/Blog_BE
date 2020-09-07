package com.example.blog_be.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Blog")
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "blog_id")
    private int blog_id;

    @Column(name="blog_title", length=45,nullable = false)
    private String blog_title;

    @Column(name="blog_desc", length=225, nullable = false)
    private String blog_desc;

    @Column(name="created_on" )
    @Temporal(TemporalType.DATE)
    private Date created_on;

    @Column(name="clap")
    private int clap;

    @Column(name="user_id",length = 45,nullable = false)
    private String user_id;

}
