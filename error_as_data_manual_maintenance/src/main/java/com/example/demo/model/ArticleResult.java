package com.example.demo.model;


@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, property = "__typename")
@com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver(com.example.demo.model.GraphqlJacksonTypeIdResolver.class)
public interface ArticleResult {

}
