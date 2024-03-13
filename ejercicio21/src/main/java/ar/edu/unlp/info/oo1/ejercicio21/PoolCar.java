package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PoolCar {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Viaje> viajes;
	
	public PoolCar() {
		usuarios= new ArrayList<Usuario>();
		viajes=new ArrayList<Viaje>();
	}
	
	public Conductor altaConductor(String nombre, Vehiculo vehiculo) {
		Conductor conductor= new Conductor(nombre, vehiculo);
		usuarios.add(conductor);
		return conductor;
	}
	
	public Pasajero altaPasajero(String nombre) {
		Pasajero pasajero= new Pasajero(nombre);
		usuarios.add(pasajero);
		return pasajero;
	}
	
	private Viaje registrarViaje(Viaje viaje) {
		viaje.agregarUsuario(viaje.getVehiculo().getDueño());
		viajes.add(viaje);
		return viajes.get(viajes.size()-1);
	}
	
	public Viaje altaViaje(String origen, String destino, Double costoTotal, Vehiculo vehiculo, LocalDate fecha) {
		Viaje viaje= new Viaje(origen,destino,costoTotal,vehiculo,fecha);
		registrarViaje(viaje);
		return viaje;
	}
	
	public void procesarViajes() {
		ArrayList<Viaje> sViajes = new ArrayList();
		sViajes=listarViajesDiaSiguiente();
		sViajes.stream().forEach(viaje->viaje.dividirGastos());
	}
	
	public ArrayList<Viaje> listarViajesDiaSiguiente(){
		ArrayList<Viaje> sViajes = viajes.stream()
		        .filter(viaje -> viaje.getFecha().until(LocalDate.now()).getDays() == 1)
		        .collect(Collectors.toCollection(ArrayList::new));

		/*
		for(Viaje viaje : viajes) {
			Period diferencia= viaje.getFecha().until(LocalDate.now());
			if(diferencia.getDays()==1) {
				sViajes.add(viaje);
			}
		}
		*/
		return sViajes;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		usuarios.sort(new ComparadorDeUsuarios());
		return usuarios;
	}
	
	public void cargarRegalo(Double monto) {
		usuarios.forEach(usuario->usuario.cargarRegalo(monto));
	}
	
	public void registrarPasajeroEnViaje(Pasajero pasajero, Viaje viaje) {
		pasajero.registrarmeViaje(viaje);
	}
}
