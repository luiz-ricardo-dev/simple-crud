package com.campos.simplecrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campos.simplecrud.model.Estudante;

public interface EstudanteRepositorio extends JpaRepository<Estudante, Long> {
	List<Estudante> findByNomeContainingIgnoreCase(String nome);
}
