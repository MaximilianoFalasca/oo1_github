package reproductor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artista {
	private List<Album> albumes;
	private String nombre;
	
	public Artista(String nombre) {
		this.nombre=nombre;
		albumes=new ArrayList<Album>();
	}

	public Album agregarAlbum(String nombre) {
		Album album=new Album(nombre,LocalDate.now());
		albumes.add(album);
		return album;
	}
	
	public List<Cancion> getCanciones(){
		List<Cancion> allCanciones= new ArrayList<Cancion>();
		albumes.stream().forEach(album->allCanciones.addAll(album.getCanciones()));
		return allCanciones;
	}
}
