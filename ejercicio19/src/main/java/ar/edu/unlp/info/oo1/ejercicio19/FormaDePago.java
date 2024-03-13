package ar.edu.unlp.info.oo1.ejercicio19;

abstract class FormaDePago {
	protected String nombre;
	
	public FormaDePago(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	abstract double getPorcentajeIncremento();
}
