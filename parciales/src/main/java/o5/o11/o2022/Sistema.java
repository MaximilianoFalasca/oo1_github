package o5.o11.o2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Contribuyente> contribuyentes;
	
	public Sistema() {
		contribuyentes=new ArrayList<Contribuyente>();
	}
	
	public Contribuyente altaContribuyente(String nombre,Integer dni,String email,String localidad) {
		Contribuyente contribuyente=new Contribuyente(nombre,dni,email,localidad);
		contribuyentes.add(contribuyente);
		return contribuyente;
	}
	
	public Bien altaInmueble(Integer numero,Double valorLote,Double valorEdificacion,Contribuyente propietario) {
		return propietario.altaInmueble(numero,valorLote,valorEdificacion);
	}
	
	public Bien altaAutomotor(String patente,String marca,String modelo,LocalDate fechaFabricacion,Double valor,Contribuyente propietario) {
		return propietario.altaAutomotor(patente,marca,modelo,fechaFabricacion,valor);
	}
	
	public Bien altaEmbarcacion(String patente,String nombre,LocalDate fechaFabricacion,Double valor,Contribuyente propietario) {
		return propietario.altaEmbarcacion(patente,nombre,fechaFabricacion,valor);
	}

	public List<Contribuyente> contribuyentesMasPagaEnLocalidad(String localidad, Integer n) {
	    return contribuyentes.stream()
	            .filter(contribuyente -> contribuyente.getLocalidad().equals(localidad))
	            .sorted((e1, e2) -> Double.compare(e2.calcularImpuesto(), e1.calcularImpuesto()))
	            .limit(n)
	            .collect(Collectors.toList());
	}

}
