package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private double peso,precio;
	private int precioPorKilo;
	private String descripcion;
	
	
	public void setPeso(double d) {
		peso=d;
	}

	public void setPrecioPorKilo(int i) {
		precioPorKilo=i;
	}

	public void setDescripcion(String string) {
		descripcion=string;
	}

	public Object getDescripcion() {
		return descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public Integer getPrecioPorKilo() {
		return precioPorKilo;
	}

	public double getPrecio() {
		return (precioPorKilo*peso);
	}
}
