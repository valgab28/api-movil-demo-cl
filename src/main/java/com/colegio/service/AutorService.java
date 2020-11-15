package com.colegio.service;

import java.util.List;

import com.colegio.entity.Autor;

public interface AutorService {

	public abstract Autor inserta(Autor obj);
	public abstract List<Autor> listaAutor();
}
