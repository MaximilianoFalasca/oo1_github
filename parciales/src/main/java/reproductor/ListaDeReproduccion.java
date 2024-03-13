package reproductor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaDeReproduccion {
	private String nombre;
	private List<Cancion> canciones;
	
	public ListaDeReproduccion(String nombre) {
		this.nombre=nombre;
		canciones=new ArrayList<Cancion>();
	}
	
	public Cancion agregarCancion(Cancion cancion) {
		canciones.add(cancion);
		return cancion;
	}
	
	public void eliminarCancion(Cancion cancion) {
		canciones.remove(cancion);
	}
	
	public Album agregarAlbum(Album album) {
		album.getCanciones().stream().forEach(cancion->canciones.add(cancion));
		return album;
	}
	
	public void eliminarAlbum(Album album) {
		album.getCanciones().stream().forEach(cancion->canciones.remove(cancion));
	}
	
	public void reproducirCanciones(String orden) {
		List<Cancion> aux=new ArrayList<Cancion>(canciones);
		switch (orden) {
			case "orden inverso":
				for(int i=aux.size();i>0;i--) {
					aux.get(i).reproducir();
				}
				break;
			case "orden aleatorio":
				Random ran= new Random();
				while(aux.size()>0) {
					int pos=ran.nextInt(aux.size());
					Cancion cancion=aux.get(pos);
					cancion.reproducir();
					aux.remove(pos);
				}
				break;
			default:
				for(int i=0;i<=aux.size();i++) {
					aux.get(i).reproducir();
				}
		}
	}
	
	public String getNombre() {
		return nombre;
	}
}
