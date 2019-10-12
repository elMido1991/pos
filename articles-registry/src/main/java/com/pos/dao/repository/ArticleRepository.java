package com.pos.dao.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.dao.model.Article;

@Transactional
public interface ArticleRepository extends JpaRepository<Article, Long> {
		Page<Article> findAll(Pageable pageable);

}
