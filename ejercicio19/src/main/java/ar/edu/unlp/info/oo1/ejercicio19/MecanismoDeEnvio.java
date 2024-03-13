package ar.edu.unlp.info.oo1.ejercicio19;

abstract class MecanismoDeEnvio {
	private String tipo;
	
	public MecanismoDeEnvio(String tipo) {
		this.tipo=tipo;
	}
	
	abstract double getCostoEnvio(String dirCliente, String dirVendedor);
}
