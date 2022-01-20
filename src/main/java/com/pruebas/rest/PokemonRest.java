package com.pruebas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.servicios.PokemonServicios;

@RestController
@RequestMapping("/pokemon")
public class PokemonRest {
	PokemonServicios pokemonServicios;
	@Autowired
	public PokemonRest(PokemonServicios pokemonServi) {
		pokemonServicios = pokemonServi;
	}
	@GetMapping(value="/{nombrePokemon}")
	public String consumirEnPoint(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.imprimirPokemon(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/abilities")
	public String obtenerAbilities(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.obtenerAbilities(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/base_experience")
	public String obtenerBase_experience(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.obtenerBaseExperience(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/held_items")
	public String obtenerHeldItems(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.obtenerHeld_items(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/id")
	public String obtenerID(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.obtenerID(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/name")
	public String obtenerName(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.obtenerName(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/location_area_encounters")
	public String obtenerLocationAreaeEncounters(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicios.obtenerLocationAreaeEncounters(pokemon);
	}

}
