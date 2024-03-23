package VTV;

import java.time.LocalDate;

public class VerificacionNormal extends Verificacion {

    public VerificacionNormal(Vehiculo vehiculo) {
        super(vehiculo);
        setCosto(1000.0);
    }

    @Override
    public void realizarVerificacion() {
        this.setFechaDeVerificacion(LocalDate.now());
        Vehiculo v = this.getVehiculo();
        if(v.comprobarVerificacionNormal()) {
        	this.setExpiracion(LocalDate.now().plusYears(1));
        }else {
        	this.setExpiracion(null);
        }
        //v.comprobarVerificacion()?this.setExpiracion(LocalDate.now().plusYears(1)):this.setExpiracion(null);
        //his.getVehiculo().comprobarVerificacion()?this.setExpiracion(LocalDate.now().plusYears(1)):this.setExpiracion(null);
    }
}
