package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaJuridica extends Cliente{
	private String tipoPersonaJuridica;
	
	public PersonaJuridica(String nombre, String direccion, Integer CUIT, String tipo, Integer numero) {
		super(nombre,direccion,CUIT,numero);
		this.tipoPersonaJuridica=tipo;
	}
}
