package o5.o11.o2022;

import java.time.LocalDate;

public class Automotor extends BienMueble{
	private String marca,modelo;
	
	public Automotor(String patente,String marca,String modelo,LocalDate fechaFabricacion,Double valor) {
		super(patente,fechaFabricacion,valor);
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public Double getImpuesto() {
		return fechaFabricacion.isBefore(LocalDate.now().minusYears(10))?super.getImpuesto():valor*0.05;
	}
}


