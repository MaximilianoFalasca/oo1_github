package ar.edu.unlp.info.oo1.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstruccion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstruccion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstruccion=fechaDeConstruccion;
		this.montoDepositado=montoDepositado;
		this.porcentajeDeInteresDiario=porcentajeDeInteresDiario;
	}
	
	public LocalDate getFechaDeConstruccion() {
		return fechaDeConstruccion;
	}
	
	public double getMontoDepositado() {
		return montoDepositado;
	}
	
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
	
	public double calcularValor() {
		int cantDias= (int)ChronoUnit.DAYS.between(fechaDeConstruccion, LocalDate.now());
		double interesDiario = (montoDepositado * porcentajeDeInteresDiario / 100);
		double interesTotal=(interesDiario * cantDias);
		return (montoDepositado+interesTotal);
	}
}
