package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Integer> numerosDisponibles;
	private ArrayList<Cliente> clientes;
	private ArrayList<Llamada> llamadas;
	
	public Sistema() {
		numerosDisponibles=new ArrayList<Integer>();
		clientes=new ArrayList<Cliente>();
		llamadas=new ArrayList<Llamada>();
	}
	
	public void agregarNumero(Integer numero) {
		numerosDisponibles.add(numero);
	}
	
	public Cliente altaClientePersonaFisica(String nombre, String direccion, Integer dni) {
		Cliente cliente = new PersonaFisica(nombre,direccion,dni,numerosDisponibles.get(1));
		clientes.add(cliente);
		numerosDisponibles.remove(1);
		return cliente;
	}
	
	public Cliente altaClientePersonaJuridica(String nombre, String direccion, Integer CUIT, String tipo) {
		Cliente cliente = new PersonaJuridica(nombre,direccion,CUIT,tipo,numerosDisponibles.get(1));
		clientes.add(cliente);
		numerosDisponibles.remove(1);
		return cliente;
	}
	
	public Llamada registrarLlamadaLocal(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor) {
		Llamada llamada=new Local(fecha,duracion,numeroEmisor,numeroReceptor);
		llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor,  Integer distancia) {
		Llamada llamada=new Interurbana(fecha,duracion,numeroEmisor,numeroReceptor,distancia);
		llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInternacional(LocalDateTime fecha, Integer duracion, Integer numeroEmisor, Integer numeroReceptor, String paisEmisor, String paisReceptor) {
		Llamada llamada=new Internacional(fecha,duracion,numeroEmisor,numeroReceptor,paisEmisor,paisReceptor);
		llamadas.add(llamada);
		return llamada;
	}
	
	public Factura facturarLlamada(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin) {
		Factura factura;
		Double montoTotal=0.0;
		Double monto=0.0;
		for(Llamada llamada:llamadas) {
			if((llamada.getNumeroEmisor().equals(cliente.getNumero()) && llamada.estaEntre(fechaInicio, fechaFin))) {
				monto+=llamada.getMonto();
				if(cliente instanceof PersonaFisica) {
					monto-=(monto*0.1);
				}
			}
			montoTotal+=monto;
		}
		factura=new Factura(cliente, LocalDate.now(), fechaInicio, fechaFin, montoTotal);
		return factura;
	}
}
