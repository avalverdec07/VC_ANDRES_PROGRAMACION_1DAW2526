package UT03.Apdo2_9;

import java.util.Scanner;

public class Actividad1_Apdo2_9 {

	public static void main(String[] args) {
		/* Tabla de multiplicar:
		 * Pide un número al usuario e imprime su tabla del 1 al 10 con un for.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		
		System.out.println("Introduce un número para calcular su tabla de multiplicar: ");
		numero=teclado.nextInt();
		System.out.println("La tabla del mutliplicar del "+numero+" es la siguiente: ");
		for (int i=1; i<=10; i++) {
			System.out.println(numero+" x "+i+" es igual a "+numero*i);
		}
		
		
		
		
		teclado.close();

	}

}
