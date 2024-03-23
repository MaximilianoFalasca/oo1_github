package VTV;

import java.time.LocalDate;

public class VerificacionRapida extends Verificacion {

	public VerificacionRapida(Vehiculo vehiculo) {
		super(vehiculo);
		setCosto(200.0);
	}

	@Override
	public void realizarVerificacion() {
		// TODO Auto-generated method stub
		this.setFechaDeVerificacion(LocalDate.now());
        Vehiculo v = this.getVehiculo();
        if(v.comprobarVerificacionRapida()) {
        	this.setExpiracion(LocalDate.now().plusMonths(6));
        }else {
        	this.setExpiracion(null);
        }
	}

}
