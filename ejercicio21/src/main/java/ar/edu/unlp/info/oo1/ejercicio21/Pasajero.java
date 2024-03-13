package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.time.Period;

public class Pasajero extends Usuario{
	private Viaje ultimoViaje;
	
	public Pasajero(String nombre) {
		super(nombre);
		ultimoViaje=null;
	}
	
	//tengo que testear esto
	public void registrarmeViaje(Viaje viaje) {
		Period diferencia= viaje.getFecha().until(LocalDate.now());
		
		boolean capacidad=(viaje.getVehiculo().getCapacidad()>1);//el conductor se tiene que agregar despues y es 1 espacio
		boolean diferenciaAll=((diferencia.getDays()<=2) && (diferencia.getMonths()==0) && (diferencia.getYears()==0));
		boolean saldoPositivo=getSaldo()>0;
		
		if(capacidad && diferenciaAll && saldoPositivo) {
			viaje.agregarUsuario(this);
		}
		this.ultimoViaje=viaje;
	}
	
	public void cargarSaldo(Double saldo) {
		if((ultimoViaje!=null)) {
			Period diferencia=ultimoViaje.getFecha().until(LocalDate.now());
			if(((diferencia.getMonths()==0) && (diferencia.getYears()==0))){
				saldo-=(saldo*0.1);				
			}
		}else {
			saldo-=(saldo*0.1);
		}
		this.saldo+=saldo;
	}
	
	public void descontarSaldo(Double costo) {
		saldo-=costo;
		if(ultimoViaje!=null){
			saldo+=500;
		}
	}
	
	public Viaje getUltimoViaje() {
		return ultimoViaje;
	}
}
