package com.pruebas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.modelos.Fruta;


public interface FrutaDao extends JpaRepository<Fruta, String>{
	
	public  List<Fruta> findByNombre(String nombre);
	
	public List<Fruta> findByFamilia(String familia);
	
	public List<Fruta> findByGenero(String genero);
	
	public List<Fruta> findByOrden(String orden);


}
