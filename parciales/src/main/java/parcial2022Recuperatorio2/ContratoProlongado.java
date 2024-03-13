package parcial2022Recuperatorio2;

import java.time.LocalDate;

public class ContratoProlongado extends Contrato{
	private int cantDias;
	
	public ContratoProlongado(Servicio servicio,LocalDate fecha,int cantDias) {
		super(servicio,fecha);
		this.cantDias=cantDias;
	}
	
	@Override
	public Double obtenerMontoAPagar() {
		Double monto=servicio.getMontoAAbonar()*cantDias;
		if(cantDias>5) {
			monto-=monto*0.1;
		}
		return monto;
	}
}
