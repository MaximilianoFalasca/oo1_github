package ar.edu.unlp.info.oo1.ejercicio19;

public class Persona {
	protected String nombre;
	protected String direccion;
	
	public Persona(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
	}
	
	public String getDir() {
		return direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
}
