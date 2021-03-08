package com.applications.restservice.dtos;

public class Producto {

	private Long id;
	private String name;
	private String precio;
	
	public Producto(Long id, String name, String precio) {
		super();
		this.id = id;
		this.name = name;
		this.precio = precio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", precio=" + precio + "]";
	}
	
	
}
