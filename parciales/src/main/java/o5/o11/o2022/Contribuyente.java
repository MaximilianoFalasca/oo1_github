package o5.o11.o2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	private String nombre,email,localidad;
	private Integer dni;
	private List<Bien> bienes;
	
	public Contribuyente(String nombre,Integer dni,String email,String localidad) {
		this.dni=dni;
		this.email=email;
		this.localidad=localidad;
		this.nombre=nombre;
		bienes=new ArrayList<Bien>();
	}
	
	public Bien altaInmueble(Integer numero,Double valorLote,Double valorEdificacion) {
		Bien bien = new Inmueble(numero,valorLote,valorEdificacion);
		bienes.add(bien);
		return bien;
	}
	
	public Bien altaAutomotor(String patente,String marca,String modelo,LocalDate fechaFabricacion,Double valor) {
		Bien bien = new Automotor(patente,marca,modelo,fechaFabricacion,valor);
		bienes.add(bien);
		return bien;
	}
	
	public Bien altaEmbarcacion(String patente,String nombre,LocalDate fechaFabricacion,Double valor) {
		Bien bien = new Embarcacion(patente,nombre,fechaFabricacion,valor);
		bienes.add(bien);
		return bien;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public Double calcularImpuesto() {
		return bienes.stream().mapToDouble(bien->bien.getImpuesto()).sum();
	}
}
