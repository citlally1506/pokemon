package com.pruebas.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tickets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numTicket;
	@Column
	private String descripcion;
	private String createDate;
	public String getNumTicket() {
		return numTicket;
	}
	public void setNumTicket(String numTicket) {
		this.numTicket = numTicket;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
}
