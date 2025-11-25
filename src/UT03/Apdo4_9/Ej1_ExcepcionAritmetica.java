package UT03.Apdo4_9;

import java.util.Scanner;

/*
 * Escribe un programa que pida dos números y muestre su división.
 * Captura la excepción ArithmeticException si el divisor es cero.
 */
public class Ej1_ExcepcionAritmetica {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el cociente: ");
		int cociente = teclado.nextInt();
		System.out.println("Introduce el divisor: ");
		int divisor = teclado.nextInt();
		
		try {
			System.out.println("El resultado de "+cociente+" dividido por "
								+ divisor + " es: "+cociente/divisor);
		}catch(ArithmeticException error) {
			System.out.println("Error: "+error.getMessage());
		}
		teclado.close();		
	}
}
