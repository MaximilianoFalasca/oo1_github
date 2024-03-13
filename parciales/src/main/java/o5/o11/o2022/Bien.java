package o5.o11.o2022;

abstract class Bien {
	protected Double valor;
	
	public Bien(Double valor) {
		this.valor=valor;
	}
	
	abstract Double getImpuesto();
}
