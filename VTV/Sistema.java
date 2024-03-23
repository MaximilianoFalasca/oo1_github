package VTV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	//todo esto seria el registro
	private List<List<Verificacion>> verificacionesPorAño;
	
	public Sistema() {
		verificacionesPorAño = new ArrayList<>();
	}
	
	public Verificacion VerificacionDeVehiculo(Dueño dueño) {
		Verificacion verificacion=dueño.elegirVerificacion();
		verificacionesPorAño.stream()
			.filter(verificaciones->
				verificaciones.get(0).getFechaDeVerificacion().getYear()==verificacion.getFechaDeVerificacion().getYear()
			)
			.findFirst()
			.orElseGet(() -> {
				List<Verificacion> lista= new ArrayList<>();
				verificacionesPorAño.add(lista);
				return lista;
			})
			.add(verificacion);
		//verificacionesPorAño.add(verificacion);
		return verificacion;
	}
	
	public List<Verificacion> getAllLista(){
		List<Verificacion> listas = new ArrayList<>();
		listas = verificacionesPorAño.stream().flatMap(lista->lista.stream()).collect(Collectors.toList()); 
		return listas;
	}
}
