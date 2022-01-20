package com.pruebas.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pruebas.dao.cuentaDao;
import com.pruebas.modelos.cuenta;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/cuentas")
public class cuentaRest {
	@Autowired
	private cuentaDao cuentadao;
	@ApiOperation(value="Consulta todas las cuentas disponibles.")
	@GetMapping(value="")
	public List<cuenta> consultar() {
		return cuentadao.findAll();
	}
	@GetMapping(value = "/12")
	@ApiOperation(value="Consulta la cuenta con id 12")
	public String consultarCuentaEsp() {
		return cuentadao.getById("12").getNumCuenta();
	}
	
	@ApiOperation(value="Crea una cuenta.")
	@PostMapping("")
	public void registrar(@RequestBody cuenta cuenta)
	{	
		cuentadao.save(cuenta);
	}
	
	@PutMapping(value = "/12")
	@ApiOperation(value="Actualiza la cuenta con id 12.")
	public void actualizaCuenta(@RequestBody cuenta cuentaAct) {
		String cuentaActualiza = "12";
		cuenta cuentaConsul = new cuenta();
		cuentaConsul = cuentadao.getById(cuentaActualiza);
		cuentadao.delete(cuentaConsul);
		cuentaConsul.setCliente(cuentaAct.getCliente());
		cuentaConsul.setEstatus(cuentaAct.getEstatus());
		cuentadao.save(cuentaConsul);
	}
	
	@PatchMapping(value = "/12")
	@ApiOperation(value="Actualiza parcialmente la cuenta con id 12.")
	public void actualizaCuentaParcialmente(@RequestBody cuenta cuentaAct) {
		String cuentaActualiza = "12";
		cuenta cuentaConsul = new cuenta();
		cuentaConsul = cuentadao.getById(cuentaActualiza);
		cuentaConsul.setEstatus(cuentaAct.getEstatus());
		cuentadao.delete(cuentaConsul);
		cuentadao.save(cuentaConsul);
	}
	@DeleteMapping(value = "/12")
	@ApiOperation(value="Borra la cuenta con id 12.")
	public void EliminaCuenta() {
		cuenta cuentaEli = new cuenta();
		cuentaEli.setNumero("12");
		 cuentadao.delete(cuentaEli);
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value="Pokemon")
	public String consul(@PathVariable String pokemon) {
		return cuentadao.getById(pokemon).getNumCuenta();
	}
}
