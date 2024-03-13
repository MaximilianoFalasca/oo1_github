package o5.o11.o2022;

import java.time.LocalDate;

public class Embarcacion extends BienMueble{
	private String nombre;
	
	public Embarcacion(String patente,String nombre,LocalDate fechaFabricacion,Double valor) {
		super(patente,fechaFabricacion,valor);
		this.nombre=nombre;
	}
	
	public Double getImpuesto() {
		return fechaFabricacion.isBefore(LocalDate.now().minusYears(10))?super.getImpuesto():(valor>1000000.0?valor*0.15:valor*0.1);
	}
}
