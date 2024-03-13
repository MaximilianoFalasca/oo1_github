package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class inversorTest {
	private Inversor inversor;
	
	private Inversion Inversion1,Inversion2,Inversion3;
	
	@BeforeEach
	public void setUp() {
		inversor= new Inversor("juan");
		
		Inversion1=new InversionEnAcciones("coca", 20, 10);
		Inversion2=new InversionEnAcciones("movistar", 40, 5);
		Inversion3=new PlazoFijo(LocalDate.of(2023, 10, 15), 20.0, 10.0);
		
		inversor.addInversion(Inversion1);
		inversor.addInversion(Inversion2);
		inversor.addInversion(Inversion3);
	}
	
	@Test
	public void valores() {
		assertEquals(Inversion1.calcularValor(), 200);
		assertEquals(Inversion2.calcularValor(), 200);
		assertEquals(Inversion3.calcularValor(), 42);
	}
	
	
	@Test
	public void valorActual() {
		//valor = 200 + 200 + (20+22) = 442
		assertEquals(inversor.valorActual(), 442.0);
	}
}
