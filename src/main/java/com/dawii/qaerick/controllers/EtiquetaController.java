package com.dawii.qaerick.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dawii.qaerick.models.Etiqueta;
import com.dawii.qaerick.repositories.IEtiquetaRepository;

@Controller
public class EtiquetaController {
	@Autowired
	private IEtiquetaRepository repository;
	
	public Etiqueta registrarEtiqueta(Etiqueta etiqueta) {
		try {
			return repository.save(etiqueta);
		} catch (Exception e) {
			System.out.println("Error al registrar etiqueta. "+ e.getMessage());
			return null;
		}
	}
	
	public Etiqueta buscarEtiqueta(int id) {
		return repository.findByEtiId(id);
	}
}
