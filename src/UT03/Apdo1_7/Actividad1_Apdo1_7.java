package UT03.Apdo1_7;
import java.util.Scanner;

public class Actividad1_Apdo1_7 {

	public static void main(String[] args) {
		/* Escribe un programa que pida un número y diga si es positivo, 
		* negativo o cero. */

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		
		if (numero>0) {
			System.out.println("El número introducido es positivo.");
		} else if (numero==0) {
			System.out.println("El número introducido es igual a 0.");
		} else if (numero<0) {
			System.out.println("El número introducido es negativo.");
		}
		
		
		teclado.close();
	}

}
