package com.pruebas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dao.FrutaDao;
import com.pruebas.modelos.Fruta;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/fruit")
public class FrutaRest {
	@Autowired
	private FrutaDao frutaDao;
	
	@ApiOperation(value="Consulta las frutas disponibles")
	@GetMapping(value="/all")
	public List<Fruta> consultar() {
		return frutaDao.findAll();
	}
	
	@ApiOperation(value="Seleccionar caracteristicas de la fruta")
	@GetMapping(value="/{nombreFruta}")
	public  List<Fruta> seleccionarFruta(@PathVariable("nombreFruta") String nombre) {
		return frutaDao.findByNombre(nombre);
	}
	
	@ApiOperation(value="Consulta las frutas por familia")
	@GetMapping(value="/family/{family}")
	public List<Fruta> consultaFrutaByFam(@PathVariable("family") String familia) {
		return frutaDao.findByFamilia(familia);
	}
	
	@ApiOperation(value="Consulta las frutas por genero")
	@GetMapping(value="/genus/{genus}")
	public List<Fruta> consultaFrutaByGenero(@PathVariable("genus") String genero) {
		return frutaDao.findByGenero(genero);
	}
	
	@ApiOperation(value="Consulta las frutas por orden")
	@GetMapping(value="/order/{order}")
	public List<Fruta> consultaFrutaBy(@PathVariable("order") String orden) {
		return frutaDao.findByOrden(orden);
	}


}
