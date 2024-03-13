package parcial2022Recuperatorio2;

public class ServicioLimpieza extends Servicio{
	private Double tarifaMinima;
	
	public ServicioLimpieza(Double precio,int horas,Double tarifaMinima) {
		super(precio,horas);
		this.tarifaMinima=tarifaMinima;
	}
	
	@Override
	public Double getMontoAAbonar() {
		Double monto=super.getMontoAAbonar();
		if(monto<tarifaMinima) {
			monto=tarifaMinima;
		}
		return monto;
	}
}
