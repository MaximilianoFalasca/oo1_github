package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class Factura {
	private Cliente cliente;
	private LocalDate fechaFacturacion,fechaInicio,fechaFin;
	private Double montoTotal;
	
	public Factura(Cliente cliente,LocalDate fechaFacturacion, LocalDate fechaInicio, LocalDate fechaFin, Double montoTotal) {
		this.cliente=cliente;
		this.fechaFacturacion=fechaFacturacion;
		this.fechaFin=fechaFin;
		this.fechaInicio=fechaInicio;
		this.montoTotal=montoTotal;
	}
}
