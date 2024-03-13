package parcial2022Recuperatorio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre,direccion;
	private List<Contrato> contratos;
	
	public Cliente(String nombre,String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		contratos=new ArrayList<Contrato>();
	}
	
	public void contratarUnicaVez(Servicio servicio,LocalDate fecha) {
		Contrato contrato=new ContratoUnico(servicio,fecha);
		contratos.add(contrato);
	}
	
	public void contratoProlongado(Servicio servicio,LocalDate fecha, int dias) {
		Contrato contrato=new ContratoProlongado(servicio,fecha,dias);
		contratos.add(contrato);
	}
	
	public Double obtenerMontoAPagar() {
		Double monto=contratos.stream().mapToDouble(contrato->contrato.obtenerMontoAPagar()).sum();
		return monto;
	}
}
