package ayed.ParcialJulio2023;

import ayed.tp02.ejercicio2.ListaEnlazadaGenerica;
import ayed.tp02.ejercicio2.ListaGenerica;
import ayed.tp06.ejercicio3.Arista;
import ayed.tp06.ejercicio3.Grafo;
import ayed.tp06.ejercicio3.GrafoImplListAdy;
import ayed.tp06.ejercicio3.Vertice;
import ayed.tp06.ejercicio3.VerticeImplListAdy;

public class ParcialTest {
	public Grafo<String> jugadores;
	public String delantero, arquero;
	private ListaGenerica<String> lista;
	
	public static void main(String[] args) {
		Grafo<String> jugadores=new GrafoImplListAdy<String>();
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
		
		
		String delantero=j11.dato();
		String arquero=j1.dato();
		
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
		jugadores.conectar(j9, j8, 23);
		jugadores.conectar(j6, j10, 17);
		jugadores.conectar(j6, j11, 14);
		jugadores.conectar(j8, j11, 18);
		
		ListaEnlazadaGenerica<String> lista=new ListaEnlazadaGenerica<String>();
		lista.agregarFinal(arquero);
		lista.agregarFinal(j5.dato());
		lista.agregarFinal(j9.dato());
		lista.agregarFinal(j8.dato());
		lista.agregarFinal(j11.dato());
		/*
		for(int i=1;i<=lista.tamanio();i++) {
			System.out.println(lista.elemento(i));
			Vertice<String> v = jugadores.vetice(i);
			ListaGenerica<Arista<String>> ady = jugadores.listaDeAdyacentes(v);
			System.out.println("dato:" + v.dato());
			ady.comenzar();
			while(!ady.fin()) {
				System.out.println(ady.proximo().peso());
			}
		}
		*/
		
		ParcialEquipo parcialEquipo=new ParcialEquipo();
		ListaGenerica<String> listaAux=parcialEquipo.tactica(jugadores, arquero, delantero, 0);
		
		for(int i=1;i<=lista.tamanio();i++) {
			System.out.println(lista.elemento(i));
		}
		System.out.println();
		for(int i=1;i<=lista.tamanio();i++) {
			System.out.println(listaAux.elemento(i));
		}
	}
}
