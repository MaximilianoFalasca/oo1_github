package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;

abstract class Llamada {
	protected LocalDateTime fecha;
	private Integer numeroEmisor,numeroReceptor;
	protected Integer duracion;
	
	public Llamada(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor) {
		this.fecha=fecha;
		this.duracion=duracion;
		this.numeroEmisor=numeroEmisor;
		this.numeroReceptor=numeroReceptor;
	}
	
	public Integer getNumeroEmisor() {
		return numeroEmisor;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public boolean estaEntre(LocalDate fechaInicio, LocalDate fechaFin) {
		boolean esta = (fecha.toLocalDate().isAfter(fechaInicio) && fecha.toLocalDate().isBefore(fechaFin)) || fecha.toLocalDate().isEqual(fechaFin) || fecha.toLocalDate().isEqual(fechaInicio);
		return esta;
	}
	
	abstract Double getMonto();
}
