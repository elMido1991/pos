package com.pos;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.pos.dao.model.Article;
import com.pos.dao.model.Categorie;
import com.pos.dao.repository.ArticleRepository;
import com.pos.dao.repository.CategorieRepository;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@EnableFeignClients
public class ArticlesRegistryApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ArticlesRegistryApplication.class, args);
	}

	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Categorie categorie1 = new Categorie(null, "PIZZA", null);
		categorie1 = categorieRepository.saveAndFlush(categorie1);
		
		
		Article article1 = new Article(null, "Pizza 4 Saison", "Pizza 4 Saison", 45, 1, "assets/img/pizza.jpg", categorie1);
		article1 = articleRepository.saveAndFlush(article1);
		Article article2 = new Article(null, "Pizza Viande haché", "Pizza Viande haché", 30, 1, "assets/img/pizza.jpg", categorie1);
		article2 = articleRepository.saveAndFlush(article2);
		Article article3 = new Article(null, "Pizza Thon", "Pizza Thon", 30, 1, "assets/img/pizza.jpg", categorie1);
		article3 = articleRepository.saveAndFlush(article3);
		Article article4 = new Article(null, "Pizza Margarita", "Pizza Margarita", 30, 1, "assets/img/pizza.jpg", categorie1);
		article4 = articleRepository.saveAndFlush(article4);
		Article article5 = new Article(null, "Pizza Napolitaine", "Pizza Napolitaine", 30, 1, "assets/img/pizza.jpg", categorie1);
		article5 = articleRepository.saveAndFlush(article5);
		Article article6 = new Article(null, "Pizza 4 fromages", "Pizza 4 fromages", 30, 1, "assets/img/pizza.jpg", categorie1);
		article6 = articleRepository.saveAndFlush(article6);
		Article article7= new Article(null, "Pizza Marina", "Pizza Marina", 30, 1, "assets/img/pizza.jpg", categorie1);
		article7 = articleRepository.saveAndFlush(article7);
		
		Categorie categorie2 = new Categorie(null, "PASTA", null);
		categorie2 = categorieRepository.saveAndFlush(categorie2);
		
		Article article11 = new Article(null, "Pasta 4 formages", "Pasta 4 formages", 45, 1, "assets/img/spaghetti.jpg", categorie2);
		article11 = articleRepository.saveAndFlush(article11);
		Article article12 = new Article(null, "Pasta au poulet", "Pasta au poulet", 35, 1, "assets/img/spaghetti.jpg", categorie2);
		article12 = articleRepository.saveAndFlush(article12);
		Article article13 = new Article(null, "Spaghetti", "Spaghetti", 35, 1, "assets/img/spaghetti.jpg", categorie2);
		article13 = articleRepository.saveAndFlush(article13);
		Article article14 = new Article(null, "Spaghetti Bolognaise", "Spaghetti Bolognaise", 30, 1, "assets/img/spaghetti.jpg", categorie2);
		article14 = articleRepository.saveAndFlush(article14);
		Article article15 = new Article(null, "Spaghetti Napolitaine", "Spaghetti Napolitaine", 30, 1, "assets/img/spaghetti.jpg", categorie2);
		article15 = articleRepository.saveAndFlush(article15);
		
		Categorie categorie3 = new Categorie(null, "TACOS", null);
		categorie3 = categorieRepository.saveAndFlush(categorie3);
		
		Article article111 = new Article(null, "Tacos Poulet", "Tacos Poulet", 45, 1, "assets/img/tacos.jpg", categorie3);
		article111 = articleRepository.saveAndFlush(article111);
		Article article112 = new Article(null, "Tacos viande H.", "Tacos viande H.", 35, 1, "assets/img/tacos.jpg", categorie3);
		article112 = articleRepository.saveAndFlush(article112);
		Article article113 = new Article(null, "Tacos Mixte", "Tacos Mixte", 35, 1, "assets/img/tacos.jpg", categorie3);
		article113 = articleRepository.saveAndFlush(article113);
		Article article114 = new Article(null, "Tacos Dinde", "Tacos Dinde", 30, 1, "assets/img/tacos.jpg", categorie3);
		article114 = articleRepository.saveAndFlush(article114);
		Article article115 = new Article(null, "Tacos Thon", "Tacos Thon", 30, 1, "assets/img/tacos.jpg", categorie3);
		article115 = articleRepository.saveAndFlush(article115);
		
		
		articleRepository.saveAndFlush(article1);
		articleRepository.saveAndFlush(article2);
		articleRepository.saveAndFlush(article3);
		articleRepository.saveAndFlush(article4);
		articleRepository.saveAndFlush(article5);
		articleRepository.saveAndFlush(article6);
		articleRepository.saveAndFlush(article7);
		
		articleRepository.saveAndFlush(article11);
		articleRepository.saveAndFlush(article12);
		articleRepository.saveAndFlush(article13);
		articleRepository.saveAndFlush(article14);
		articleRepository.saveAndFlush(article15);
		
		articleRepository.saveAndFlush(article111);
		articleRepository.saveAndFlush(article112);
		articleRepository.saveAndFlush(article113);
		articleRepository.saveAndFlush(article114);
		articleRepository.saveAndFlush(article115);
		
	}

}
