package com.pos.dao.model.mappers.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pos.dao.model.Article;
import com.pos.dao.model.Categorie;
import com.pos.dao.model.dto.ArticleDto;
import com.pos.dao.model.dto.CategorieDto;

@Component
public class CategorieMapper {
	
	@Autowired
	private ArticleMapper articleMapper;
	
	public Categorie mapToEntity(CategorieDto categoriedto) throws Exception {
		Categorie categorie = new Categorie();
		BeanUtils.copyProperties(categoriedto, categorie);
		List<ArticleDto> articleDtos = categoriedto.getArticlesdto();
		List<Article> articles = new ArrayList<>();
		
		articleDtos.forEach(
					x->
					{try { articles.add(articleMapper.mapToEntity(x));} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		 );
		categorie.setArticles(articles);
		return categorie;
	}
	
	
	public CategorieDto mapToDto(Categorie categorie) throws Exception{
		CategorieDto categoriedto = new CategorieDto();
		BeanUtils.copyProperties(categorie, categoriedto);
		List<Article> articles = categorie.getArticles();
		List<ArticleDto> articleDtos = new ArrayList<>();
		
			articles.forEach(
					x->
					{try { articleDtos.add(articleMapper.mapToDto(x));} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		 );
		categoriedto.setArticlesdto(articleDtos);
		return categoriedto;
	}
	
	

}
