package parcial2022Recuperatorio2;

abstract class Servicio {
	protected Double precioPorHora;
	protected int cantHoras;
	
	public Servicio(Double precio,int horas) {
		precioPorHora=precio;
		cantHoras=horas;
	}
	
	public Double getPrecio() {
		return precioPorHora;
	}
	
	public int getCantHoras() {
		return cantHoras;
	}
	
	public Double getMontoAAbonar() {
		Double monto=precioPorHora*cantHoras;
		return monto;
	}
}
