package Primera2018;

public class Medicion {
	private Double consumo;
	private int mes,año;
	
	public Medicion(Double consumo,int mes,int año) {
		this.año=año;
		this.consumo=consumo;
		this.mes=mes;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAño() {
		return año;
	}
	
	public Double getConsumo() {
		return consumo;
	}
}
