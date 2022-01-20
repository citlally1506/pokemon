package com.pruebas.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fruta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column
	private String nombre;
	private String familia;
	private String genero;
	private String orden;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idNutricion",foreignKey = @ForeignKey(name="idNutricion_fk"))
	private Nutriciones nutriciones;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}
	public Nutriciones getNutriciones() {
		return nutriciones;
	}
	public void setNutriciones(Nutriciones nutriciones) {
		this.nutriciones = nutriciones;
	}
	
	

}
