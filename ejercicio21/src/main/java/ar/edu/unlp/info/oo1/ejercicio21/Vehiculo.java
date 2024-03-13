package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private Integer capacidad;//incluido el conductor
	private LocalDate fabricacion;
	private Double valor;
	
	public Vehiculo(String descripcion, Integer capacidad, LocalDate fabricacion, Double valor) {
		this.dueño=dueño;
		this.descripcion=descripcion;
		this.capacidad = capacidad;
		this.fabricacion=fabricacion;
		this.valor=valor;
	}
	
	public Integer getCapacidad() {
		return capacidad;
	}
	
	public Conductor getDueño() {
		return dueño;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public LocalDate getFabricacio() {
		return fabricacion;
	}
	
	public void setDueño(Conductor dueño) {
		this.dueño=dueño;
	}
	
	public Conductor getConductor() {
		return dueño;
	}
}
