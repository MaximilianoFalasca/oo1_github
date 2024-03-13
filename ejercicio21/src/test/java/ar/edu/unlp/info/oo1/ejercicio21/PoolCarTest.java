package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoolCarTest {
	PoolCar sistema;
	ArrayList<Viaje> viajes;
	ArrayList<Usuario> usuarios;
	
	@BeforeEach
	void setUp() {
		sistema=new PoolCar();
		viajes=new ArrayList<Viaje>();
		usuarios= new ArrayList<Usuario>();
		
		Vehiculo vehiculoJuan=new Vehiculo("renault",5,LocalDate.of(2010, 10, 20),2000000.0);
		Usuario juan= new Conductor("juan",vehiculoJuan);
		Usuario marta=new Pasajero("marta");
		Usuario marto=new Pasajero("marto");
		Usuario marta2=new Pasajero("marta2");
		
		sistema.altaConductor(juan.getNombre(), vehiculoJuan);
		sistema.altaPasajero(marta.getNombre());
		sistema.altaPasajero(marto.getNombre());
		sistema.altaPasajero(marta2.getNombre());
		
		usuarios.add(juan);
		usuarios.add(marta);
		usuarios.add(marto);
		usuarios.add(marta2);
		
		Viaje viaje= new Viaje("korn","vicente",2000.0,vehiculoJuan,LocalDate.of(2023, 11, 10));
		Viaje viaje2= new Viaje("korn","vicente",2000.0,vehiculoJuan,LocalDate.of(2023, 11, 9));
		Viaje viaje3= new Viaje("korn","vicente",2000.0,vehiculoJuan,LocalDate.of(2023, 11, 8));
	
		sistema.altaViaje("korn","vicente",2000.0,vehiculoJuan,LocalDate.of(2023, 11, 10));
		sistema.altaViaje("korn","vicente",2000.0,vehiculoJuan,LocalDate.of(2023, 11, 9));
		sistema.altaViaje("korn","vicente",2000.0,vehiculoJuan,LocalDate.of(2023, 11, 8));
	}
	
	@Test
	void testListarViajesDiaSiguiente() {
		assertEquals(1,sistema.listarViajesDiaSiguiente().size());
	}
}
