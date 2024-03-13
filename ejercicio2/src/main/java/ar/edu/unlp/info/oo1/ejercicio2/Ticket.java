package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private double pesoTotal,impuesto,precioTotal;
	private Integer cantProductos;
	private Object fecha;
	
	public Ticket() {
		cantProductos=0;
		precioTotal=0;
		impuesto=23 * 0.21;
		fecha=LocalDate.now();
	}
	
	public void agregarProducto(Double precio,Double peso){
		cantProductos++;
		precioTotal+=precio;
		pesoTotal+=peso;
	}
	
	public Double getPesoTotal() {
		return pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public Integer getCantidadDeProductos() {
		return cantProductos;
	}

	public Double impuesto() {
		return impuesto;
	}

	public Object getFecha() {
		return fecha;
	}
}
