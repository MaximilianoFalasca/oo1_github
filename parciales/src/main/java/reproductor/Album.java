package reproductor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Album {
	private List<Cancion> canciones;
	private String nombre;
	private LocalDate fecha;
	
	public Album(String nombre,LocalDate fecha) {
		this.nombre=nombre;
		this.fecha=fecha;
		canciones=new ArrayList<Cancion>();
	}
	
	public Cancion agregarCancion(String titulo,String genero,Double duracion,Artista artista) {
		Cancion cancion=new Cancion(titulo,genero,duracion,artista);
		canciones.add(cancion);
		return cancion;
	}
	
	public List<Cancion> getCanciones(){
		return canciones;
	}
}
