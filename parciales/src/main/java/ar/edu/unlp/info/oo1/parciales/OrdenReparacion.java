package ar.edu.unlp.info.oo1.parciales;

import java.time.LocalDate;
import java.util.List;

public class OrdenReparacion extends Orden{
	private String descripcion;
	private List<Empleado> empleados;
	private int cantHoras;
	
	public OrdenReparacion(String patente,List<Repuesto> repuestos,LocalDate fecha,String descripcion,List<Empleado> empleados,int cantHoras) {
		super(patente,repuestos,fecha);
		this.descripcion=descripcion;
		this.cantHoras=cantHoras;
		this.empleados=empleados;
	}
	
	public List<Empleado> getEmpleados(){
		return empleados;
	}
	
	public int getHoras() {
		return cantHoras;
	}
}
