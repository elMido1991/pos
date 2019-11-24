package com.pos.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ART_CLIENT")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "PRICE")
	private float price;
	@Column(name = "QUANTITY")
	private float quantity;
	@Column(name = "IMAGE")
	private String image;
}