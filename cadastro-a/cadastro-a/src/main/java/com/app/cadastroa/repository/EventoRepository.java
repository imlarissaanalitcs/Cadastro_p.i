package com.app.cadastroa.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.cadastroa.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
