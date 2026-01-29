package UT05.Arrays;

public class DiferenciaFor_ForEach {

	public static void main(String[] args) {
		
		double[] precios = {12.50, 23.99, 5.00, 99.90};
		
		for (int i=0; i<precios.length;i++) {
			System.out.println("La posición "+i+" del array contiene: ");
			System.out.println(precios[i]);
		}
		
		System.out.println();
		System.out.println("Bucle recorrido con for-each");
		
		for (double i : precios) {
		    // En cada vuelta, 'precio' toma automáticamente el valor siguiente
		  System.out.println(i);   
		}
		//System.out.println("Total a pagar: " + total + "€");
	}

}
