package UT03.Apdo3_7;

import java.util.Scanner;

public class Actividad3_Apdo3_7 {

	
	public static int cuadrado(int n) {
		if (n<0) {
			// Si el número es negativo, devuelvo -1
			return -1;
		} else {
			return (n*n);
		}
	}
	
	public static void main(String[] args) {
		/* Ejercicio 3
		 * Diseña un método que reciba un número y devuelva su cuadrado, pero si el
		 * número es negativo, finalice el método con return y un mensaje de error.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su cuadrado: ");
		int n = teclado.nextInt();
		int resultado = cuadrado(n);
		if (resultado<0) {
			System.out.println("No se puede calcular el cuadrado de un número negativo. ");
		} else {
			System.out.println(resultado);
		}

	}

}
