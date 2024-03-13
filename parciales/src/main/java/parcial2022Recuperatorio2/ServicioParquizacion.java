package parcial2022Recuperatorio2;

public class ServicioParquizacion extends Servicio{
	private int cantMaquinas;
	private Double costoMantenimiento;
	
	public ServicioParquizacion(Double precio,int horas,int cant,Double costo) {
		super(precio,horas);
		cantMaquinas=cant;
		costoMantenimiento=costo;
	}
	
	@Override
	public Double getMontoAAbonar() {
		Double monto=super.getMontoAAbonar()+cantMaquinas*costoMantenimiento;
		return monto;
	}
}
