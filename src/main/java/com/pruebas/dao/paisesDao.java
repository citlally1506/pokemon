package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.modelos.paises;

public interface paisesDao extends JpaRepository<paises, String> {

}
