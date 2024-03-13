package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class inversionEnAccionesTest {
	private Inversion inversionEnAcciones;
	
	@BeforeEach
	public void setUp() {
		inversionEnAcciones = new InversionEnAcciones("coca", 2000, 10000);
	}
	
	@Test
	public void calcularValor() {
		assertEquals(inversionEnAcciones.calcularValor(), 200000000);
	}
}
