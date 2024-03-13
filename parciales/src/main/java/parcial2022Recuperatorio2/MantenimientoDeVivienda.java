package parcial2022Recuperatorio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MantenimientoDeVivienda {
	private List<Cliente> clientes;
	private List<Servicio> servicios;
	
	public MantenimientoDeVivienda() {
		clientes=new ArrayList<Cliente>();
		servicios=new ArrayList<Servicio>();
	}
	
	public Cliente registrarCliente(String nombre,String direccion) {
		Cliente cliente=new Cliente(nombre,direccion);
		clientes.add(cliente);
		return cliente;
	}
	
	public Servicio registrarServicioLimpieza(Double precio,int cant,Double tarifa) {
		Servicio servicio=new ServicioLimpieza(precio,cant,tarifa);
		servicios.add(servicio);
		return servicio;
	}
	
	public Servicio registrarServicioParquizacion(Double precio,int cant,int cantM,Double costo) {
		Servicio servicio=new ServicioParquizacion(precio,cant,cantM,costo);
		servicios.add(servicio);
		return servicio;
	}
	
	public void contratarUnicaVez(Cliente cliente,LocalDate fecha,Servicio servicio) {
		cliente.contratarUnicaVez(servicio,fecha);
	}
	
	public Double obtenerMontoAPagar(Cliente cliente) {
		Double monto=cliente.obtenerMontoAPagar();
		return monto;
	}
	
	public int obtenerCantServicioConMayorPrecio(Double valor) {
		int cant=(int) servicios.stream()
				.filter(servicio->servicio.getCantHoras()>valor)
				.count();
		return cant;
	}
}
