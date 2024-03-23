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
		if(dueño.getPlata()>=verificacion.getCosto()) {
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
		}else {
			System.out.println("no tenes suficiente dinero");
		}
		//verificacionesPorAño.add(verificacion);
		return verificacion;
	}
	
	public long obtenerintentosDePersona(Dueño persona, List<Verificacion> verificaciones) {
		List<Verificacion> verificacionesDeLaPersona = verificaciones.stream()
			.filter(verificacion->
				verificacion.getVehiculo().getPatente().equals(persona.getVehiculo().getPatente())
			)
			.collect(Collectors.toList());
		return verificacionesDeLaPersona.stream().count();
	}
	
	public Dueño obtenerPersonaConMasIntentos() {
		List<Verificacion> verificaciones = verificacionesPorAño.stream().flatMap(verificacion->verificacion.stream()).collect(Collectors.toList());
		//verificaciones.stream().sorted((a,b)->Integer.compare(a.,b))
		/*verificacionesPorAño.stream()
				.forEach(verificaciones->{
					List<Verificacion>listas= new ArrayList<>();
					listas= verificaciones.stream().flatMap(verificacion->verificacion.stream()).collect(Collectors.toList());
							//.filter(verificacion->
								//verificacion.getVehiculo().getPatente().equals(persona.getVehiculo().getPatente())
							//)
							//.collect(Collectors.toList());
					
					//.anyMatch(verificacion->verificacion.getExpiracion()!=null)?null:collect(Collectors.toList())
				}
			);
		*/
		return persona;
	}
	
	public List<Verificacion> getAllLista(){
		List<Verificacion> listas = new ArrayList<>();
		listas = verificacionesPorAño.stream().flatMap(lista->lista.stream()).collect(Collectors.toList()); 
		return listas;
	}
}
