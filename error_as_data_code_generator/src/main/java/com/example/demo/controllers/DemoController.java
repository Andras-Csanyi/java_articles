package com.example.demo.controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.demo.model.ArticleResult;
import com.example.demo.model.ArticleOutput;
import com.example.demo.model.Article;
import com.example.demo.model.SomeError;

@Controller
public class DemoController {
    
    @QueryMapping("getArticlesSuccess")
    public ArticleResult getArticlesSuccess() {
       return ArticleOutput.builder()
        .setArticles(
            List.of(
                Article.builder()
                .setId("1")
                .setName("name1")
                .build(),
                Article.builder()
                .setId("2")
                .setName("name2")
                .build()
            )
        )
        .build();
    }

    @QueryMapping("getArticlesError")
    public ArticleResult getArticlesError() {
        return SomeError.builder()
        .setMessage("error happened")
        .build();
    }


}
