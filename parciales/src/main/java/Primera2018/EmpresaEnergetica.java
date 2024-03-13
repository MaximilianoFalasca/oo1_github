package Primera2018;

import java.util.List;

public class EmpresaEnergetica {
	private List<Cliente> clientes;
	private Tarifario tarifario;
	
	public Cliente altaPersona(String nombre,String domicilio,String apellido) {
		Cliente cliente=new ClienteResidencial(nombre,domicilio,apellido);
		clientes.add(cliente);
		return cliente;
	}
	
	public Cliente altaIndustria(String nombre,String domicilio) {
		Cliente cliente=new Industria(nombre,domicilio);
		clientes.add(cliente);
		return cliente;
	}
	
	public void registrarMedicion(Cliente cliente,Double consumo,int mes,int año) {
		cliente.registrarMedicion(consumo, mes, año);
	}
	
	public void actualizarTarifario(Double precioR,Double precioI) {
		tarifario.actualizarPrecios(precioR,precioI);
	}
	
	public Double calcularMontoAFacturar(Cliente cliente, int mes, int año) {
		Double monto=0.0;
		Double consumo=cliente.getConsumo(mes, año);
		if(cliente instanceof ClienteResidencial) {
			monto+=consumo*tarifario.getPrecioResidencial();
			if(cliente.getConsumo(mes, año-1)!=-1 || consumo<cliente.getConsumo(mes, año-1)) {
				monto-=monto*0.1;
			}
		}else if(cliente instanceof Industria){
			monto+=consumo*tarifario.getPrecioIndustrial();
			if(cliente.getConsumo(mes-1, año)!=-1 && consumo<cliente.getConsumo(mes-1, año)) {
				monto-=monto*0.02;
			}
		}
		return monto;
	}
}
