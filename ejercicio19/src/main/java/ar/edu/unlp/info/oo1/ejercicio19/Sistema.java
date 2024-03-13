package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sistema {
	private ArrayList<Vendedor> vendedores;
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;
	private ArrayList<Pedido> pedidos;
	private ArrayList<FormaDePago> formasDePago;
	private ArrayList<MecanismoDeEnvio> mecanismosDeEnvio;
	
	public Sistema() {
		vendedores=new ArrayList();
		clientes=new ArrayList();
		productos=new ArrayList();
		pedidos=new ArrayList();
		
		// Agregar formas de pago
        formasDePago.add(new FormaAlContado());
        formasDePago.add(new Forma6Cuotas());

        // Agregar mecanismos de envío
        mecanismosDeEnvio.add(new RetirarEnComercio());
        mecanismosDeEnvio.add(new RetirarEnSucursalCorreo());
        mecanismosDeEnvio.add(new ExpressADomicilio());
	}
	
	public Vendedor registrarVendedor(String nombre, String direccion) {
		Vendedor vendedor= new Vendedor(nombre,direccion);
		vendedores.add(vendedor);
		return vendedores.get(-1);
	}
	
	public Vendedor buscarVendedor(String nombre) {
		Vendedor vendedor=vendedores.stream().filter(vendedor1->vendedor1.getNombre().equals(nombre)).findFirst().orElse(null);
		return vendedor;
	}
	
	public Cliente registrarCliente(String nombre,String direccion) {
		Cliente cliente= new Cliente(nombre, direccion);
		clientes.add(cliente);
		return clientes.get(-1);
	}
	
	public Cliente buscarCliente(String nombre) {
		Cliente cliente=clientes.stream().filter(a->a.getNombre().equals(nombre)).findFirst().orElse(null);
		return cliente;
	}
	
	public Producto ponerProductoALaVenta(Producto producto) {
		productos.add(producto);
		return productos.get(-1);
	}
	
	public ArrayList<Producto> buscarProducto(String nombre) {
		ArrayList<Producto> aux = new ArrayList();
		List<Producto> lista=productos.stream().filter(a->a.getNombre().equals(nombre)).collect(Collectors.toList());
		aux.addAll(lista);
		return aux;
	}
	
	/*
	public ArrayList<Producto> buscarProducto(String nombre) {
		ArrayList<Producto> aux = new ArrayList();
		for (Producto producto : productos) {
			if(producto.getNombre().equals(nombre)) {
				aux.add(producto);
			}
		}
		return aux;
	}
	*/
	
	public void crearPedido(Cliente cliente, Producto producto, Integer cantidad, String formaDePago, String mecanismoDeEnvio) {
        MecanismoDeEnvio envio = buscarMecanismoDeEnvioPorNombre(mecanismoDeEnvio);
        FormaDePago pago= buscarFormaDePagoPorNombre(formaDePago);
        
        if (envio != null && producto.getCantUnidades() >= cantidad) {
            pedidos.add(new Pedido(cliente, producto, cantidad, pago, envio));
            producto.setUnidades(-cantidad);
        } else {
            System.out.println("Pedido no válido: mecanismo de envío o cantidad incorrectos.");
        }
    }
	
	private FormaDePago buscarFormaDePagoPorNombre(String nombre) {
		for(FormaDePago forma : formasDePago) {
			if(forma.getNombre().equals(nombre)) {
				return forma;
			}
		}
		return null;
	}
	
	private MecanismoDeEnvio buscarMecanismoDeEnvioPorNombre(String nombre) {
		
	}
}
