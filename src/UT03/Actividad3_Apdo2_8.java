package UT03;

import java.util.Scanner;

public class Actividad3_Apdo2_8 {

	public static void main(String[] args) {
		// Pida números al usuario y calcula su suma hasta que introduzca 0,
		// usando un while
		int suma=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce números y calcularé la suma total "
				+ "(para terminar introduce un 0): ");
		int numero = teclado.nextInt();
		while (numero!=0) {
			suma= suma+numero;
			numero = teclado.nextInt();
		}
		System.out.println("La suma de todos los números introducidos es: "+suma);
		
		teclado.close();
	}

}
