package VTV;

public class Camioneta extends Vehiculo4Ruedas {
	private Boolean suspencion;
	
	public Camioneta(Boolean frenos, Boolean direccion, Boolean emisionDeGases, String patente) {
		super(frenos, direccion, emisionDeGases, patente);
		// TODO Auto-generated constructor stub
	}

	public Boolean getSuspencion() {
		return suspencion;
	}

	public void setSuspencion(Boolean suspencion) {
		this.suspencion = suspencion;
	}
	
	@Override
	public boolean comprobarVerificacionNormal() {
		return super.comprobarVerificacionNormal()&&getSuspencion();
	}	
	
	@Override
	public boolean comprobarVerificacionRapida() {
		return super.comprobarVerificacionRapida()&&getSuspencion();
	}	
}
