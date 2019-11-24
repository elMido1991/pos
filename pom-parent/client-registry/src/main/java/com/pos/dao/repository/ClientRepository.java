package com.pos.dao.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.dao.model.Client;

@Transactional
public interface ClientRepository extends JpaRepository<Client, Long> {
		Page<Client> findAll(Pageable pageable);

}
