package VTV;

public abstract class Vehiculo {
	private Boolean frenos,direccion;
	private String patente;

	public Vehiculo(Boolean frenos, Boolean direccion, String patente) {
		this.frenos = frenos;
		this.direccion = direccion;
	}

	public Boolean getFrenos() {
		return frenos;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void setFrenos(Boolean frenos) {
		this.frenos = frenos;
	}

	public Boolean getDireccion() {
		return direccion;
	}

	public void setDireccion(Boolean direccion) {
		this.direccion = direccion;
	}
	
	public boolean comprobarVerificacionNormal() {
		return getFrenos()&&getDireccion();
	}
	
	public boolean comprobarVerificacionRapida() {
		return getFrenos();
	}
}
