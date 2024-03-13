package ar.edu.unlp.info.oo1.parciales;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private Double valorPorHora;
	
	public Empleado(String nombre,Double valor) {
		this.nombre=nombre;
		valorPorHora=valor;
	}
	
	public Double getValor() {
		return valorPorHora;
	}
}
