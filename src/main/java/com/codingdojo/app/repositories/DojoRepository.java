package com.codingdojo.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.app.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}