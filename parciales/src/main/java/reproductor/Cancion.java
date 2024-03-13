package reproductor;

public class Cancion {
	private String titulo,genero;
	private Artista artista;
	private Double duracion;
	
	public Cancion(String titulo,String genero,Double duracion,Artista artista) {
		this.artista=artista;
		this.duracion=duracion;
		this.genero=genero;
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void reproducir() {
		System.out.println("reproduciendo cancion...");
	}
}
