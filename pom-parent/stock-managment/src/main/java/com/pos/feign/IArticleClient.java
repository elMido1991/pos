package com.pos.feign; 

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pos.dao.model.dto.ArticleDto;

@FeignClient("articles-registry")
public interface IArticleClient {
	
	@GetMapping( value = "/find/{id}")
    @ResponseBody ArticleDto getArticle(@PathVariable long id);
}
