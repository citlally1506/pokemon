package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.modelos.cuenta;

public interface cuentaDao extends JpaRepository<cuenta, String> {

}
