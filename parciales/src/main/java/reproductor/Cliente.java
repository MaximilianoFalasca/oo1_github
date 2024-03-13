package reproductor;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre,clave,correo;
	private List<ListaDeReproduccion> listasPersonalizadas;
	private List<Artista> artistasSeguidos;
	
	public Cliente(String nombre,String clave,String correo) {
		this.nombre=nombre;
		this.clave=clave;
		this.correo=correo;
		listasPersonalizadas=new ArrayList<ListaDeReproduccion>();
		artistasSeguidos=new ArrayList<Artista>();
	}
	
	public ListaDeReproduccion crearListaPersonalizada(String nombre){
		ListaDeReproduccion lista= new ListaDeReproduccion(nombre);
		listasPersonalizadas.add(lista);
		return lista;
	}
	
	public ListaDeReproduccion guardarListaPersonalizada(ListaDeReproduccion lista){
		listasPersonalizadas.add(lista);
		return lista;
	}
	
	public void seguirArtista(Artista artista) {
		artistasSeguidos.add(artista);
	}
	
	public ListaDeReproduccion getLista(String nombre) {
		return listasPersonalizadas.stream().filter(lista->lista.getNombre().equals(nombre)).findFirst().orElse(null);
	}
}
