package com.pos.dao.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
	
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "CATEGORIE")
@Table(name = "ART_CATEGORIE")
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "LIBELLE")
	private String libelle;
	
	@OneToMany(
	        mappedBy = "categorie",
	        orphanRemoval = true,
	        fetch = FetchType.EAGER
	    )
	private List<Article> articles;
}
