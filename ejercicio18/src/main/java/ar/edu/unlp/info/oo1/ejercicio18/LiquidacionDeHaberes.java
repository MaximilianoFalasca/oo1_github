package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiquidacionDeHaberes {
	private List<Empleado> empleados;
	private List<Recibo> recibos;
	private Nomina nomina;
	
	public LiquidacionDeHaberes() {
		empleados=new ArrayList<Empleado>();
		recibos=new ArrayList<Recibo>();
		nomina=new Nomina();
	}
	
	public void altaEmpleado(String nombre,String apellido, Integer cuil, LocalDate fechaNacimiento, boolean conyuge, boolean hijos) {
		Empleado empleado=new Empleado(nombre,apellido,cuil,fechaNacimiento,conyuge,hijos);
		nomina.agregarEmpleado(empleado,LocalDate.now());
	}
	
	public Empleado buscarEmpleado(Integer cuil) {
		Empleado empleado=empleados.stream().filter(empleado->empleado.getCuil().equals(cuil)).findFirst().orElse(null);
		return empleado;
	}
	
	public void bajaEmpleado(Empleado empleado) {
		nomina.bajaEmpleado(empleado);
	}
	
	public void cargarContratoPorHoras(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, Double valorHora, Integer numeroHoras) {
		Contrato contrato=new ContratoPorHoras(fechaInicio,fechaFin,valorHora,numeroHoras);
		empleado.cargarContrato(contrato);
	}
	
	public void cargarContratoDePlanta(Empleado empleado, LocalDate fechaInicio, Double sueldoMensual, Double montoPorTenerConyuge, Double montoPorTenerHijos) {
		Contrato contrato=new ContratoDePlanta(fechaInicio,sueldoMensual,montoPorTenerConyuge,montoPorTenerHijos);
		empleado.cargarContrato(contrato);
	}
	
	public List<Empleado> getEmpleadosConContratosVencidos(){
		List<Empleado>lista=empleados.stream().filter(empleado->empleado.getTieneContratoVencido()).collect(Collectors.toList());
		return lista;
	}
	
	public void generarRecibosDeSueldo() {
		List<Empleado>lista=empleados.stream().filter(empleado->empleado.getTieneContratoActivo()).collect(Collectors.toList());;
		List<Recibo>recibos=lista.stream().map(empleado->new Recibo(empleado.getNombre(),empleado.getApellido,empleado.getCuil(),empleado.getAntiguedad(),LocalDate.now(),empleado.getSueldoDebido())).collect(Collectors.toList());
	}
}
