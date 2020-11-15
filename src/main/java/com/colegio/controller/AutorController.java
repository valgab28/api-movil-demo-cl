package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Autor;
import com.colegio.service.AutorService;

@RestController
@RequestMapping("/api/rest/autor/")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@PostMapping
	public ResponseEntity<Autor> inserta(@RequestBody Autor obj){
		return ResponseEntity.ok(service.inserta(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<Autor>> lista() {
		return ResponseEntity.ok(service.listaAutor());
	}
	
}



