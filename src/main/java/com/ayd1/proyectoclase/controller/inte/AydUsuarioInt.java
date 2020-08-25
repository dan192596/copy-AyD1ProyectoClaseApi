package com.ayd1.proyectoclase.controller.inte;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping(path="/aydws/usuarios")
public interface AydUsuarioInt {
	
	@GetMapping(path="/")
	ResponseEntity<?> getUsuarios();
	
}