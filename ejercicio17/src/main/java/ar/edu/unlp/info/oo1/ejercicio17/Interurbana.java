package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Interurbana extends Llamada{
	private Integer distancia;
	
	public Interurbana(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor, Integer distancia) {
		super(fecha,duracion,numeroEmisor,numeroReceptor);
		this.distancia=distancia;
	}
	
	public Double getMonto() {
		Double monto=5.0;
		if(distancia<100) {
			monto+=2*duracion;
		}else if(distancia>=100 && distancia<500) {
			monto+=2.5*duracion;
		}else {
			monto+=3*duracion;
		}
		return monto;
	}
}
