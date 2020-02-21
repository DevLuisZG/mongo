package com.gft.webflux.apirest.app.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.gft.webflux.apirest.app.models.Categoria;

import reactor.core.publisher.Mono;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String>{
	public Mono<Categoria> findByNombre(String nombre);
}
