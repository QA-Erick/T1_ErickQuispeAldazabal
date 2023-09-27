package com.dawii.qaerick.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Etiqueta")
public class Etiqueta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eti_id")
	private int etiId;
	
	@Column(name = "eti_nom")
	private String etiNom;
	
	@Column(name = "eti_fch")
	private String etiFch;
	
	@ManyToOne
	@JoinColumn(name = "pub_id")
	private Publicacion publicacion;
}
