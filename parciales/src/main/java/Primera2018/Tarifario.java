package Primera2018;

public class Tarifario {
	private Double precioResidencial,precioIndustrial;
	
	public Tarifario(Double p1,Double p2) {
		precioIndustrial=p2;
		precioResidencial=p1;
	}
	
	public Double getPrecioResidencial() {
		return precioResidencial;
	}
	
	public Double getPrecioIndustrial() {
		return precioIndustrial;
	}
	
	public void actualizarPrecios(Double precioR,Double precioI) {
		precioResidencial=precioR;
		precioIndustrial=precioI;
	}
}
