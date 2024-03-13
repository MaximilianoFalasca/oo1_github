package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Conductor extends Usuario{
	private Vehiculo vehiculo;
	
	public Conductor(String nombre, Vehiculo vehiculo) {
		super(nombre);
		this.vehiculo=vehiculo;
	}
	
	public void cargarSaldo(Double saldo) {
		if(vehiculo.getFabricacio().until(LocalDate.now()).getDays()<5) {
			saldo-=(saldo*0.01);
		}else {
			saldo-=(saldo*0.1);
		}
		this.saldo+=saldo;
	}
	
	public void descontarSaldo(Double costo) {
		saldo+=((vehiculo.getValor()*0.001)-costo);
	}
}
