package com.pruebas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dao.paisesDao;
import com.pruebas.modelos.paises;
import com.pruebas.modelos.tickets;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Paises")
public class paisesRest {
	
	@Autowired
	private paisesDao paisesDao;
	@GetMapping(value="")
	public List<paises> consultar(@RequestParam String nombre) {
		return paisesDao.findAll();
	}
	
	
}
