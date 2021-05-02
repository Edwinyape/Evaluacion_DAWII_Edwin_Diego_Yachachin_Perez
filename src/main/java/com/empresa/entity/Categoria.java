package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Column(name = "cod_categoria")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_categoria;
	
	@Column(name = "nom_categoria")
	private String nom_categoria;

	public int getCod_categoria() {
		return cod_categoria;
	}

	public void setCod_categoria(int cod_categoria) {
		this.cod_categoria = cod_categoria;
	}

	public String getNom_categoria() {
		return nom_categoria;
	}

	public void setNom_categoria(String nom_categoria) {
		this.nom_categoria = nom_categoria;
	}
	
	
}
