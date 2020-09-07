package com.example.blog_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.blog_be")
public class BlogBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogBeApplication.class, args);
	}

}
