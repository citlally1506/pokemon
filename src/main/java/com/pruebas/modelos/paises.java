package com.pruebas.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class paises {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String paisID;
	@Column
	private String nombre;
	
	public String getPaisID() {
		return paisID;
	}
	public void setPaisID(String paisID) {
		this.paisID = paisID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
