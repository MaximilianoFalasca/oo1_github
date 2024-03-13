package ar.edu.unlp.info.oo1.ejercicio19;

public class Pedido{
	private Integer cantSolicitado;
	private FormaDePago formaDePago;
	private MecanismoDeEnvio mecanismoDeEnvio;
	private Producto producto;
	private Cliente cliente;
	
	public Pedido(Cliente cliente, Producto producto, Integer cantSolicitado, FormaDePago formaDePago, MecanismoDeEnvio mecanismoDeEnvio) {
		this.cantSolicitado=cantSolicitado;
		this.cliente=cliente;
		this.formaDePago=formaDePago;
		this.mecanismoDeEnvio=mecanismoDeEnvio;
	}
	
	public double calcularCostoTotal() {
		double costoTotal=producto.getPrecio()+(producto.getPrecio()*100/formaDePago.getPorcentajeIncremento());
		double costoDeEnvio=mecanismoDeEnvio.getCostoEnvio(cliente.getDir(),producto.getVendedor().getDir());
		return costoTotal;
	}
}
