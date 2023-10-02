package com.mx.irc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/")
public class DocumentsController {
	
	
	
	@GetMapping("prueba")
	public ResponseEntity<?> prueba() {
		return ResponseEntity.ok("Hola mundo");
	}

}