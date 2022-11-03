package com.mapa;

public class Persona {

	int id;
	String nombre;
	int edad;
	String telefono;
	
	public Persona() {
		super();
	}

	public Persona(int id, String nombre, int edad, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
}
