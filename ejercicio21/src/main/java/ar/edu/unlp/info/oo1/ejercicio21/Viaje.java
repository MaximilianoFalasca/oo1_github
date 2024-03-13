package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.util.ArrayList;

public class Viaje {
	private String origen,destino;
	private Double costoTotal;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private ArrayList<Usuario> pasajeros;
	
	public Viaje(String origen,String destino, Double costoTotal, Vehiculo vehiculo, LocalDate fecha) {
		this.costoTotal=costoTotal;
		this.destino=destino;
		this.fecha=fecha;
		this.origen=origen;
		this.vehiculo=vehiculo;
		pasajeros=new ArrayList();
	}
	
	public void agregarUsuario(Usuario usuario) {
		pasajeros.add(usuario);
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void dividirGastos() {
		Integer cantPasajeros=pasajeros.size();
		Double costoPorPersona=costoTotal/cantPasajeros;
		pasajeros.stream().forEach(usuario->usuario.descontarSaldo(costoPorPersona));
	}
}
