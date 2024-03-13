package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Internacional extends Llamada{
	private String paisEmisor,paisReceptor;
	
	public Internacional(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor, String paisEmisor, String paisReceptor) {
		super(fecha,duracion,numeroEmisor,numeroReceptor);
		this.paisEmisor=paisEmisor;
		this.paisReceptor=paisReceptor;
	}
	
	public Double getMonto() {
		Double monto=0.0;
		if(fecha.getHour()>=8 && fecha.getHour()<20) {
			monto=4.0*duracion;
		}else {
			monto=3.0*duracion;
		}
		return monto;
	}
}
