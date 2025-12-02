package UT03.FichaEjercicios;

import java.util.Scanner;

/*
 * 	Realizar un programa que acepte dos números enteros por teclado. 
 *  continuación, muestre un menú de operaciones a realizar con los 
 *  dos números. Estas operaciones serán: suma, resta, multiplicación y 
 *  división. Se indicará la letra correspondiente la operación (S,R,M y D).
 *  Se mostrará por pantalla el resultado de la operación elegida.
 */

/**
 * @author Andrés.
 * @version 1.0
 * 
 */

public class Ej18_MenuOperaciones {

	public static void main(String[] args) {

		int num1, num2;
		char opcion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		teclado.nextLine();
		
		/* Mostramos un menú con un bucle.
		 * Utilizo un bucle do-while y como condición de salida de bucle
		 * será F(Fin).
		 */
		
		do {
			System.out.println("--- MENÚ ---");
			System.out.println("S = SUMA");
			System.out.println("R = RESTA");
			System.out.println("M = MULTIPLICACIÓN");
			System.out.println("D = DIVISIÓN");
			System.out.println("F = FIN");
			
			
			
			opcion = teclado.nextLine().charAt(0);
			
			
			
		} while ( opcion!='F' && opcion!='f');
		
		
		
	}

}
