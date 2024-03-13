package o5.o11.o2022;

import java.time.LocalDate;

abstract class BienMueble extends Bien{
	private String patente;
	protected LocalDate fechaFabricacion;
	
	public BienMueble(String patente,LocalDate fechaFabricacion,Double valor) {
		super(valor);
		this.fechaFabricacion=fechaFabricacion;
		this.patente=patente;
	}
	
	public Double getImpuesto() {
		return 0.0;
	}
}


