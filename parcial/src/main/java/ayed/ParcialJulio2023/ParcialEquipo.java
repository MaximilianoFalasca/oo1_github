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
		PotenciaTotal potenciaAct=new PotenciaTotal();
		int cantAux=0;
		all.comenzar();
		while(!all.fin()) {
			Vertice<String> v=all.proximo();
			if(v.dato().equals(arquero)) {
				pos=v.getPosicion();
				listaAux.agregarFinal(arquero);
			}
		}
		if(pos!=-1) {
			tactica(jugadores,delantero,pos,lista,listaAux,marca,potenciaTotal,potenciaAct,cantAux);
		}
		return lista;
	}
	
	private void tactica(Grafo<String> jugadores, String delantero,int pos,ListaGenerica<String> lista,ListaGenerica<String> listaAux,boolean []marca,PotenciaTotal potenciaTotal,PotenciaTotal potenciaAct,int cantAux) {
		marca[pos]=true;
		cantAux++;
		Vertice<String>v=jugadores.listaDeVertices().elemento(pos);
		if(v.dato().equals(delantero) && (potenciaTotal.getPotencia()<potenciaAct.getPotencia()/cantAux)) {
			potenciaTotal.setPotencia(potenciaAct.getPotencia()/cantAux);
			cambiarLista(lista,listaAux);
		}
		//acordate que no siempre verificamos que la lista.esVacia() solo lo hacemos cuando no queremos seguir verificando caminos y con el primero nos alcanza
			ListaGenerica<Arista<String>> ady=jugadores.listaDeAdyacentes(v);
			ady.comenzar();
			
			while(!ady.fin()) {
				Arista<String>a=ady.proximo();
				potenciaAct.setPotencia(potenciaAct.getPotencia()+a.peso());
				listaAux.agregarFinal(a.verticeDestino().dato());
				tactica(jugadores,delantero,a.verticeDestino().getPosicion(),lista,listaAux,marca,potenciaTotal,potenciaAct,cantAux);
				listaAux.eliminarEn(listaAux.tamanio()-1);
				potenciaAct.setPotencia(-(potenciaAct.getPotencia()+a.peso()));
		}
	}
	
	private void cambiarLista(ListaGenerica<String> lista,ListaGenerica<String> listaAux) {
		lista.comenzar();
		while(!lista.fin()) {
			lista.eliminar(lista.proximo());
		}
		listaAux.comenzar();
		while(!listaAux.fin()) {
			String p=listaAux.proximo();
			lista.agregarFinal(p);
		}
	}
}
