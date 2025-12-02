package UT03.FichaEjercicios;

import java.util.Scanner;
/*Escribir un programa que indique cuántas cifras tiene un número entero introducido por
 * teclado, que estará comprendido entre 0 y 99999.
 */

public class Ej07_Cifras {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero=teclado.nextInt();
		int cifras=1;
		while(numero>10) {
			numero=numero/10;
			cifras++;
		}
		System.out.println("El número tiene "+cifras+" cifras.");
		teclado.close();
	}
}
