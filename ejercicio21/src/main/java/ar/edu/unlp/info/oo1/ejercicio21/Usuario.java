package ar.edu.unlp.info.oo1.ejercicio21;

abstract class Usuario {
	private String nombre;
	protected Double saldo;
	
	public Usuario(String nombre) {
		this.nombre=nombre;
		saldo=0.0;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void cargarRegalo(Double saldo) {
		this.saldo+=saldo;
	}
	
	abstract void cargarSaldo(Double saldo);
	abstract void descontarSaldo(Double costo);
}
