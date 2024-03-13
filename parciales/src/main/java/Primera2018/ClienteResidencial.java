package Primera2018;

public class ClienteResidencial extends Cliente{
	private String apellido;
	
	public ClienteResidencial(String nombre,String direccion,String apellido) {
		super(nombre,direccion);
		this.apellido=apellido;
	}
}
