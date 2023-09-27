package com.dawii.qaerick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawii.qaerick.models.Etiqueta;


@Repository
public interface IEtiquetaRepository extends CrudRepository<Etiqueta, Integer> {
	public Etiqueta findByEtiId(int etiId);
}
