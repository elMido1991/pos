package com.pos.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.dao.model.Localisation;

public interface ILocalisationRepository  extends JpaRepository<Localisation, Long>  {

}
