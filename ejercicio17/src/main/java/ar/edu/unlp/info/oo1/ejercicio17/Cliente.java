package ar.edu.unlp.info.oo1.ejercicio17;

abstract class Cliente {
	private String nombre,direccion;
	private Integer Identificacion,numero;
	
	public Cliente(String nombre, String direccion, Integer Identificacion,Integer numero) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.Identificacion=Identificacion;
		this.numero=numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
}
