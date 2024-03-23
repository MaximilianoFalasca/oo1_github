package VTV;

public class Vehiculo4Ruedas extends Vehiculo{
private Boolean emisionDeGases;
	
	public Vehiculo4Ruedas(Boolean frenos, Boolean direccion, Boolean emisionDeGases, String patente) {
		super(frenos, direccion, patente);
		// TODO Auto-generated constructor stub
	}

	public Boolean getEmisionDeGases() {
		return emisionDeGases;
	}

	public void setEmisionDeGases(Boolean emisionDeGases) {
		this.emisionDeGases = emisionDeGases;
	}

	@Override
	public boolean comprobarVerificacionNormal() {
		return super.comprobarVerificacionNormal()&&getEmisionDeGases();
	}	
	
	@Override
	public boolean comprobarVerificacionRapida() {
		return super.comprobarVerificacionRapida()&&getDireccion();
	}	
}
