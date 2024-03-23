package VTV;

import java.util.Scanner;

public class Dueño {
	private Vehiculo vehiculo;
	
	public Dueño(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public Verificacion elegirVerificacion() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresar tipo de verificacion: (Normal, Rapida)");
		String tipoVerificacion=s.next();
		Verificacion verificacion=null;
		while(verificacion==null) {
			switch (tipoVerificacion) {
				case "Normal": 
					verificacion= new VerificacionNormal(vehiculo);
					break;
				case "Rapida":
					verificacion= new VerificacionRapida(vehiculo);
					break;
				default:
					System.out.println("Ingresar tipo de verificacion: (Normal, Rapida)");
					tipoVerificacion=s.next();
			}
		}
		s.close();
		return verificacion;
	}
}
