package com.dawii.qaerick.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dawii.qaerick.models.Comentario;
import com.dawii.qaerick.repositories.IComentarioRepository;

@Controller
public class ComentarioController {
	@Autowired
	private IComentarioRepository repository;
	
	public Comentario registrarComentario(Comentario comentario) {
		try {
			return repository.save(comentario);
		} catch (Exception e) {
			System.out.println("Error al registrar comentario. "+ e.getMessage());
			return null;
		}
	}
	
	public Comentario buscarComentario(int id) {
		return repository.findByComId(id);
	}
}
