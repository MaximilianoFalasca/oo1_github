package o5.o11.o2022;

public class Inmueble extends Bien{
	private Integer numero;
	private Double valorLote,valorEdificacion;
	
	public Inmueble(Integer numero,Double valorLote,Double valorEdificacion) {
		super(valorLote+valorEdificacion);
		this.numero=numero;
	}
	
	
	public Double getImpuesto() {
		return valor*0.01;
	}
}
