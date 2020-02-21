package com.gft.webflux.apirest.app.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.gft.webflux.apirest.app.models.Producto;

import reactor.core.publisher.Mono;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String>{
	public Mono<Producto> findByNombre(String nombre);
	@Query("{ 'nombre': ?0 }")
	public Mono<Producto> obtenerPorNombre(String nombre);
}
