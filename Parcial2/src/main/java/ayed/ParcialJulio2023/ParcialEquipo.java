package ayed.ParcialJulio2023;

import ayed.tp02.ejercicio2.ListaEnlazadaGenerica;
import ayed.tp02.ejercicio2.ListaGenerica;
import ayed.tp06.ejercicio3.Arista;
import ayed.tp06.ejercicio3.Grafo;
import ayed.tp06.ejercicio3.Vertice;

public class ParcialEquipo {

	public ParcialEquipo() {
		
	}
	
	public ListaGenerica<String> tactica(Grafo<String> jugadores, String arquero,String delantero, double potencia){
		boolean []marca=new boolean[jugadores.listaDeVertices().tamanio()+1];
		ListaEnlazadaGenerica<String> lista=new ListaEnlazadaGenerica<String>();
		ListaEnlazadaGenerica<String> listaAux=new ListaEnlazadaGenerica<String>();
		ListaGenerica<Vertice<String>> all = jugadores.listaDeVertices();
		int pos=-1;
		PotenciaTotal potenciaTotal=new PotenciaTotal();
		double potenciaAct=0;
		int cantAux=0;
		all.comenzar();
		while(!all.fin()) {
			Vertice<String> v=all.proximo();
			if(v.dato().equals(delantero)) {
				pos=v.getPosicion();
			}
		}
		if(pos!=-1) {
			tactica(jugadores,delantero,pos,lista,listaAux,marca,potenciaTotal,potenciaAct,cantAux);
		}
		return lista;
	}
	
	private void tactica(Grafo<String> jugadores, String delantero,int pos,ListaGenerica<String> lista,ListaGenerica<String> listaAux,boolean []marca,PotenciaTotal potenciaTotal,double potenciaAct,int cantAux) {
		marca[pos]=true;
		Vertice<String>v=jugadores.listaDeVertices().elemento(pos);
		if(v.dato().equals(delantero) && (potenciaTotal.getPotencia()>potenciaAct/cantAux)) {
			potenciaTotal.setPotencia(potenciaAct);;
			cambiarLista(lista,listaAux);
		}
		if(lista.esVacia()) {
			ListaGenerica<Arista<String>> ady=jugadores.listaDeAdyacentes(v);
			ady.comenzar();
			while(!ady.fin() && lista.esVacia()) {
				Arista<String>a=ady.proximo();
				cantAux++;
				potenciaAct+=a.peso();
				tactica(jugadores,delantero,a.verticeDestino().getPosicion(),lista,listaAux,marca,potenciaTotal,potenciaAct,cantAux);
				potenciaAct-=a.peso();
				cantAux--;
			}
		}
	}
	
	private void cambiarLista(ListaGenerica<String> lista,ListaGenerica<String> listaAux) {
		listaAux.comenzar();
		while(!listaAux.fin()) {
			lista.agregarFinal(listaAux.proximo());
		}
	}
}
