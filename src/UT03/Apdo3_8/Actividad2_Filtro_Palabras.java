package UT03.Apdo3_8;

import java.util.Scanner;

public class Actividad2_Filtro_Palabras {

	public static void main(String[] args) {
		/* 2. Filtro de palabras
			o Pide palabras al usuario en un bucle do-while.
			o Si la palabra contiene “x”, usa continue para no mostrarla.
			o Termina cuando el usuario escriba “salir”
		*/

		Scanner teclado = new Scanner(System.in);
		String palabra;
		do {
			System.out.println("Introduce una palabra... ");
			palabra=teclado.nextLine();
			/* Comprobamos: si la palabra contiene x mínuscula ó mayúscula -> continue
			   y nos saltamos la iteración actual y pasamos a la siguiente "vuelta del
			   bucle" 
			*/
			if ((palabra.contains("x"))||(palabra.contains("X"))){
					continue; //
			} 
			System.out.println("Tu palabra no contiene 'x' -> "+palabra);
		} while (!palabra.equals("salir"));
		System.out.println("Has introducido 'salir'... ¡adios!");
	}
}
