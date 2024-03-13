package ar.edu.unlp.info.oo1.ejercicio19;

public class Producto {
	private String nombre, descripcion;
	private double precio;
	private Integer cantUnidades;
	private Vendedor vendedor;
	
	public Producto(String nombre,String descripcion, double precio, Integer cantUnidades, Vendedor vendedor) {
		this.cantUnidades = cantUnidades;
		this.descripcion=descripcion;
		this.nombre=nombre;
		this.precio=precio;
		this.vendedor=vendedor;
	}
	
	public Integer getCantUnidades() {
		return cantUnidades;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUnidades(Integer cant) {
		cantUnidades+=cant;
	}
}
