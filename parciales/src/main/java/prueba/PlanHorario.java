package prueba;

import java.util.List;

abstract class PlanHorario implements Plan{
	 public Double aplicarDescuentosOBonificaciones(List<Llamada> llamadas) {
		 return getDescuento();
	 }
	 
	 abstract Double getDescuento();
}
