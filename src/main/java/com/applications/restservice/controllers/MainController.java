package com.applications.restservice.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.applications.restservice.dtos.Producto;

@RestController("/productos")
public class MainController {

	@GetMapping("/{id}")
	public Producto obtenerProducto(@PathParam(value = "id") Long id) {
		return new Producto(id, "Papas", "2000");	
	}
	
	@PostMapping
	public String ingresarProducto(@RequestParam Producto producto) {
		return "Producto ingresado con éxito";	
	}
}
