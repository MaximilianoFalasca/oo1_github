package parcial2022Recuperatorio2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ContratoUnico extends Contrato{
	public ContratoUnico(Servicio servicio,LocalDate fecha) {
		super(servicio,fecha);
	}
	
	public Double obtenerMontoAPagar() {
		Double monto= servicio.getMontoAAbonar();
		DayOfWeek dia= DayOfWeek.from(fecha);
		if(dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY)) {
			monto+=monto*0.15;
		}
		return monto;
	}
}
