package Primera2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract class Cliente {
	private String nombre,direccion;
	private List<Medicion> mediciones;
	
	public Cliente(String nombre,String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		mediciones=new ArrayList<Medicion>();
	}
	
	public void registrarMedicion(Double consumo,int mes,int año) {
		Medicion medicion=new Medicion(consumo,mes,año);
		mediciones.add(medicion);
	}
	
	public Double getConsumo(int mes,int año) {
		Optional<Medicion> hayConsumo=mediciones.stream().filter(medicion->medicion.getAño()==año && medicion.getMes()==mes).findFirst();
		Double consumo=-1.0;
		if(hayConsumo.isPresent()) {
			consumo=hayConsumo.get().getConsumo();
		}
		return consumo;
	}
}
