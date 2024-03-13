package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.Comparator;

public class ComparadorDeUsuarios implements Comparator<Usuario>{

	@Override
	public int compare(Usuario o1, Usuario o2) {
		Double saldo1=o1.getSaldo();
		Double saldo2=o2.getSaldo();
		int comparacion=0;
		if(saldo1>saldo2) {
			comparacion=-1;
		}else if(saldo2>saldo1){
			comparacion=1;
		}
		return comparacion;
	}

}
