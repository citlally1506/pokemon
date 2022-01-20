package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.modelos.tickets;

public interface ticketsDao extends JpaRepository<tickets, String> {

}
