package com.dawii.qaerick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawii.qaerick.models.Publicacion;

@Repository
public interface IPublicacionRepository extends CrudRepository<Publicacion, Integer> {
	public Publicacion findByPubId(int pubId);
}
