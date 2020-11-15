package com.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

	
}
