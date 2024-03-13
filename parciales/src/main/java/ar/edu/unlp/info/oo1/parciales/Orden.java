package ar.edu.unlp.info.oo1.parciales;

import java.time.LocalDate;
import java.util.List;

abstract class Orden {
	private String patente;
	private List<Repuesto> repuestos;
	private LocalDate fecha;
	
	public Orden(String patente,List<Repuesto> repuestos,LocalDate fecha) {
		this.fecha=fecha;
		this.patente=patente;
		this.repuestos=repuestos;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public List<Repuesto> getRepuestos(){
		return repuestos;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
}
