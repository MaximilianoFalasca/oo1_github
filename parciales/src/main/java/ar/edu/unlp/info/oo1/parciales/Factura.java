package ar.edu.unlp.info.oo1.parciales;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private String patente;
	private Double monto,descuento;
	
	public Factura(LocalDate fecha,String patente,Double monto,Double descuento) {
		this.fecha=fecha;
		this.patente=patente;
		this.monto=monto;
		this.descuento=descuento;
	}
}
