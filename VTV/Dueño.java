package VTV;

import java.util.Scanner;

public class Dueño {
	private Vehiculo vehiculo;
	private Double plata;
	private int dni;
	
	public Dueño(Vehiculo vehiculo, Double plata, int dni) {
		this.vehiculo = vehiculo;
		this.plata=plata;
		this.dni=dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Double getPlata() {
		return plata;
	}

	public void setPlata(Double plata) {
		this.plata = plata;
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
