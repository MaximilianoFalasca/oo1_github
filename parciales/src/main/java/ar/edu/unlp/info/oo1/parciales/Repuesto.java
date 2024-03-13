package ar.edu.unlp.info.oo1.parciales;

import java.time.LocalDate;

public class Repuesto {
	private String nombre;
	private LocalDate fechaFabricacion;
	private Double costo;
	
	public Repuesto(String nombre,LocalDate fechaFabricacion,Double costo) {
		this.costo=costo;
		this.fechaFabricacion=fechaFabricacion;
		this.nombre=nombre;
	}
	
	public Double getCosto() {
		return costo;
	}
	
	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}
}
