package reproductor;

import java.util.ArrayList;
import java.util.List;

public class ReproductorDeMusica {
	private List<Cliente> clientes;
	private List<Artista> artistas;
	
	public ReproductorDeMusica() {
		clientes=new ArrayList<Cliente>();
		artistas=new ArrayList<Artista>();
	}
	
	public Cliente altaCliente(String nombre,String clave,String correo) {
		Cliente cliente=new Cliente(nombre,clave,correo);
		clientes.add(cliente);
		return cliente;
	}
	
	public Artista altaArtista(String nombre) {
		Artista artista=new Artista(nombre);
		artistas.add(artista);
		return artista;
	}
	
	public Cancion buscarCancion(String titulo) {
		return artistas.stream().flatMap(artista->artista.getCanciones().stream()) //collect all songs
					.filter(cancion->cancion.getTitulo().equals(titulo)) //filter for title
					.findFirst().orElse(null); //collect first song or return null
	}
	
	public void reproducirPorLista(ListaDeReproduccion lista,String orden) {
		lista.reproducirCanciones(orden);
	}
	
	public void reproducirPorCancion(String nombre) {
		buscarCancion(nombre).reproducir();
	}
	
}
