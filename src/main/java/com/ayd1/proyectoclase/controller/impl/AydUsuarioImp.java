package com.ayd1.proyectoclase.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ayd1.proyectoclase.controller.inte.AydUsuarioInt;
import com.ayd1.proyectoclase.repository.UsuarioRep;

@Component
public class AydUsuarioImp implements AydUsuarioInt{
	
	@Autowired
	protected UsuarioRep usuarioRep;

	@Override
	public ResponseEntity<?> getUsuarios() {
		return new ResponseEntity<>(usuarioRep.findAll(), HttpStatus.OK);
	}

}
