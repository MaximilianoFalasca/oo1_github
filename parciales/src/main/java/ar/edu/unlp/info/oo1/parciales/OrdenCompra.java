package ar.edu.unlp.info.oo1.parciales;

import java.time.LocalDate;
import java.util.List;

public class OrdenCompra extends Orden{
	
	public OrdenCompra(String patente,List<Repuesto> repuestos,LocalDate fecha) {
		super(patente,repuestos,fecha);
	}
}
