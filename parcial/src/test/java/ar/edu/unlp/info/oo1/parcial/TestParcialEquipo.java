package ar.edu.unlp.info.oo1.parcial;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ayed.ParcialJulio2023.ParcialEquipo;
import ayed.tp02.ejercicio2.ListaGenerica;
import ayed.tp06.ejercicio3.Grafo;
import ayed.tp06.ejercicio3.GrafoImplListAdy;
import ayed.tp06.ejercicio3.Vertice;
import ayed.tp06.ejercicio3.VerticeImplListAdy;

public class TestParcialEquipo {
	private Grafo<String> jugadores;
	private String delantero, arquero;
	private ListaGenerica<String> lista;
	@BeforeEach
	public void setUp() {
		jugadores=new GrafoImplListAdy<String>();
		Vertice<String> j1= new VerticeImplListAdy<String>("arq");
		Vertice<String> j2= new VerticeImplListAdy<String>("def1");
		Vertice<String> j3= new VerticeImplListAdy<String>("def2");
		Vertice<String> j4= new VerticeImplListAdy<String>("def3");
		Vertice<String> j5= new VerticeImplListAdy<String>("def4");
		Vertice<String> j6= new VerticeImplListAdy<String>("mc1");
		Vertice<String> j7= new VerticeImplListAdy<String>("mc2");
		Vertice<String> j8= new VerticeImplListAdy<String>("mc3");
		Vertice<String> j9= new VerticeImplListAdy<String>("mc4");
		Vertice<String> j10= new VerticeImplListAdy<String>("d1");
		Vertice<String> j11= new VerticeImplListAdy<String>("d2");
		
		delantero=j11.dato();
		arquero=j1.dato();
		
		jugadores.agregarVertice(j1);
		jugadores.agregarVertice(j2);
		jugadores.agregarVertice(j3);
		jugadores.agregarVertice(j4);
		jugadores.agregarVertice(j6);
		jugadores.agregarVertice(j5);
		jugadores.agregarVertice(j7);
		jugadores.agregarVertice(j8);
		jugadores.agregarVertice(j9);
		jugadores.agregarVertice(j10);
		jugadores.agregarVertice(j11);
		
		jugadores.conectar(j1, j2, 5);
		jugadores.conectar(j1, j3, 4);
		jugadores.conectar(j1, j4, 10);
		jugadores.conectar(j1, j5, 7);
		jugadores.conectar(j2, j6, 5);
		jugadores.conectar(j2, j7, 6);
		jugadores.conectar(j3, j7, 3);
		jugadores.conectar(j3, j8, 1);
		jugadores.conectar(j4, j8, 2);
		jugadores.conectar(j4, j9, 11);
		jugadores.conectar(j5, j9, 4);
		jugadores.conectar(j6, j10, 17);
		jugadores.conectar(j6, j11, 14);
		jugadores.conectar(j8, j11, 16);
	}
	
	@Test
	private void testTactica() {
		ParcialEquipo parcialEquipo=new ParcialEquipo();
		ListaGenerica<String> listaAux=parcialEquipo.tactica(jugadores, arquero, delantero, 0);
		for(int i=0;i<=lista.tamanio();i++) {
			assertTrue(lista.elemento(i).equals(listaAux.elemento(i)));
		}
	}
}
