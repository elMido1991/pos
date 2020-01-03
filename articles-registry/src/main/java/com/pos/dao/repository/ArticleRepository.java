package com.pos.dao.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pos.dao.model.Article;

@Transactional
public interface ArticleRepository extends JpaRepository<Article, Long> {
		Page<Article> findAll(Pageable pageable);
		@Query("select a from Article a where a.categorie.id like ?1")
		List<Article> findArticleByCategorie(long id);

}
