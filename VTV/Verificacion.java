package VTV;

import java.time.LocalDate;

public abstract class Verificacion {
	private LocalDate fechaDeVerificacion,expiracion;
	private Vehiculo vehiculo;

	public Verificacion(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		realizarVerificacion();
	}
	
	public LocalDate getFechaDeVerificacion() {
		return fechaDeVerificacion;
	}

	public void setFechaDeVerificacion(LocalDate fechaDeVerificacion) {
		this.fechaDeVerificacion = fechaDeVerificacion;
	}

	public LocalDate getExpiracion() {
		return expiracion;
	}

	public void setExpiracion(LocalDate expiracion) {
		this.expiracion = expiracion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public abstract void realizarVerificacion();
}
