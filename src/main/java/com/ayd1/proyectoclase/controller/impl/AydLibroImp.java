package com.ayd1.proyectoclase.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ayd1.proyectoclase.controller.inte.AydLibroInt;
import com.ayd1.proyectoclase.repository.LibroRep;


@Component
public class AydLibroImp implements AydLibroInt {
	

	@Autowired
	protected LibroRep libroRep;
	
	

	@Override
	public ResponseEntity<?> getUsuarios(String titulo) {
		return new ResponseEntity<>(libroRep.findByTituloContaining(titulo), HttpStatus.OK); 
	}

}
