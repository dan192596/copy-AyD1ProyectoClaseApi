package com.ayd1.proyectoclase.controller.inte;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path="/aydws/libro")
public interface AydLibroInt {
	
	@GetMapping(path="/titulo/{titulo}")
	ResponseEntity<?> getUsuarios(@PathParam("titulo") String titulo);

}
