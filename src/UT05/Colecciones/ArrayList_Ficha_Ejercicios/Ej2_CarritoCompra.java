package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ej2_CarritoCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Double> precios = new ArrayList<>();
	
	precios.add(12.50); // posición 0 del ArrayList
	precios.add(23.55);
	precios.add(9.99);
	
	precios.add(0, 45.00);
	
	double total=0;
	
	for(Double precio : precios) {
		total+=precio;
	}
	
	System.out.printf("El total de la compra asciende a %.2f euros.",total);
	
	
	
	
	
	
	}
	
	
	

}
