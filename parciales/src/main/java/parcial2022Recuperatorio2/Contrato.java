package parcial2022Recuperatorio2;

import java.time.LocalDate;

abstract class Contrato {
	protected Servicio servicio;
	protected LocalDate fecha;
	
	public Contrato(Servicio servicio,LocalDate fecha) {
		this.servicio=servicio;
		this.fecha=fecha;
	}
	
	abstract Double obtenerMontoAPagar();
}
