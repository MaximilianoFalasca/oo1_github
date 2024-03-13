package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Local extends Llamada{
	
	public Local(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor) {
		super(fecha,duracion,numeroEmisor,numeroReceptor);
	}
	
	public Double getMonto() {
		Double monto=1.0*duracion;
		return monto;
	}
}
