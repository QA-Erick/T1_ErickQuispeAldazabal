package com.dawii.qaerick.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawii.qaerick.models.Comentario;

@Repository
public interface IComentarioRepository extends CrudRepository<Comentario, Integer> {
	public Comentario findByComId(int comId);
}
