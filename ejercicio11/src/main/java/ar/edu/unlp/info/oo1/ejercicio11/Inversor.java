package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre=nombre;
		inversiones=new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Inversion> getInversiones(){
		return inversiones;
	}
	
	public void addInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public double valorActual() {
		double valor = inversiones.stream().mapToDouble(inversion -> inversion.calcularValor()).sum();
		return valor;
	}
}
