package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Autor;
import com.colegio.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository repository;
	

	@Override
	public Autor inserta(Autor obj) {
		return repository.save(obj);
	}


	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}

}
