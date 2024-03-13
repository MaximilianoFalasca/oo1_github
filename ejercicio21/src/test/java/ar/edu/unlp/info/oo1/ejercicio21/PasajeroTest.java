package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasajeroTest {
	Pasajero pasajero;
	
	@BeforeEach
	void setUp() {
		pasajero= new Pasajero("james");
		pasajero.cargarRegalo(2000.0);
	}
	
	@Test
	void testCargarSaldo() {
		pasajero.cargarSaldo(2000.0);
		assertEquals(3800.0, pasajero.getSaldo());
	}
	
	@Test
	void testRegistrarmeViaje() {
		Vehiculo vehiculo= new Vehiculo("renault",5,LocalDate.of(2010, 2, 2),2000000.0);
		Usuario conductor=new Conductor("juan carlos",vehiculo);
		Viaje viaje= new Viaje("korn","san vicente",1700.0,vehiculo,LocalDate.now());
		pasajero.registrarmeViaje(viaje);
		assertEquals(viaje, pasajero.getUltimoViaje());
	}

}
