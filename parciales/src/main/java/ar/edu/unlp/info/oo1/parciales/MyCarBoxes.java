package ar.edu.unlp.info.oo1.parciales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyCarBoxes {
	private List<Repuesto> repuestos;
	private List<Empleado> empleados;
	private List<Orden> ordenes;
	
	public MyCarBoxes() {
		repuestos=new ArrayList<Repuesto>();
		empleados=new ArrayList<Empleado>();
		ordenes=new ArrayList<Orden>();
	}
	
	public Repuesto altaRepuesto(String nombre,LocalDate fecha,Double costo) {
		Repuesto repuesto=new Repuesto(nombre,fecha,costo);
		repuestos.add(repuesto);
		return repuesto;
	}
	
	public Empleado altaEmpleado(String nombre,Double valor) {
		Empleado empleado=new Empleado(nombre,valor);
		empleados.add(empleado);
		return empleado;
	}
	
	public Orden registrarOrdenDeCompra(String patente, List<Repuesto> repuestos) {
		Orden orden=new OrdenCompra(patente,repuestos,LocalDate.now());
		ordenes.add(orden);
		return orden;
	}
	
	public Orden registrarOrdenDeReparacion(String patente,List<Repuesto> repuestos,LocalDate fecha,String descripcion,List<Empleado> empleados,int cantHoras) {
		Orden orden=null;
		if(empleados.size()>0) {
			orden=new OrdenReparacion(patente,repuestos,LocalDate.now(),descripcion,empleados,cantHoras);
			ordenes.add(orden);
		}else {
			System.out.println("error: no se registro ningun empleado para reparar el vehiculo");
		}
		return orden;
	}
	
	//tendria que hacer la factura en la clase orden no aca y devolverla, en esta clase solo voy agregando las facturas hechas y ya
	public List<Factura> facturarOrdenes(List<Orden> ordenes) {
		List<Factura> facturas=new ArrayList<Factura>();
		ordenes.stream().forEach(orden->{
			Double monto=getMonto(orden);
			Double descuento=getDescuento(orden,monto);
			Factura factura=new Factura(orden.getFecha(),orden.getPatente(),monto-descuento,getDescuento(orden,monto));
			facturas.add(factura);
		});
		return facturas;
	}
	
	private Double getMonto(Orden orden) {
		Double monto=orden.getRepuestos().stream().mapToDouble(repuesto->repuesto.getCosto()).sum();
		Double incremento=0.0;
		if(orden instanceof OrdenCompra) {
			incremento=orden.getRepuestos().stream()
					.filter(repuesto->
						repuesto.getFechaFabricacion().isAfter(LocalDate.now().minusYears(5))
					)
					.count()>0?(monto*0.05):(monto*0.15);
		}else if(orden instanceof OrdenReparacion) {
			OrdenReparacion o=(OrdenReparacion) orden;
			monto+=o.getEmpleados().stream()
					.mapToDouble(empleado->
							empleado.getValor()*o.getHoras()
					)
					.sum();
			incremento=monto*0.1;
		}else {
			System.out.println("error: tipo de orden invalida");
		}
		monto+=incremento;
		return monto;
	}
	
	private Double getDescuento(Orden orden,Double monto) {
		Double descuento=ordenes.stream().anyMatch(o->o.getPatente()==orden.getPatente())?(monto*0.05):0.0;
		return descuento;
	}
}
