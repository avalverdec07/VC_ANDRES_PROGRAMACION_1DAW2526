package UT03;

import java.util.Scanner;

public class Actividad2_Apdo2_8 {

	public static void main(String[] args) {
		// Calcula el factorial de un número.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial: ");
		int numero = teclado.nextInt();
		int factorial=1;
		
		for (int n=1; n<=numero; n++) {
			factorial = factorial *n; 
		}
		System.out.println("El factorial de "+numero+" es igual a "+factorial);
	}
}
