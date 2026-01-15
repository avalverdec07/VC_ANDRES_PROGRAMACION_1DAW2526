package UT04.Apdo11.Ejercicio3;

public class Pedido {
	Cliente cliente;
	Producto articulo1;
	Producto articulo2;
	Producto articulo3;
	
	public Pedido(Cliente cliente, Producto articulo1, Producto articulo2, Producto articulo3) {
		this.cliente = cliente;
		this.articulo1 = articulo1;
		this.articulo2 = articulo2;
		this.articulo3 = articulo3;
	}
	
	
	public void mostrarTicket() {
		System.out.println("----- Ticket del pedido:");
		
		System.out.println("DATOS DEL CLIENTE: ");
		System.out.println(cliente.toString());
		
		System.out.println("DATOS DEL PEDIDO: ");

		System.out.println("DATOS DEL PRIMER ARTÍCULO:");
		System.out.println(articulo1.toString());

		System.out.println("DATOS DEL SEGUNDO ARTÍCULO:");
		System.out.println(articulo2.toString());

		System.out.println("DATOS DEL TERCER ARTÍCULO:");
		System.out.println(articulo3.toString());

		System.out.println("TOTAL: "+(articulo1.getPrecio()+articulo2.getPrecio()+articulo3.getPrecio())+" €");
		
	}
	
	
	
	
}
