package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class plazoFijoTest {
	private PlazoFijo plazoFijo;
	
	@BeforeEach
	public void setUp() {
		plazoFijo=new PlazoFijo(LocalDate.of(2023, 10, 15), 20.0, 10.0);
	}
	
	@Test
	public void diferenciaDeDias() {
		assertEquals((int)ChronoUnit.DAYS.between(plazoFijo.getFechaDeConstruccion(), LocalDate.now()), 11);
	}
	
	@Test
	public void calcularValor() {
		assertEquals(plazoFijo.calcularValor(), 42.0);
	}
}
