package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {
	private Ticket ticket = new Ticket();
	
	public void agregarProducto(Producto producto) {
		ticket.agregarProducto(producto.getPrecio(),producto.getPeso());
	}

	public Double getPesoTotal() {
		return ticket.getPesoTotal();
	}

	public Integer getCantidadDeProductos() {
		return ticket.getCantidadDeProductos();
	}

	public Ticket emitirTicket() {
		return ticket;
	}
	
	public Double getPrecioTotal() {
		return ticket.getPrecioTotal();
	}

	public void ponerEnCero() {
		ticket=new Ticket();
	}
}
