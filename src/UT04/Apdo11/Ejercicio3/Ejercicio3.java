package UT04.Apdo11.Ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {

		
		Producto p1 = new Producto("Camiseta", 15, "Levi's", "Manga corta.");
		Producto p2 = new Producto("Vaqueros", 100, "Levi's", "Negro lavado.");
		Producto p3 = new Producto("Sudadera", 79.99, "Adidas", "Imitación china.");
		
		Cliente andres = new Cliente("Andres", "77777777X","Calle IES Augustobriga", 666666666);
				
				
		Pedido pedidoAndres = new Pedido(andres, p1, p2, p3);
		
		
		pedidoAndres.mostrarTicket();
		
		
		
	}

}
