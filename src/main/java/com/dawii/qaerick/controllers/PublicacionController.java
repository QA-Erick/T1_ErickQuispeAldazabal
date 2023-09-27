package com.dawii.qaerick.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dawii.qaerick.models.Publicacion;
import com.dawii.qaerick.repositories.IPublicacionRepository;

@Controller
public class PublicacionController {
	@Autowired
	private IPublicacionRepository repository;
	
	public Publicacion registrarPublicacion(Publicacion publicacion) {
		try {
			return repository.save(publicacion);
		} catch (Exception e) {
			System.out.println("Error al registrar publicacion. "+ e.getMessage());
			return null;
		}
	}
	
	public Publicacion buscarPublicacion(int id) {
		return repository.findByPubId(id);
	}
}
