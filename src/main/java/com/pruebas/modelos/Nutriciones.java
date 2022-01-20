package com.pruebas.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nutriciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numNutricion;
	@Column
	private int carbohidratos;
	private int proteina;
	private int gordo;
	private int calorias;
	
	public int getCarbohidratos() {
		return carbohidratos;
	}
	public void setCarbohidratos(int carbohidratos) {
		this.carbohidratos = carbohidratos;
	}
	public int getProteina() {
		return proteina;
	}
	public void setProteina(int proteina) {
		this.proteina = proteina;
	}
	public int getGordo() {
		return gordo;
	}
	public void setGordo(int gordo) {
		this.gordo = gordo;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
}
