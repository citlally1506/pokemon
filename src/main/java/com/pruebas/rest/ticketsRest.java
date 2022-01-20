package com.pruebas.rest;

import java.sql.Date;
import java.text.DateFormat;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.table.TableCellRenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dao.ticketsDao;
import com.pruebas.modelos.tickets;


@RestController
@RequestMapping("/Tickets")
public class ticketsRest {
	@Autowired
	private ticketsDao ticketsDao;
	@GetMapping(value="")
	public List<tickets> consultar(@RequestParam Date CreateDate) {
		return ticketsDao.findAll();
	}
	
}
