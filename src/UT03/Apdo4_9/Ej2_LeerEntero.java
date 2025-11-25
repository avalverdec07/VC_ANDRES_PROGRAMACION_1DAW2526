package UT03.Apdo4_9;

import java.util.InputMismatchException;

/**
 * @author Andrés Valverde
 * @version 1.0
 */


import java.util.Scanner;

/*
 * Crea un método leerEntero() que pida un número por teclado y lance una
 * excepción si el usuario introduce texto en lugar de número
 * (InputMismatchException).
 */
public class Ej2_LeerEntero {
	static Scanner teclado = new Scanner(System.in);

	public static void leerEntero() {

		System.out.println("Introduce un número entero: ");
		int numero = teclado.nextInt();
		
	}
		
	public static void main(String[] args) {
		try {
			leerEntero();
		}catch(InputMismatchException error) {
			System.out.println("Por favor, introduce un número entero.");
		} finally {
			teclado.close();
		}
	}
}
